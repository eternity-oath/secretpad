package org.secretflow.secretpad.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.secretflow.secretpad.common.annotation.resource.ApiResource;
import org.secretflow.secretpad.common.constant.resource.ApiResourceCodeConstants;
import org.secretflow.secretpad.service.BlockchainNodeService;
import org.secretflow.secretpad.service.model.common.SecretPadResponse;
import org.secretflow.secretpad.service.model.graph.GetGraphRequest;
import org.secretflow.secretpad.service.model.node.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaonan
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1alpha1/node/blockchain")
public class BlockchainNodeController {
    private final BlockchainNodeService blockchainNodeService;

    /**
     * List node api
     *
     * @return successful SecretPadResponse with node view object list
     */
    @PostMapping(value = "/list")
    @ApiResource(code = ApiResourceCodeConstants.NODE_LIST)
    public SecretPadResponse<List<Object>> blockchainListNode() {
        return SecretPadResponse.success(blockchainNodeService.blockchainListNodes());
    }

    /**
     * List node api
     *
     * @return successful SecretPadResponse with node view object list
     */
    @PostMapping(value = "/detail")
    @ApiResource(code = ApiResourceCodeConstants.NODE_LIST)
    public SecretPadResponse<JSONObject> blockchainListNodeInfo(@Valid @RequestBody GetBlockchainListNodeRequest request) {
        return SecretPadResponse.success(blockchainNodeService.blockchainListNodeDetail(request));
    }

}
