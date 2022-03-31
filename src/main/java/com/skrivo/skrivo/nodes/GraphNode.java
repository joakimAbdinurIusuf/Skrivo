package com.skrivo.skrivo.nodes;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;


/**
 * @author Edvin Nordling, Joakim Abdinur Iusuf
 * @author Sebaztian Johansson, Zebastian Kensert Forsman
 *
 * TODO: The class needs to have an angle that locates the node toghether with
 * the 'distance' field as polar coordinates. Should convert the polar coordinates to cartesian
 * coordinates. Not sure if the cartesian coordinates should be a field in the class (which would
 * mean that they are calculated with a method in the constructor), or if they should be calculated
 * everytime they are called.
 */

public class GraphNode {
    private int node_id;
    private int number;
    private String name;
    private String username;
    private double size;
    private double distance;
    private Keywords keywords;

    public class Keywords {
        private List<String> words;
        private List<Integer> frequency;

        public List<String> getWords() {
            return words;
        }
        public void setWords(List<String> words) {
            this.words = words;
        }
        public List<Integer> getFrequency() {
            return frequency;
        }
        public void setFrequency(List<Integer> frequency) {
            this.frequency = frequency;
        }
    }

    
    public int getNode_id() {
        return node_id;
    }

    public void setNode_id(int node_id) {
        this.node_id = node_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "nodeID=" + getNode_id() +
                ", size=" + getSize() +
                ", distance=" + getDistance() +
                '}';
    }
}
