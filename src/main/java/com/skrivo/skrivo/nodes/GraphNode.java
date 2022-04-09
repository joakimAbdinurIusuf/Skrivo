package com.skrivo.skrivo.nodes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Edvin Nordling, Joakim Abdinur Iusuf
 */
@Data
@Document
@NoArgsConstructor
public class GraphNode {
    @Id
    private String id;
    private double size;
    private double x;
    private double y;

    /**
     * Constructor without nodeID
     */
    public GraphNode(double size, double distance, double angle) {
        this.size = size;
        x = Math.cos(angle) * distance * 100;
        y = Math.sin(angle) * distance * 100;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "nodeID=" + id +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
