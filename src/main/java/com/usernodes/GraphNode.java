package com.usernodes;

/** A node in the network graph (not the center node)
 * @author Edvin Nordling
 * @since 1.0 (???)
 * 
 * The fields of the class are based on the data in the database.
 * 
 * To be added: The class needs to have an angle that locates the node toghether with 
 * the 'distance' field as polar coordinates. Should convert the polar coordinates to cartesian
 * coordinates. Not sure if the cartesian coordinates should be a field in the class (which would 
 * mean that they are calculated with a method in the constructor), or if they should be calculated
 * everytime they are called.
 */
public class GraphNode {
    public int nodeID;
    public int number;
    public String name;
    public String username;
    public double size;
    public double distance;
    //public String[][] keywords;

    /** "Default" constructor
     * 
     */
    public GraphNode(){
    }


    /** Constructor
     * 
     * @param nodeID
     * @param name
     * @param size
     * @param distance
     */
    public GraphNode(int nodeID, String name, double size, double distance){
        this.nodeID = nodeID;
        this.name = name;
        this.size = size;
        this.distance = distance;   
    }

}

