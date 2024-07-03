/*
 * Copyright 2023 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.service.graph.converter;

import org.secretflow.secretpad.common.enums.PlatformTypeEnum;
import org.secretflow.secretpad.common.util.JsonUtils;
import org.secretflow.secretpad.common.util.ProtoUtils;
import org.secretflow.secretpad.persistence.entity.ProjectGraphNodeKusciaParamsDO;
import org.secretflow.secretpad.persistence.entity.ProjectTaskDO;
import org.secretflow.secretpad.persistence.repository.ProjectGraphNodeKusciaParamsRepository;
import org.secretflow.secretpad.persistence.repository.ProjectJobTaskRepository;
import org.secretflow.secretpad.service.constant.JobConstants;
import org.secretflow.secretpad.service.graph.GraphContext;
import org.secretflow.secretpad.service.model.graph.GraphNodeInfo;
import org.secretflow.secretpad.service.model.graph.ProjectJob;
import org.secretflow.secretpad.service.util.JobUtils;

import com.google.protobuf.util.JsonFormat;
import com.secretflow.spec.v1.IndividualTable;
import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.secretflow.proto.component.Cluster;
import org.secretflow.proto.kuscia.TaskConfig;
import org.secretflow.proto.pipeline.Pipeline;
import org.secretflow.v1alpha1.kusciaapi.Job;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

import static org.secretflow.secretpad.service.constant.ComponentConstants.CHECKPOINT_PRE;

/**
 * Job converter for message in apiLite
 *
 * @author yansi
 * @date 2023/5/30
 */
@Slf4j
@Component
@ConfigurationProperties(prefix = "sfcluster-desc")
public class KusciaJobConverter implements JobConverter {
    private final static String DEFAULTDS = "default-data-source";
    @Value("${job.max-parallelism:1}")
    @Getter
    private int maxParallelism;
    private static String crossSiloCommBackend;

    @Value("${secretpad.platform-type}")
    private String plaformType;

    @Resource
    private ProjectGraphNodeKusciaParamsRepository projectGraphNodeKusciaParamsRepository;

    @Resource
    private ProjectJobTaskRepository taskRepository;

    @Value("${secretpad.node-id}")
    private String localNodeId;

    @SuppressWarnings("unused")
    @Value("${sfcluster-desc.ray-fed-config.cross-silo-comm-backend:brpc_link}")
    private void setCrossSiloCommBackend(String crossSiloCommBackend) {
        KusciaJobConverter.crossSiloCommBackend = crossSiloCommBackend;
    }

    private static Map<String, String> deviceConfig;

    public void setDeviceConfig(Map<String, String> deviceConfig) {
        KusciaJobConverter.deviceConfig = deviceConfig;
    }

    ThreadLocal<ProjectGraphNodeKusciaParamsDO> projectGraphNodeKusciaParamsDOThreadLocal = new ThreadLocal<>();

    /**
     * Converter create job request from project job
     *
     * @param job project job class
     * @return create job request message
     */
    public Job.CreateJobRequest converter(ProjectJob job) {
        List<ProjectJob.JobTask> tasks = job.getTasks();
        List<Job.Task> jobTasks = new ArrayList<>();
        String initiator = "";
        if (!CollectionUtils.isEmpty(tasks)) {
            for (ProjectJob.JobTask task : tasks) {
                String taskId = task.getTaskId();
                List<Job.Party> taskParties = new ArrayList<>();
                List<String> parties = task.getParties();
                if (!CollectionUtils.isEmpty(parties)) {
                    initiator = parties.get(0);
                    if (PlatformTypeEnum.AUTONOMY.equals(PlatformTypeEnum.valueOf(plaformType))) {
                        initiator = localNodeId;
                        log.info("KusciaJobConverter converter parties {} initiator {}", parties, initiator);
                    }
                    taskParties = parties.stream().map(party -> Job.Party.newBuilder().setDomainId(party).build()).collect(Collectors.toList());
                }

                ProjectGraphNodeKusciaParamsDO.UPK upk = new ProjectGraphNodeKusciaParamsDO.UPK(job.getProjectId(), job.getGraphId(), task.getNode().getGraphNodeId());
                projectGraphNodeKusciaParamsDOThreadLocal.set(ProjectGraphNodeKusciaParamsDO.builder().upk(upk).jobId(job.getJobId()).build());
                String taskInputConfig = renderTaskInputConfig(task);
                Job.Task.Builder jobTaskBuilder = Job.Task.newBuilder()
                        .setTaskId(taskId)
                        .setAlias(taskId)
                        .setAppImage(JobConstants.APP_IMAGE)
                        .addAllParties(taskParties)
                        .setTaskInputConfig(taskInputConfig);
                if (!CollectionUtils.isEmpty(task.getDependencies())) {
                    jobTaskBuilder.addAllDependencies(task.getDependencies());
                }
                jobTasks.add(jobTaskBuilder.build());
                projectGraphNodeKusciaParamsDOThreadLocal.remove();
            }
        }
        return Job.CreateJobRequest.newBuilder()
                .setJobId(job.getJobId())
                .setInitiator(initiator)
                .setMaxParallelism(job.getMaxParallelism())
                .addAllTasks(jobTasks)
                .build();
    }

