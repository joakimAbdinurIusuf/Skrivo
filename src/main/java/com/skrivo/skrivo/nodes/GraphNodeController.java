package com.skrivo.skrivo.nodes;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "api/nodes")
public class GraphNodeController {

    private final GraphNodeService graphNodeService;

    @Autowired
    public GraphNodeController(GraphNodeService graphNodeService) {
        this.graphNodeService = graphNodeService;
    }

    @GetMapping
    public List<GraphNode> fetchAllNodes(){
        return graphNodeService.getAllNodes();
    }
}
