package org.secretflow.secretpad.service.model.graph;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;


/**
 * Represents a node in the graph configuration.
 */
@Data
public class GraphNodeConfig implements Serializable {
    /**
     * Node identifier.
     */
    @NotBlank(message = "节点 ID 不能为空")
    private String nodeId;

    /**
     * Identifier of the datatable associated with the node.
     */
    @NotBlank(message = "数据表 ID 不能为空")
    private String datatableId;

    /**
     * Intersection key for the node.
     */
    @NotBlank(message = "交集键不能为空")
    private String intersection_key;
}