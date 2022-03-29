package com.skrivo.skrivo.nodes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.google.gson.Gson;

@Service
public class GraphNodeService {

    @GetMapping
    public NetworkUserList getNetworkUserList(){
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        try {
            Scanner input = new Scanner(new FileReader("src/main/mongodb/data/fake_network.json"));
            while (input.hasNext()) {
                sb.append(input.next());
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        String JSONString = sb.toString();
        NetworkUserList networkUserList = gson.fromJson(JSONString, NetworkUserList.class);
        
        return networkUserList;
    }
}
