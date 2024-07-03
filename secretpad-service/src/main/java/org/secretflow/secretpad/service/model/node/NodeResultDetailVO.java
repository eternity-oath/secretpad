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

package org.secretflow.secretpad.service.model.node;

import org.secretflow.secretpad.service.model.datatable.TableColumnVO;
import org.secretflow.secretpad.service.model.graph.GraphDetailVO;
import org.secretflow.secretpad.service.model.graph.GraphNodeOutputVO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Node result detail view object
 *
 * @author : xiaonan.fhn
 * @date 2023/06/08
 */
@Builder
@Setter
@Getter
@ToString
public class NodeResultDetailVO {

    /**
     * Node result list view object
     */
    @Schema(description = "node result list")
    NodeResultsVO nodeResultsVO;

    /**
     * Graph detail view object
     */
    @Schema(description = "graph detail view object")
    GraphDetailVO graphDetailVO;

    /**
     * Table column view object list
     */
    @Schema(description = "table column view object list")
    List<TableColumnVO> tableColumnVOList;

    /**
     * Graph node output view object
     */
    @Schema(description = "graph node output")
    GraphNodeOutputVO output;

    @Schema(description = "datasource")
    private String datasource;
}
