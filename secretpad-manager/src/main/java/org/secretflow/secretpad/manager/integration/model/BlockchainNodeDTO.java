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

package org.secretflow.secretpad.manager.integration.model;

import lombok.*;
import org.secretflow.secretpad.common.util.DateTimes;
import org.secretflow.secretpad.persistence.entity.BlockchainNodeDO;


/**
 * Node data transfer object
 *
 * @author jiezi
 * @date 2023/05/16
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BlockchainNodeDTO {

    /**
     * Node id
     */
    private String name;

    /**
     * Node name
     */
    private String dstNodeId;

    /**
     * Node authorization
     */
    private String dstNetAddress;

    /**
     * Node description
     */
    private String certText;
    private String masterNodeId;

    /**
     * Convert NodeDO to NodeDTO
     *
     * @param BlockchainNodeDO BlockchainNodeDO
     * @return BlockchainNodeDO
     */
    public static BlockchainNodeDTO fromDo(BlockchainNodeDO BlockchainNodeDO) {
        if (BlockchainNodeDO == null) {
            return new BlockchainNodeDTO();
        }
        BlockchainNodeDTO blockchainNodeDTO = new BlockchainNodeDTO();
        blockchainNodeDTO.setDstNodeId(BlockchainNodeDO.getDstNodeId());
        blockchainNodeDTO.setName(BlockchainNodeDO.getName());
        blockchainNodeDTO.setCertText(BlockchainNodeDO.getCertText());
        blockchainNodeDTO.setDstNetAddress(BlockchainNodeDO.getDstNetAddress());
        blockchainNodeDTO.setMasterNodeId(BlockchainNodeDO.getMasterNodeId());
        return blockchainNodeDTO;
    }

}
