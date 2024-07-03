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

package org.secretflow.secretpad.service.model.approval;

import org.secretflow.secretpad.service.constant.Constants;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * NodeRouteVoteConfig.
 *
 * @author cml
 * @date 2023/09/19
 */
@Getter
@Setter
public class NodeRouteVoteConfig extends AbstractVoteConfig {

    @NotBlank
    private String srcNodeId;

    @NotBlank
    private String desNodeId;

    @NotBlank
    @Pattern(regexp = Constants.IP_PREFIX_REG, message = "address needs to start with http or https")
    private String srcNodeAddr;

    @NotBlank
    @Pattern(regexp = Constants.IP_PREFIX_REG, message = "address needs to start with http or https")
    private String desNodeAddr;
}
