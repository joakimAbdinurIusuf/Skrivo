package com.skrivo.skrivo.nodes;

/**
 * @author Edvin Nordling, Joakim Abdinur Iusuf
 *
 * TODO: The class needs to have an angle that locates the node toghether with
 * the 'distance' field as polar coordinates. Should convert the polar coordinates to cartesian
 * coordinates. Not sure if the cartesian coordinates should be a field in the class (which would
 * mean that they are calculated with a method in the constructor), or if they should be calculated
 * everytime they are called.
 */

public class GraphNode {
    private int nodeID;
    private double size;
    private double x;
    private double y;

    /**
     * Constructor with nodeID
     */
    public GraphNode(int nodeID, double size, double distance, double angle) {
        this.nodeID = nodeID;
        this.size = size;
        x = Math.cos(angle) * distance;
        y = Math.sin(angle) * distance;
    }

    /**
     * Constructor without nodeID
     */
    public GraphNode(double size, double x, double y) {
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
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
                "nodeID=" + nodeID +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
