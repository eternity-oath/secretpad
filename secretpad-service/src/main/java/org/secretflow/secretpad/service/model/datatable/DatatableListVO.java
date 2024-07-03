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

import java.util.List;

/**
 * Datatable list view object
 *
 * @author yansi
 * @date 2023/5/10
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DatatableListVO {

    /**
     * Datatable view object list
     */
    @Schema(description = "datatable view object list")
    List<DatatableVO> datatableVOList;
    /**
     * The total count of datatable
     */
    @Schema(description = "the total count of datatable")
    Integer totalDatatableNums;
}
