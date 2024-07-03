package org.secretflow.secretpad.service.impl;

import com.alibaba.fastjson.JSONObject;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

import org.secretflow.secretpad.manager.integration.model.*;
import org.secretflow.secretpad.manager.integration.node.AbstractNodeManager;
import org.secretflow.secretpad.service.*;
import org.secretflow.secretpad.service.model.node.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
public class BlockchainNodeServiceImpl implements BlockchainNodeService {


    private final static Logger LOGGER = LoggerFactory.getLogger(NodeServiceImpl.class);

    @Autowired
    private AbstractNodeManager nodeManager;

    @Override
    public JSONArray blockchainListNodes() {

        String dlUrl = System.getenv("DIGITAL_LINK_URL");
        String tag = System.getenv("DIGITAL_LINK_TAG");
        String nodeUrl = dlUrl + "/api/v1/namespaces/default/messages?limit=100&tag=" + tag;
        JSONArray resultArray = new JSONArray();
        String response = HttpUtil.get(nodeUrl);
        LOGGER.info("获取数链通上所有隐私计算节点信息:{}", response);
        // 解析JSON响应
        JSONArray jsonArray = JSONArray.parseArray(response);
        for (Object obj : jsonArray) {
            if (obj instanceof JSONObject) {
                JSONObject message = (JSONObject) obj;
                JSONObject header = message.getJSONObject("header");

                // 提取id
                String id = header.getString("id");
                JSONArray topics = header.getJSONArray("topics");

                // 构建新的JSONObject
                JSONObject newObj = new JSONObject();
                newObj.put("name", topics.getString(0));  // 示例中固定为 "alice"，你可以根据需求设置其他值
                newObj.put("nodeId", id);    // 使用从 header 中获取的 id
                resultArray.add(newObj);
            }
        }
        return resultArray;
    }

    @Override
    public JSONObject blockchainListNodeDetail(GetBlockchainListNodeRequest request) {
        String dlUrl = System.getenv("DIGITAL_LINK_URL");
        String nodeId = request.getNodeId();
        String nodeUrl = dlUrl + "/api/v1/namespaces/default/messages/" + nodeId + "/data";
        String response = HttpUtil.get(nodeUrl);
        LOGGER.info("获取数链通上所有隐私计算节点信息:{}", response);

        // 解析JSON响应
        JSONArray jsonArray = JSONArray.parseArray(response);
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        // Extract the 'value' JSONObject
        JSONObject valueObject = jsonObject.getJSONObject("value");

        return valueObject;
    }
}