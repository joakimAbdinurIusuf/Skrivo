package com.skrivo.skrivo.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GraphNodeController {

    private final GraphNodeService graphNodeService;

    @Autowired
    public GraphNodeController(GraphNodeService graphNodeService) {
        this.graphNodeService = graphNodeService;
    }

    @GetMapping(path = "api/nodes")
    public List<GraphNode> fetchAllNodes() {
        return graphNodeService.getAllNodes();
    }

    @GetMapping(path = "api/wordcloud")
    public GraphNode fetchAllWordsAndFrequencies() {
        return graphNodeService.getWordsAndFrequenciesForOneNode("625691459fbfec69d701a53f");
    }
}
