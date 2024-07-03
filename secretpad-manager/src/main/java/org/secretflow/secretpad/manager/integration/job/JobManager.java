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

package org.secretflow.secretpad.manager.integration.job;

import org.secretflow.secretpad.common.constant.CacheConstants;
import org.secretflow.secretpad.common.enums.PlatformTypeEnum;
import org.secretflow.secretpad.common.errorcode.DatatableErrorCode;
import org.secretflow.secretpad.common.errorcode.JobErrorCode;
import org.secretflow.secretpad.common.exception.SecretpadException;
import org.secretflow.secretpad.common.util.DateTimes;
import org.secretflow.secretpad.common.util.JsonUtils;
import org.secretflow.secretpad.common.util.ProtoUtils;
import org.secretflow.secretpad.manager.integration.datatable.AbstractDatatableManager;
import org.secretflow.secretpad.manager.integration.datatablegrant.DatatableGrantManager;
import org.secretflow.secretpad.manager.integration.job.event.JobSyncErrorOrCompletedEvent;
import org.secretflow.secretpad.manager.integration.model.DatatableDTO;
import org.secretflow.secretpad.manager.integration.model.ModelExportDTO;
import org.secretflow.secretpad.persistence.entity.*;
import org.secretflow.secretpad.persistence.model.*;
import org.secretflow.secretpad.persistence.repository.*;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import io.grpc.stub.StreamObserver;
import jakarta.annotation.Resource;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.secretflow.v1alpha1.common.Common;
import org.secretflow.v1alpha1.kusciaapi.Job;
import org.secretflow.v1alpha1.kusciaapi.JobServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.util.CollectionUtils;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.stream.Collectors;

import static org.secretflow.secretpad.common.constant.ComponentConstants.DATA_PREP_UNION;
import static org.secretflow.secretpad.manager.integration.model.Constants.*;

/**
 * Manager job operation
 *
 * @author yansi
 * @date 2023/5/23
 */
@Setter
public class JobManager extends AbstractJobManager {

    @Value("${secretpad.platform-type}")
    private String plaformType;

    @Value("${secretpad.node-id}")
    private String nodeId;
    private final static String DIST_DATA = "dist_data";
    private final static String PARTY_STATUS_FAILED = "Failed";
    private static final String PROJECT_ID = "project_id";
    private static final String PROJECT_JOB_ID = "projectJobId";
    private static final String PROJECT_JOB_TASK_ID = "projectJobTaskId";
    private static final String RESULT_TYPE = "resultType";
    private final static Logger LOGGER = LoggerFactory.getLogger(JobManager.class);
    private final ProjectJobRepository projectJobRepository;

    private final JobServiceGrpc.JobServiceBlockingStub jobStub;

    private final AbstractDatatableManager datatableManager;
    private final ProjectResultRepository resultRepository;
    private final ProjectFedTableRepository fedTableRepository;
    private final ProjectDatatableRepository datatableRepository;
    private final ProjectRuleRepository ruleRepository;
    private final ProjectModelRepository modelRepository;
    private final ProjectReportRepository reportRepository;
    private final TeeNodeDatatableManagementRepository managementRepository;
    private final ProjectReadDtaRepository readDtaRepository;
    private final ProjectJobTaskRepository taskRepository;
    @Resource
    private CacheManager cacheManager;
    @Resource
    private JobServiceGrpc.JobServiceStub jobServiceAsyncStub;
    @Resource
    private ApplicationEventPublisher applicationEventPublisher;
    @Resource
    private DatatableGrantManager datatableGrantManager;
    @Resource
    private ProjectNodeRepository projectNodeRepository;


