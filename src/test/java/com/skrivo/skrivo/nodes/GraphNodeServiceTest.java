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

    GraphNodeRepository graphNodeRepository = new GraphNodeRepository() {
        @Override
        public GraphNode findGraphNodeById(String id) {
            return null;
        }

        @Override
        public <S extends GraphNode> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public List<GraphNode> findAll() {
            return null;
        }

        @Override
        public List<GraphNode> findAll(Sort sort) {
            return null;
        }

        @Override
        public <S extends GraphNode> S insert(S entity) {
            return null;
        }

        @Override
        public <S extends GraphNode> List<S> insert(Iterable<S> entities) {
            return null;
        }

        @Override
        public <S extends GraphNode> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends GraphNode> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<GraphNode> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends GraphNode> S save(S entity) {
            return null;
        }

        @Override
        public Optional<GraphNode> findById(String s) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(String s) {
            return false;
        }

        @Override
        public Iterable<GraphNode> findAllById(Iterable<String> strings) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(String s) {

        }

        @Override
        public void delete(GraphNode entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends String> strings) {

        }

        @Override
        public void deleteAll(Iterable<? extends GraphNode> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends GraphNode> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends GraphNode> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends GraphNode> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends GraphNode> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends GraphNode, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };

    MongoTemplate mongoTemplate;

    @Test
    void getAllNodes() {
        // Create a new GraphNodeService and a new GraphNode inside of it, and then call the getAllNodes method to ensure that the correct node is returned.
        // Arrange
        GraphNodeService graphNodeService = new GraphNodeService(graphNodeRepository, mongoTemplate);
        // double size, double distance, double angle, List<String> words, List<Integer> wordFrequency
        GraphNode graphNode = new GraphNode(1, 1, 1, List.of("test"), List.of(1));

        // Act
        List<GraphNode> result = graphNodeService.getAllNodes();

        // Assert
        assertEquals(1, result.size());
        assertEquals(graphNode, result.get(0));
    }

    @Test
    void getWordsAndFrequenciesForOneNode() {
    }
}