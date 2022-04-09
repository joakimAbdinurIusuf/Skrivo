package com.skrivo.skrivo.nodes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GraphNodeService {

    private final GraphNodeRepository graphNodeRepository;

    public List<GraphNode> getAllNodes() {
        return graphNodeRepository.findAll();
    }
}