    public JobManager(ProjectJobRepository projectJobRepository,
                      AbstractDatatableManager datatableManager,
                      ProjectResultRepository resultRepository,
                      ProjectFedTableRepository fedTableRepository,
                      ProjectDatatableRepository datatableRepository,
                      ProjectRuleRepository ruleRepository,
                      ProjectModelRepository modelRepository,
                      ProjectReportRepository reportRepository,
                      TeeNodeDatatableManagementRepository managementRepository,
                      JobServiceGrpc.JobServiceBlockingStub jobStub,
                      ProjectReadDtaRepository readDtaRepository,
                      ProjectJobTaskRepository taskRepository) {
        this.projectJobRepository = projectJobRepository;
        this.datatableManager = datatableManager;
        this.resultRepository = resultRepository;
        this.fedTableRepository = fedTableRepository;
        this.datatableRepository = datatableRepository;
        this.ruleRepository = ruleRepository;
        this.modelRepository = modelRepository;
        this.reportRepository = reportRepository;
        this.managementRepository = managementRepository;
        this.jobStub = jobStub;
        this.readDtaRepository = readDtaRepository;
        this.taskRepository = taskRepository;
    }

    private PlatformTypeEnum getPlaformType() {
        return PlatformTypeEnum.valueOf(plaformType);
    }

    /**
     * Start synchronized job
     * <p>
     * TODO: can be refactor to void watch(type, handler) ?
     */
    @Override
    public void startSync() {
        try {
            jobServiceAsyncStub.watchJob(Job.WatchJobRequest.newBuilder().build(), new StreamObserver<>() {
                        @Override
                        public void onNext(Job.WatchJobEventResponse responses) {
                            LOGGER.info("starter jobEvent ... {}", responses);
                            syncJob(responses);
                        }

                        @Override
                        public void onError(Throwable t) {
                            LOGGER.error("watchJob onError: {}", t.getMessage(), t);
                            applicationEventPublisher.publishEvent(new JobSyncErrorOrCompletedEvent(this));
                        }

                        @Override
                        public void onCompleted() {
                            LOGGER.info("======================================================== watchJob onCompleted");
                            applicationEventPublisher.publishEvent(new JobSyncErrorOrCompletedEvent(this));
                        }
                    }
            );
        } catch (Exception e) {
            LOGGER.error("startSync exception: {}, while restart", e.getMessage(), e);
        }
    }

    /**
     * Synchronize project job data via job event response
     *
     * @param it
     */
    public void syncJob(Job.WatchJobEventResponse it) {
        if (it.getType() == Job.EventType.UNRECOGNIZED || it.getType() == Job.EventType.ERROR) {
            // do nothing
            return;
        }
        LOGGER.info("watched jobEvent: jobId={}, jobState={}, task=[{}], endTime={}", it.getObject().getJobId(), it.getObject().getStatus().getState(),
                it.getObject().getStatus().getTasksList().stream().map(t -> String.format("taskId=%s,alias=%s,state=%s", t.getTaskId(), t.getAlias(), t.getState())).collect(Collectors.joining("|")),
                it.getObject().getStatus().getEndTime());
        // sync tee job first
        if (syncTeeJob(it)) {
            LOGGER.debug("tee job exist, sync tee job status");
            return;
        }
        //sync model export job
        if (syncModelExportJob(it)) {
            LOGGER.debug("model export job exist, sync model export job status");
            return;
        }
        Optional<ProjectJobDO> projectJobOpt = projectJobRepository.findByJobId(it.getObject().getJobId());
        if (projectJobOpt.isEmpty()) {
            LOGGER.info("watched jobEvent: jobId={}, but project job not exist, skip", it.getObject().getJobId());
            return;
        }
        if (projectJobOpt.get().isFinished()) {
            LOGGER.warn("watched jobEvent: jobId={}, but project job all task  finished, skip", it.getObject().getJobId());
            return;
        }
        ProjectJobDO job = updateJob(it, projectJobOpt.get());
        projectJobRepository.save(job);
    }

