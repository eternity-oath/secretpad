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

package org.secretflow.secretpad.service.model.datatable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * List datatable request
 *
 * @author : xiaonan.fhn
 * @date 2023/5/15
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListDatatableRequest {
    /**
     * How many pieces of data are in each page
     */
    @Schema(description = "page size")
    Integer pageSize;
    /**
     * What page is currently requested? Note that starting at 1 represents the first page
     */
    @Schema(description = "page number")
    Integer pageNumber;
    /**
     * Filter the list by status
     * Available：Datatables that filter available status
     * Unavailable：Datatables that filter unavailable status
     * Other values or null：All datatables
     */
    @Schema(description = "status filter rule")
    @Nullable
    String statusFilter;
    /**
     * Fuzzy search by table name
     */
    @Schema(description = "datatable name filter rule")
    @Nullable
    String datatableNameFilter;

    /**
     * Fuzzy search by table name
     */
    @Schema(description = "table types filter rule")
    List<String> types;
    /**
     * Node Id
     */
    @Schema(description = "node id")
    private String nodeId;
    /**
     * Tee node id, it can be blank and has default value
     */
    @Schema(description = "tee node id")
    private String teeNodeId;
}
