package com.skrivo.skrivo;

import com.skrivo.skrivo.nodes.GraphNode;
import com.skrivo.skrivo.nodes.GraphNodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SkrivoApplication {

	Random random = new Random();
	double rangeMin = 0.0;
	double rangeMax = Math.PI;

	public static void main(String[] args) {
		SpringApplication.run(SkrivoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(GraphNodeRepository graphNodeRepository, MongoTemplate mongoTemplate) {
		return args -> {
			GraphNode graphNode = new GraphNode(
					0.31993293378583665,
					3.11830276223588,
					rangeMin + (rangeMax - rangeMin) * random.nextDouble()
			);
			/*
			Query query = new Query();
			query.addCriteria(Criteria.where("size").is(0.31993293378583665));

			List<GraphNode> graphNodes = mongoTemplate.find(query, GraphNode.class);
			 */
			graphNodeRepository.insert(graphNode);
		};
	}
}