    /**
     * Synchronize result via taskDO
     *
     * @param taskDO
     */
    public void syncResult(ProjectTaskDO taskDO) {
        LOGGER.info("watched jobEvent: sync result {}", taskDO.toString());
        if (taskDO.getStatus() != GraphNodeTaskStatus.SUCCEED) {
            return;
        }
        List<String> parties = taskDO.getParties();
        if (CollectionUtils.isEmpty(parties)) {
            return;
        }
        List<DatatableDTO.NodeDatatableId> nodeDatatableIds = new ArrayList<>();
        Map<String, ProjectTaskDO.UPK> domainDataMap = new HashMap<>();
        ProjectGraphNodeDO graphNode = taskDO.getGraphNode();

        String jobId = taskDO.getUpk().getJobId();
        List<String> outputs = graphNode.getOutputs();
        if (!CollectionUtils.isEmpty(outputs)) {
            for (String output : outputs) {
                String domainDataId = String.format("%s-%s", jobId, output);
                nodeDatatableIds.addAll(parties.stream().map(party -> DatatableDTO.NodeDatatableId.from(party, domainDataId)).toList());
                domainDataMap.put(domainDataId, taskDO.getUpk());
                createDomainGrantByUnion(taskDO, domainDataId);
            }
        }
        if (PlatformTypeEnum.EDGE.equals(getPlaformType())) {
            // remove other nodes' result
            nodeDatatableIds.removeIf(next -> !nodeId.equals(next.getNodeId()));
        }
        LOGGER.info("look up nodeDatatableIds from kusciaapi, msg: {}", nodeDatatableIds);
        if (!CollectionUtils.isEmpty(nodeDatatableIds)) {
            Map<DatatableDTO.NodeDatatableId, DatatableDTO> datatableDTOMap = datatableManager.findByIds(nodeDatatableIds);
            LOGGER.info("looked up nodeDatatableIds from kusciaapi, datatableDTOMap size: {}", datatableDTOMap.size());
            datatableDTOMap.forEach((key, val) -> {
                String type = val.getType();
                String nodeId = key.getNodeId();
                String datatableId = val.getDatatableId();
                LOGGER.info("resolve {}", datatableId);
                ResultKind resultKind = ResultKind.fromDatatable(type);
                LOGGER.info("nodeDatatableIds type: {}", resultKind.toString());
                if (resultKind == null) {
                    throw SecretpadException.of(DatatableErrorCode.UNSUPPORTED_DATATABLE_TYPE, type);
                }
                ProjectTaskDO.UPK taskUpk = domainDataMap.get(datatableId);
                String projectId = taskUpk.getProjectId();
                ProjectResultDO resultDO = ProjectResultDO.builder()
                        .upk(new ProjectResultDO.UPK(projectId, resultKind, val.getNodeId(), datatableId))
                        .taskId(taskUpk.getTaskId())
                        .jobId(taskUpk.getJobId())
                        .build();
                resultRepository.save(resultDO);

                Map<String, String> attributes = val.getAttributes();
                String distData = null;
                if (!CollectionUtils.isEmpty(attributes) && attributes.containsKey(DIST_DATA)) {
                    distData = attributes.get(DIST_DATA);
                }
                switch (resultKind) {
                    case FedTable:
                        List<ProjectFedTableDO.JoinItem> joins = parties.stream().map(party -> new ProjectFedTableDO.JoinItem(party, datatableId)).collect(Collectors.toList());
                        ProjectFedTableDO fedTableDO = ProjectFedTableDO.builder()
                                .upk(new ProjectFedTableDO.UPK(projectId, datatableId))
                                .joins(joins)
                                .build();
                        ProjectDatatableDO datatableDO = ProjectDatatableDO.builder()
                                .upk(new ProjectDatatableDO.UPK(projectId, nodeId, datatableId))
                                .source(ProjectDatatableDO.ProjectDatatableSource.CREATED)
                                .tableConfig(DatatableDTO.toTableConfig(val.getSchema()))
                                .build();
                        datatableRepository.save(datatableDO);
                        fedTableRepository.save(fedTableDO);
                        break;
                    case Rule:
                        ProjectRuleDO ruleDO = ProjectRuleDO.builder()
                                .upk(new ProjectRuleDO.UPK(projectId, datatableId))
                                .build();
                        ruleRepository.save(ruleDO);
                        break;
                    case Model:
                        ProjectModelDO modelDO = ProjectModelDO.builder()
                                .upk(new ProjectModelDO.UPK(projectId, datatableId))
                                .build();
                        modelRepository.save(modelDO);
                        break;
                    case Report:
                        ProjectReportDO reportDO = ProjectReportDO.builder()
                                .upk(new ProjectReportDO.UPK(projectId, datatableId))
                                .content(distData)
                                .build();
                        reportRepository.save(reportDO);
                        break;
                    case READ_DATA:
                        // find this input id mack which task and use task output to judge
                        String inputId = taskDO.getGraphNode().getInputs().get(0);
                        String graphNodeId = inputId;
                        int i = graphNodeId.lastIndexOf("-");
                        graphNodeId = graphNodeId.substring(0, i);
                        i = graphNodeId.lastIndexOf("-");
                        graphNodeId = graphNodeId.substring(0, i);
                        LOGGER.debug("-- inputId {} graphNodeId {}", inputId, graphNodeId);
                        Optional<ProjectTaskDO> projectTaskDOOptional = taskRepository.findLatestTasks(projectId, graphNodeId);
                        if (projectTaskDOOptional.isEmpty()) {
                            throw SecretpadException.of(DatatableErrorCode.DATATABLE_NOT_EXISTS);
                        }
                        String taskId = projectTaskDOOptional.get().getUpk().getJobId();
                        String taskOutputId = genTaskOutputId(taskId, inputId);

                        ProjectReadDataDO projectReadDataDO = readDtaRepository.findByProjectIdAndOutputIdLaste(projectId, taskOutputId);
                        LOGGER.debug("readDataOptional aleady exist {} ", ObjectUtils.isEmpty(projectReadDataDO));
                        String raw = ObjectUtils.isEmpty(projectReadDataDO) ? null : projectReadDataDO.getRaw();
                        LOGGER.debug("projectReadDataDO.raw is {}", raw);
                        ProjectReadDataDO readDataDO;
                        Gson gson = new Gson();
                        JsonElement jsonElement = gson.fromJson(distData, JsonElement.class);
                        distData = gson.toJson(jsonElement.getAsJsonObject().getAsJsonObject("meta"));

                        String modelHash = jsonElement.getAsJsonObject().getAsJsonObject("meta").get("modelHash").getAsString();
                        String outPutId = taskDO.getUpk().getTaskId().substring(0, 4);
                        LOGGER.debug("read modelHash  {} task {} graphNodeId {} datatableId {}", modelHash, outPutId, taskDO.getGraphNodeId(), datatableId);

                        JsonArray jsonArray = new JsonArray();
                        if (ObjectUtils.isEmpty(projectReadDataDO)) {
                            jsonArray.add(distData);
                            jsonArray.add(distData);
                            readDataDO = ProjectReadDataDO.builder()
                                    .upk(new ProjectReadDataDO.UPK(projectId, datatableId))
                                    .content(gson.toJson(jsonArray))
                                    .raw(distData)
                                    .hash(modelHash)
                                    .task(outPutId)
                                    .grapNodeId(taskDO.getGraphNodeId())
                                    .outputId(taskOutputId)
                                    .build();
                        } else {
                            jsonArray.add(projectReadDataDO.getRaw());
                            jsonArray.add(distData);
                            LOGGER.debug("disData is :{}", distData);
                            LOGGER.debug("raw is {}", projectReadDataDO.getRaw());
                            readDataDO = ProjectReadDataDO.builder()
                                    .upk(new ProjectReadDataDO.UPK(projectId, datatableId))
                                    .content(gson.toJson(jsonArray))
                                    .raw(projectReadDataDO.getRaw())
                                    .hash(modelHash)
                                    .task(outPutId)
                                    .grapNodeId(taskDO.getGraphNodeId())
                                    .outputId(taskOutputId)
                                    .build();
                            readDataDO.setContent(gson.toJson(jsonArray));
                        }

                        readDtaRepository.save(readDataDO);
                        break;
                    default:
                        throw SecretpadException.of(DatatableErrorCode.UNSUPPORTED_DATATABLE_TYPE);
                }
            });
        }
    }


