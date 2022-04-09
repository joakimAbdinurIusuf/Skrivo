package com.skrivo.skrivo.nodes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GraphNodeRepository extends MongoRepository<GraphNode, String> {
}
