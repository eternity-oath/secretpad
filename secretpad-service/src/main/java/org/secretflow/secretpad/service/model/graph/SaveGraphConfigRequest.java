package org.secretflow.secretpad.service.model.graph;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

import java.util.List;


/**
 * Get graph request
 *
 * @author yansi
 * @date 2023/5/25
 */
@Data
public class SaveGraphConfigRequest {

    /**
     * Project id, it can not be blank
     */
    @NotBlank(message = "项目 ID 不能为空")
    private String projectId;

    /**
     * Graph id, it can not be blank
     */
    @NotBlank(message = "图表 ID 不能为空")
    private String graphId;

    /**
     * List of nodes configurations in the graph.
     */
    @NotNull(message = "数据项列表不能为空")
    private List<GraphNodeConfig> data;

    /**
     * Graph id, it can not be blank
     */
    @NotBlank(message = "表达式不能为空")
    private String expression;


}


