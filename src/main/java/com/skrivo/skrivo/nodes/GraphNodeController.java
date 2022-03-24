package com.skrivo.skrivo.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/nodes")
public class GraphNodeController {

    private final GraphNodeService graphNodeService;

    @Autowired
    public GraphNodeController(GraphNodeService graphNodeService) {
        this.graphNodeService = graphNodeService;
    }

    @GetMapping
    public List<GraphNode> getNodes(){
        return graphNodeService.getNodes();
    }
}