    /**
     * Update project job data via job event response
     *
     * @param it
     * @param projectJob
     * @return ProjectJobDO
     */
    public ProjectJobDO updateJob(Job.WatchJobEventResponse it, ProjectJobDO projectJob) {
        switch (it.getType()) {
            case DELETED:
                projectJob.stop();
                return projectJob;
            case ADDED:
            case MODIFIED:
                LOGGER.info("watched jobEvent: update job: it={}", ProtoUtils.toJsonString(it));
                Job.JobStatusDetail kusciaJobStatus = it.getObject().getStatus();
                // when the job state is finished but the end time is not set, we don't update, because that some task state may be not terminate state.
                if (!(isFinishedState(it.getObject().getStatus().getState()) && Strings.isNullOrEmpty(it.getObject().getStatus().getEndTime()))) {
                    projectJob.setStatus(GraphJobStatus.formKusciaJobStatus(kusciaJobStatus.getState()));
                    projectJob.setErrMsg(kusciaJobStatus.getErrMsg());
                }
                if (!Strings.isNullOrEmpty(it.getObject().getStatus().getEndTime())) {
                    projectJob.setFinishedTime(DateTimes.utcFromRfc3339(it.getObject().getStatus().getEndTime()));
                }
                LOGGER.info("watched jobEvent: each job status");
                Map<String, Job.TaskStatus> map = new HashMap<>();
                kusciaJobStatus.getTasksList().forEach(kusciaTaskStatus -> {
                            LOGGER.info("watched jobEvent: kuscia status {}", kusciaTaskStatus.toString());
                            String rawTaskId = kusciaTaskStatus.getAlias();
                            String taskId = removeContentAfterUnderscore(kusciaTaskStatus.getAlias(), map, kusciaTaskStatus);
                            ProjectTaskDO task = projectJob.getTasks().get(taskId);
                            if (ObjectUtils.isEmpty(task)) {
                                LOGGER.error("watched jobEvent: jobId={} taskId={} secretpad not exist but kuscia exist, now just skip", projectJob.getUpk().getJobId(), taskId);
                                return;
                            }
                            kusciaTaskStatus = mergeKusciaTaskStatus(rawTaskId, taskId, map, kusciaTaskStatus);
                            GraphNodeTaskStatus currentTaskStatus = GraphNodeTaskStatus.formKusciaTaskStatus(kusciaTaskStatus.getState());
                            LOGGER.info("watched jobEvent: kuscia status {} {} {}", taskId, currentTaskStatus, kusciaTaskStatus);
                            projectJob.transformTaskStatus(taskId, currentTaskStatus, currentTaskStatus == GraphNodeTaskStatus.FAILED ? taskFailedReason(kusciaTaskStatus) : null);
                            task.setStatus(GraphNodeTaskStatus.formKusciaTaskStatus(kusciaTaskStatus.getState()));
                            task.setErrMsg(kusciaTaskStatus.getErrMsg());
                            syncResult(task);
                        }
                );
                return projectJob;
            default:
                LOGGER.error("job sync find unknown type {}", it.getType());
                return null;
        }
    }

