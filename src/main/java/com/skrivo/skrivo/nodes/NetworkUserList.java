package com.skrivo.skrivo.nodes;

import java.util.List;
public class NetworkUserList {
    private List<NetworkUser> network_users;

    public class NetworkUser {
        private int user_id;
        private List<GraphNode> nodes;

        public int getUser_id() {
            return user_id;
        }
        
        public List<GraphNode> getNodes() {
            return nodes;
        }
    }

    public List<NetworkUser> getNetwork_users() {
        return network_users;
    } 

    public NetworkUser getNetworkUser(int index) {
        return getNetwork_users().get(index);
    } 
}
