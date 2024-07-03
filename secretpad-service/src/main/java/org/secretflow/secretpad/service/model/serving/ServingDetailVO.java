/*
 * Copyright 2024 Ant Group Co., Ltd.
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

package org.secretflow.secretpad.service.model.serving;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @author chenmingliang
 * @date 2024/01/22
 */
@Getter
@Setter
@Builder
public class ServingDetailVO {

    private String modelId;

    private List<ServingDetail> servingDetails;

    private String servingId;

    @Setter
    @Getter
    @Builder
    public static class ServingDetail {
        private String nodeId;

        private String nodeName;

        private String endpoints;

        private String featureHttp;

        private Boolean isMock;

        private Map<String, String> featureMappings;

        private String sourcePath;

        private List<ResourceVO> resources;
    }

}