    /**
     * Render task input config message from project job task
     *
     * @param task project job task
     * @return json string of task input config message
     */
    private String renderTaskInputConfig(ProjectJob.JobTask task) {
        GraphNodeInfo graphNode = task.getNode();
        Object nodeDef = graphNode.getNodeDef();
        List<String> inputs = graphNode.getInputs();
        List<String> outputs = graphNode.getOutputs();
        List<String> parties = task.getParties();
        JsonFormat.TypeRegistry typeRegistry = JsonFormat.TypeRegistry.newBuilder().add(IndividualTable.getDescriptor()).build();
        Pipeline.NodeDef pipelineNodeDef;
        if (nodeDef instanceof Pipeline.NodeDef) {
            pipelineNodeDef = (Pipeline.NodeDef) nodeDef;
        } else {
            Pipeline.NodeDef.Builder nodeDefBuilder = Pipeline.NodeDef.newBuilder();
            pipelineNodeDef = (Pipeline.NodeDef) ProtoUtils.fromObject(nodeDef, nodeDefBuilder);
        }
        if (GraphContext.isBreakpoint()) {
            String checkpointUri = "";
            List<ProjectTaskDO> latestTasks = taskRepository.findLastTimeTasks(Objects.requireNonNull(GraphContext.getProject()).getProjectId(), task.getNode().graphNodeId);
            if (!CollectionUtils.isEmpty(latestTasks) && latestTasks.size() == 2 && !ObjectUtils.isEmpty(latestTasks.get(1))) {
                ProjectTaskDO latestTask = latestTasks.get(1);
                List<String> lastTasksOutput = latestTask.getGraphNode().getOutputs();
                if (!lastTasksOutput.isEmpty()) {
                    checkpointUri = JobUtils.genTaskOutputId(CHECKPOINT_PRE + latestTask.getUpk().getJobId(), lastTasksOutput.get(0));
                    pipelineNodeDef = pipelineNodeDef.toBuilder().clearCheckpointUri().setCheckpointUri(checkpointUri).build();
                }
            }
            log.info("breakpoint task {} node {} checkpointUri {}", task.getTaskId(), task.getNode().graphNodeId, checkpointUri);
        } else {
            if (!CollectionUtils.isEmpty(outputs) && StringUtils.isNotEmpty(outputs.get(0))) {
                pipelineNodeDef = pipelineNodeDef.toBuilder().clearCheckpointUri().setCheckpointUri(CHECKPOINT_PRE + outputs.get(0)).build();
            }
        }
        Cluster.SFClusterDesc sfClusterDesc = buildSfClusterDesc(parties);
        TaskConfig.TaskInputConfig taskInputConfig = TaskConfig.TaskInputConfig.newBuilder()
                .putAllSfDatasourceConfig(defaultDatasourceConfig(parties))
                .addAllSfInputIds(inputs)
                .addAllSfOutputIds(outputs)
                .addAllSfOutputUris(outputs)
                .setSfClusterDesc(sfClusterDesc)
                .setSfNodeEvalParam(pipelineNodeDef)
                .build();
        ProjectGraphNodeKusciaParamsDO projectGraphNodeKusciaParamsDO = projectGraphNodeKusciaParamsDOThreadLocal.get();
        projectGraphNodeKusciaParamsDO.setTaskId(task.getTaskId());
        projectGraphNodeKusciaParamsDO.setInputs(JsonUtils.toJSONString(inputs));
        projectGraphNodeKusciaParamsDO.setOutputs(JsonUtils.toJSONString(outputs));
        projectGraphNodeKusciaParamsDO.setNodeEvalParam(ProtoUtils.toJsonString(pipelineNodeDef, typeRegistry));
        projectGraphNodeKusciaParamsRepository.saveAndFlush(projectGraphNodeKusciaParamsDO);
        return ProtoUtils.toJsonString(taskInputConfig, typeRegistry);
    }

    /**
     * Set default map of party and datasource config
     *
     * @param parties target parties
     * @return map of party and datasource config
     */
    public Map<String, TaskConfig.DatasourceConfig> defaultDatasourceConfig(List<String> parties) {
        TaskConfig.DatasourceConfig datasourceConfig = TaskConfig.DatasourceConfig.newBuilder()
                .setId(DEFAULTDS)
                .build();
        Map<String, TaskConfig.DatasourceConfig> datasourceConfigMap = new HashMap<>();
        for (String party : parties) {
            datasourceConfigMap.put(party, datasourceConfig);
        }
        return datasourceConfigMap;
    }

    public Cluster.SFClusterDesc buildSfClusterDesc(List<String> parties) {
        List<Cluster.SFClusterDesc.DeviceDesc> deviceDescs = new ArrayList<>();
        deviceConfig.forEach((key, value) -> {
            Cluster.SFClusterDesc.DeviceDesc deviceDesc = Cluster.SFClusterDesc.DeviceDesc.newBuilder()
                    .setType(key)
                    .setName(key)
                    .addAllParties(parties)
                    .setConfig(value)
                    .build();
            deviceDescs.add(deviceDesc);
        });
        Cluster.SFClusterDesc.RayFedConfig rayFedConfig = Cluster.SFClusterDesc.RayFedConfig.newBuilder()
                .setCrossSiloCommBackend(crossSiloCommBackend)
                .build();
        return Cluster.SFClusterDesc.newBuilder().addAllParties(parties).setRayFedConfig(rayFedConfig).addAllDevices(deviceDescs).build();
    }
}