    private void syncTeeResult(TeeNodeDatatableManagementDO managementDO) {
        // only pull job need to sync result
        LOGGER.info("watched jobEvent: sync tee result {}", managementDO.toString());
        if (!managementDO.getKind().equals(TeeJobKind.Pull)) {
            return;
        }
        String operateInfo = managementDO.getOperateInfo();
        Map<String, String> operateInfoMap = JsonUtils.toJavaMap(operateInfo, String.class);
        String projectId = operateInfoMap.get(PROJECT_ID);
        String projectJobId = operateInfoMap.get(PROJECT_JOB_ID);
        String projectJobTaskId = operateInfoMap.get(PROJECT_JOB_TASK_ID);
        String resultType = operateInfoMap.get(RESULT_TYPE);
        ProjectResultDO resultDO = ProjectResultDO.builder()
                .upk(new ProjectResultDO.UPK(projectId, ResultKind.fromDatatable(resultType), managementDO.getUpk().getNodeId(), managementDO.getUpk().getDatatableId()))
                .jobId(projectJobId)
                .taskId(projectJobTaskId)
                .build();
        resultRepository.save(resultDO);
    }

    /**
     * Synchronize tee node management data via job event response
     *
     * @param it
     * @return
     */
    private boolean syncTeeJob(Job.WatchJobEventResponse it) {
        Optional<TeeNodeDatatableManagementDO> managementOptional = managementRepository.findByJobId(it.getObject().getJobId());
        if (managementOptional.isEmpty()) {
            LOGGER.debug("watched jobEvent: jobId={}, but tee job not exist, skip", it.getObject().getJobId());
            return false;
        }
        LOGGER.info("watched jobEvent: sync tee job: it={}", ProtoUtils.toJsonString(it));
        if (managementOptional.get().isFinished()) {
            return true;
        }
        // update result
        TeeNodeDatatableManagementDO managementDO = updateTeeJob(it, managementOptional.get());
        // TODO(zhiyin): disabled all in edge
        if (PlatformTypeEnum.CENTER.equals(getPlaformType())) {
            managementRepository.save(managementDO);

            String jobId = "";
            // delete push job or auth job in table
            if (managementDO.getKind().equals(TeeJobKind.Delete) || managementDO.getKind().equals(TeeJobKind.CancelAuth)) {
                String operateInfo = managementDO.getOperateInfo();
                Map<String, String> operateInfoMap = JsonUtils.toJavaMap(operateInfo, String.class);
                jobId = managementDO.getKind().equals(TeeJobKind.Delete) ? operateInfoMap.get(PUSH_TO_TEE_JOB_ID) :
                        operateInfoMap.get(AUTH_TO_TEE_PROJECT_JOB_ID);
            }
            if (StringUtils.isBlank(jobId)) {
                return true;
            }
            // delete job
            Optional<TeeNodeDatatableManagementDO> deleteOptional = managementRepository.findByJobId(jobId);
            if (deleteOptional.isEmpty()) {
                return true;
            }
            TeeNodeDatatableManagementDO deleteManagementDO = deleteOptional.get();
            deleteManagementDO.setIsDeleted(true);
            managementRepository.save(deleteManagementDO);
            return true;
        } else {
            return true;
        }
    }

