package com.skrivo.skrivo.nodes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GraphNodeService {

    private final GraphNodeRepository graphNodeRepository;

    public List<GraphNode> getAllNodes() {
        /*
        return List.of(
                new GraphNode(0.5, 3.6, 2.0),
                new GraphNode(0.1, 1.5, 2.4),
                new GraphNode(0.7, 3.9, 1.1)
        );
        */
        return graphNodeRepository.findAll();
    }
}
