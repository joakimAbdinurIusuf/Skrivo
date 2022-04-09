package com.skrivo.skrivo.nodes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

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
    private List<String> words;
    private List<Integer> wordFrequency;

    /**
     * Constructor without nodeID
     */
    public GraphNode(double size, double distance, double angle, List<String> words, List<Integer> wordFrequency) {
        this.size = size;
        x = Math.cos(angle) * distance * 100;
        y = Math.sin(angle) * distance * 100;
        this.words = words;
        this.wordFrequency = wordFrequency;
    }

    public String getId() {
        return id;
    }

    public double getSize() {
        return size;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public List<String> getWords() {
        return words;
    }

    public List<Integer> getWordFrequency() {
        return wordFrequency;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void setWordFrequency(List<Integer> wordFrequency) {
        this.wordFrequency = wordFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode graphNode = (GraphNode) o;
        return Double.compare(graphNode.size, size) == 0 && Double.compare(graphNode.x, x) == 0 && Double.compare(graphNode.y, y) == 0 && Objects.equals(id, graphNode.id) && Objects.equals(words, graphNode.words) && Objects.equals(wordFrequency, graphNode.wordFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, x, y, words, wordFrequency);
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "id='" + id + '\'' +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                ", words=" + words +
                ", wordFrequency=" + wordFrequency +
                '}';
    }
}
