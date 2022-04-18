package com.skrivo.skrivo.nodes;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@AllArgsConstructor
class GraphNodeServiceTest {

    @Test
    void getAllNodes() {
    }

    @Test
    void getWordsAndFrequenciesForOneNode() {
    }
}