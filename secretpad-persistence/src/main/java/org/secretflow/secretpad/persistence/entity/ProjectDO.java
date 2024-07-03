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

package org.secretflow.secretpad.persistence.entity;

import org.secretflow.secretpad.common.constant.ProjectConstants;
import org.secretflow.secretpad.common.enums.ProjectStatusEnum;
import org.secretflow.secretpad.common.util.UUIDUtils;
import org.secretflow.secretpad.persistence.converter.ProjectInfoConverter;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * Project data object
 *
 * @author jiezi
 * @date 2023/5/25
 */
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Table(name = "project")
@SQLDelete(sql = "update project set is_deleted = 1 where project_id = ?")
@Where(clause = "is_deleted = 0")
public class ProjectDO extends BaseAggregationRoot<ProjectDO> {

    /**
     * Project id
     */
    @Id
    @Column(name = "project_id", unique = true, nullable = false, length = 64)
    private String projectId;

    /**
     * Project name
     */
    @Column(name = "name", nullable = false, length = 256)
    private String name;

    /**
     * Project description
     */
    @Column(name = "description", nullable = true, columnDefinition = "text")
    private String description;


    /**
     * computeMode mpc,tee
     */
    private String computeMode;

    @Column(name = "compute_func", length = 64)
    private String computeFunc;
    /**
     * projectInfo tee dag runtimeParams
     */
    @Convert(converter = ProjectInfoConverter.class)
    private ProjectInfoDO projectInfo;

    /**
     * project owner
     */
    @Column(name = "owner_id", nullable = false, length = 64)
    private String ownerId;

    @Column(name = "status", nullable = false, length = 1)
    private Integer status;

    /**
     * Create a new project DO class
     */
    public static class Factory {
        public static ProjectDO newProject(String name, String desc, String computeMode, ProjectInfoDO projectInfoDO, String ownerId) {
            ProjectDO projectDO = ProjectDO.builder().projectId(UUIDUtils.random(8)).name(name).description(desc)
                    .computeMode(computeMode).projectInfo(projectInfoDO).build();
            projectDO.setOwnerId(ownerId);
            projectDO.setStatus(ProjectStatusEnum.APPROVED.getCode());
            projectDO.setComputeFunc(ProjectConstants.ComputeFuncEnum.ALL.name());
            return projectDO;
        }

        public static ProjectDO newP2PProject(String name, String desc, String computeMode, String computeFunc, ProjectInfoDO projectInfoDO, String ownerId) {
            ProjectDO projectDO = newProject(name, desc, computeMode, projectInfoDO, ownerId);
            projectDO.setComputeFunc(computeFunc);
            projectDO.setStatus(ProjectStatusEnum.REVIEWING.getCode());
            return projectDO;
        }
    }

    @Override
    public String getProjectId() {
        return this.projectId;
    }
}