    /**
     * Update project job data via job event response
     *
     * @param it           event
     * @param managementDO tee node datatable management data object
     * @return tee node datatable management data object
     */
    public TeeNodeDatatableManagementDO updateTeeJob(Job.WatchJobEventResponse it, TeeNodeDatatableManagementDO managementDO) {
        switch (it.getType()) {
            case ADDED:
            case MODIFIED:
                LOGGER.info("watched jobEvent: update tee job: it={}", ProtoUtils.toJsonString(it));
                Job.JobStatusDetail kusciaJobStatus = it.getObject().getStatus();
                // when the job state is finished but the end time is not set, we don't update, because that some task state may be not terminate state.
                if (!(isFinishedState(it.getObject().getStatus().getState()) && Strings.isNullOrEmpty(it.getObject().getStatus().getEndTime()))) {
                    managementDO.setStatus(TeeJobStatus.formKusciaJobStatus(kusciaJobStatus.getState()));
                    // get task errorMsg
                    managementDO.setErrMsg(kusciaJobStatus.getTasksList().get(0).getErrMsg());
                }
                if (!Strings.isNullOrEmpty(it.getObject().getStatus().getEndTime())) {
                    managementDO.setGmtModified(DateTimes.utcFromRfc3339(it.getObject().getStatus().getEndTime()));
                }
                // synchronize tee result to project result table
                syncTeeResult(managementDO);
                return managementDO;
            default:
                return null;
        }
    }

