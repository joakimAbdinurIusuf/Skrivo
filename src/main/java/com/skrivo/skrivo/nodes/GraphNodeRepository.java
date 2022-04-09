package com.skrivo.skrivo.nodes;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GraphNodeRepository extends MongoRepository<GraphNode, String> {
    GraphNode findGraphNodeById(String id);
}
