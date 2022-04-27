package com.skrivo.skrivo.nodes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

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
    private List<HashMap<String, String>> wordsAndFrequencies;

    /**
     * Constructor without nodeID
     */
    public GraphNode(double size, double distance, double angle, List<HashMap<String, String>> wordsAndFrequencies) {
        this.size = size;
        x = Math.cos(angle) * distance * 100;
        y = Math.sin(angle) * distance * 100;
        this.wordsAndFrequencies = wordsAndFrequencies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<HashMap<String, String>> getWordsAndFrequencies() {
        return wordsAndFrequencies;
    }

    public void setWordsAndFrequencies(List<HashMap<String, String>> wordsAndFrequencies) {
        this.wordsAndFrequencies = wordsAndFrequencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode graphNode = (GraphNode) o;
        return Double.compare(graphNode.size, size) == 0 && Double.compare(graphNode.x, x) == 0 && Double.compare(graphNode.y, y) == 0 && Objects.equals(id, graphNode.id) && Objects.equals(wordsAndFrequencies, graphNode.wordsAndFrequencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, x, y, wordsAndFrequencies);
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "id='" + id + '\'' +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                ", wordsAndFrequencies=" + wordsAndFrequencies +
                '}';
    }
}
