package com.skrivo.skrivo.nodes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/nodes")
public class GraphNodeController {

    @GetMapping
    public List<GraphNode> getNodes(){
        return List.of(
                new GraphNode(130, 0.5, 3.6, 2.0),
                new GraphNode(140, 0.1, 1.5, 2.4),
                new GraphNode(150, 0.7, 3.9, 1.1)
        );
    }
}