    /**
     * Check response status whether finished
     *
     * @param state status
     * @return status whether finished
     */
    private boolean isFinishedState(String state) {
        return "Failed".equals(state) || "Succeeded".equals(state);
    }

    /**
     * Catch task failed party reason via task status
     *
     * @param kusciaTaskStatus
     * @return task failed party reasons
     */
    @NotNull
    private List<String> catchTaskFailedPartyReason(@NotNull Job.TaskStatus kusciaTaskStatus) {
        return kusciaTaskStatus.getPartiesList().stream().filter(pt -> PARTY_STATUS_FAILED.equals(pt.getState())).map(
                pt -> String.format("party %s failed msg: %s", pt.getDomainId(), pt.getErrMsg())
        ).collect(Collectors.toList());
    }

    /**
     * Catch task failed party reason via task status
     *
     * @param kusciaTaskStatus
     * @return task failed party reasons
     */
    private List<String> taskFailedReason(@Nonnull Job.TaskStatus kusciaTaskStatus) {
        List<String> reasons = catchTaskFailedPartyReason(kusciaTaskStatus);
        reasons.add(kusciaTaskStatus.getErrMsg());
        return reasons;
    }

    @Override
    public void createJob(Job.CreateJobRequest request) {
        Job.CreateJobResponse response = jobStub.createJob(request);
        if (!response.hasStatus()) {
            throw SecretpadException.of(JobErrorCode.PROJECT_JOB_CREATE_ERROR);
        }
        Common.Status status = response.getStatus();
        String message = status.getMessage();
        if (status.getCode() != 0 || (!StringUtils.isEmpty(message) && !SUCCESS_STATUS_MESSAGE.equalsIgnoreCase(message))) {
            throw SecretpadException.of(JobErrorCode.PROJECT_JOB_CREATE_ERROR, status.getMessage());
        }
    }

    public static String removeContentAfterUnderscore(String str, Map<String, Job.TaskStatus> map, Job.TaskStatus kusciaTaskStatus) {
        int commaIndex = str.indexOf("--");
        if (commaIndex != -1) {
            String taskId = str.substring(0, commaIndex);
            map.put(taskId, kusciaTaskStatus);
            return taskId;
        } else {
            return str;
        }
    }

    public static Job.TaskStatus mergeKusciaTaskStatus(String rawTaskId, String taskId, Map<String, Job.TaskStatus> map, Job.TaskStatus kusciaTaskStatus) {
        Job.TaskStatus.Builder builder = kusciaTaskStatus.toBuilder();
        GraphNodeTaskStatus rawGraphNodeTaskStatus = GraphNodeTaskStatus.formKusciaTaskStatus(kusciaTaskStatus.getState());
        if (!Objects.equals(rawTaskId, taskId) && rawTaskId.contains(taskId)) {
            switch (rawGraphNodeTaskStatus) {
                case SUCCEED, RUNNING -> builder.setState("Running");
            }
        } else {
            if (map.containsKey(taskId)) {
                Job.TaskStatus taskStatus = map.get(taskId);
                GraphNodeTaskStatus graphNodeTaskStatus = GraphNodeTaskStatus.formKusciaTaskStatus(taskStatus.getState());

                if (rawGraphNodeTaskStatus == GraphNodeTaskStatus.INITIALIZED) {
                    if (graphNodeTaskStatus != GraphNodeTaskStatus.INITIALIZED) {
                        builder.setState("Running");
                    }
                }
                if (graphNodeTaskStatus == GraphNodeTaskStatus.FAILED) {
                    builder.setState("Failed").setErrMsg(taskStatus.getErrMsg());
                }

            }
        }
        return builder.build();
    }

