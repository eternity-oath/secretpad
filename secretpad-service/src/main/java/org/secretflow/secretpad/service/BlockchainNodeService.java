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

package org.secretflow.secretpad.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.secretflow.secretpad.service.model.common.SecretPadPageResponse;
import org.secretflow.secretpad.service.model.node.*;
import org.secretflow.secretpad.service.model.node.p2p.P2pCreateNodeRequest;

import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 * Node service interface
 *
 * @author xiaonan
 * @date 2023/5/4
 */
public interface BlockchainNodeService {


    /**
     * Lists all current nodes
     *
     * @return node view object list
     */
    JSONArray blockchainListNodes();

    JSONObject blockchainListNodeDetail(GetBlockchainListNodeRequest request);

}
