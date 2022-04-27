package com.skrivo.skrivo.nodes;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@AllArgsConstructor
@Service
public class GraphNodeService {

    private final GraphNodeRepository graphNodeRepository;
    MongoTemplate mongoTemplate;

    public List<GraphNode> getAllNodes() {
        Query query = new Query();
        query.fields();
        List<GraphNode> graphNodes = mongoTemplate.find(query, GraphNode.class);
        return graphNodes;
    }

    public GraphNode getWordsAndFrequenciesForOneNode(String id) {
        return graphNodeRepository.findGraphNodeById(id);
    }
}
