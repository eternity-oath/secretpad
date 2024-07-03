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

package org.secretflow.secretpad.service.model.message;

import lombok.Builder;
import lombok.Data;

/**
 * ReceiverMessage.
 *
 * @author cml
 * @date 2023/09/28
 */
@Data
@Builder
public class ReceiverMessage extends AbstractInitiatingTypeMessage {

    /**
     * reason of reject
     */
    private String reason;
    /**
     * participantID
     */
    private String participantID;

    /**
     * initiator nodeID
     */
    private String initiatorNodeID;

    /**
     * initiator nodeName
     */
    private String initiatorNodeName;
}