    public static String genTaskOutputId(String jobId, String outputId) {
        return String.format("%s-%s", jobId, outputId);
    }

    /**
     * sync model export job
     *
     * @param it event
     * @return whether success
     */
    private boolean syncModelExportJob(Job.WatchJobEventResponse it) {
        String jobId = it.getObject().getJobId();
        Cache cache = Objects.requireNonNull(cacheManager.getCache(CacheConstants.MODEL_EXPORT_CACHE), "ERROR " + CacheConstants.MODEL_EXPORT_CACHE + "is null");
        Cache.ValueWrapper valueWrapper = cache.get(jobId);
        if (ObjectUtils.isEmpty(valueWrapper)) {
            return false;
        }
        LOGGER.info("watched jobEvent: sync model export job: it={}", ProtoUtils.toJsonString(it));
        Object o = valueWrapper.get();
        if (ObjectUtils.isNotEmpty(o)) {
            ModelExportDTO modelExportDTO = JsonUtils.toJavaObject(String.valueOf(o), ModelExportDTO.class);
            switch (it.getType()) {
                case ADDED, MODIFIED -> {
                    LOGGER.info("watched jobEvent: update model export job: it={}", ProtoUtils.toJsonString(it));
                    Job.JobStatusDetail kusciaJobStatus = it.getObject().getStatus();
                    if (!(isFinishedState(it.getObject().getStatus().getState()) && Strings.isNullOrEmpty(it.getObject().getStatus().getEndTime()))) {
                        modelExportDTO.setStatus(GraphNodeTaskStatus.formKusciaTaskStatus(kusciaJobStatus.getTasks(0).getState()));
                        modelExportDTO.setErrMsg(kusciaJobStatus.getTasks(0).getErrMsg());
                    }
                }
            }
            Objects.requireNonNull(cacheManager.getCache(CacheConstants.MODEL_EXPORT_CACHE)).put(modelExportDTO.getJobId(), JsonUtils.toString(modelExportDTO));
            return true;
        }
        return false;
    }

    private void createDomainGrantByUnion(ProjectTaskDO taskDO, String domainDataId) {
        if (!taskDO.getGraphNode().getCodeName().equalsIgnoreCase(DATA_PREP_UNION)) {
            return;
        }
        // Only one node and a union need to create a domain grant
        // Table synchronization is only required when sample tables are merged, and kuscia will complete the union tables
        if (taskDO.getParties().size() != 1) {
            return;
        }
        String projectId = taskDO.getUpk().getProjectId();
        List<String> nodeIdList;
        List<ProjectNodeDO> projectNodeDOList = projectNodeRepository.findByProjectId(projectId);
        if (!CollectionUtils.isEmpty(projectNodeDOList)) {
            nodeIdList = projectNodeDOList.stream().map(ProjectNodeDO::getUpk)
                    .map(ProjectNodeDO.UPK::getNodeId).filter(nodeId -> !taskDO.getParties().contains(nodeId)).toList();
            if (!CollectionUtils.isEmpty(nodeIdList)) {
                nodeIdList.forEach(nodeId -> {
                    LOGGER.info("checkOrCreateDomainDataGrant: nodeId = {}, grantNodeId = {}, domainDataId = {}", taskDO.getParties().get(0), nodeId, domainDataId);
                    checkOrCreateDomainDataGrant(taskDO.getParties().get(0), nodeId, domainDataId);
                });
            }
        }
    }

    private void checkOrCreateDomainDataGrant(String nodeId, String grantNodeId, String domainDataId) {
        String domainDataGrantId = domainDataId + "-" + grantNodeId;
        try {
            datatableGrantManager.queryDomainGrant(nodeId, domainDataGrantId);
            return;
        } catch (Exception e) {
            LOGGER.warn("domain data grant not exists, nodeId = {}, domainDataGrantId = {}", nodeId, domainDataGrantId, e);
        }
        datatableGrantManager.createDomainGrant(nodeId, grantNodeId, domainDataId, domainDataGrantId);
    }
}
