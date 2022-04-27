package com.skrivo.skrivo;

import com.skrivo.skrivo.nodes.GraphNode;
import com.skrivo.skrivo.nodes.GraphNodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SkrivoApplication {

	Random random = new Random();
	double rangeMinAngle = 0.0;
	double rangeMaxAngle = 2*Math.PI;
	double rangeMinSize = 0.1;
	double rangeMaxSize = 0.5;
	double rangeMinDistance = 1.0;
	double rangeMaxDistance = 5.0;

	public static void main(String[] args) {
		SpringApplication.run(SkrivoApplication.class, args);
	}

	public HashMap<String, String> createJSONObject(String word, String freq) {
		HashMap<String, String> map = new HashMap<>();
		map.put("text", word);
		map.put("value", freq);
		return map;
	}

	@Bean
	CommandLineRunner commandLineRunner(GraphNodeRepository graphNodeRepository, MongoTemplate mongoTemplate) {
		return args -> {
			GraphNode centerNode = new GraphNode(
					0.3,
					0,
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("React", "10"),
							createJSONObject("Java", "3"),
							createJSONObject("Python", "1"),
							createJSONObject("Spring", "7"),
							createJSONObject("Django", "1"),
							createJSONObject("PHP", "1"),
							createJSONObject("Fullstack", "2"),
							createJSONObject("Backend", "4"),
							createJSONObject("Frontend", "1"),
							createJSONObject("Databases", "1")
							createJSONObject("Angular", "10"),
							createJSONObject("Express", "3"),
							createJSONObject("Node", "1"),
							createJSONObject("Spring Boot", "7"),
							createJSONObject("Flask", "1"),
							createJSONObject("C++", "1"),
							createJSONObject("Go", "2"),
							createJSONObject("Lisp", "4"),
							createJSONObject("Haskell", "1"),
							createJSONObject("MongoDB", "1")
					)
			);
			graphNodeRepository.insert(centerNode);

			GraphNode graphNode1 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("KTH", "10"),
							createJSONObject("Liu", "3"),
							createJSONObject("LTH", "1"),
							createJSONObject("Chalmers", "7"),
							createJSONObject("MIT", "1"),
							createJSONObject("Harvard", "1"),
							createJSONObject("Stanford", "2"),
							createJSONObject("UCLA", "4"),
							createJSONObject("Cambridge", "1"),
							createJSONObject("Oxford", "1")
							createJSONObject("SU", "10"),
							createJSONObject("Lancaster", "3"),
							createJSONObject("Manchester University", "1"),
							createJSONObject("UoA", "7"),
							createJSONObject("", "1"),
							createJSONObject("Harvard", "1"),
							createJSONObject("Stanfords state", "2"),
							createJSONObject("UCLAMLA", "4"),
							createJSONObject("Tambridge", "1"),
							createJSONObject("Uxfordser", "1")
					)
			);
			graphNodeRepository.insert(graphNode1);

			GraphNode graphNode2 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("YouTube", "10"),
							createJSONObject("Medium", "3"),
							createJSONObject("Wordpress", "1"),
							createJSONObject("Substack", "7"),
							createJSONObject("Blogging", "1"),
							createJSONObject("Vlogging", "1"),
							createJSONObject("Books", "2"),
							createJSONObject("Backend", "4"),
							createJSONObject("Frontend", "1"),
							createJSONObject("Databases", "1")
							createJSONObject("Angular", "10"),
							createJSONObject("Express", "3"),
							createJSONObject("Node", "1"),
							createJSONObject("Spring Boot", "7"),
							createJSONObject("Flask", "1"),
							createJSONObject("C++", "1"),
							createJSONObject("Go", "2"),
							createJSONObject("Lisp", "4"),
							createJSONObject("Haskell", "1"),
							createJSONObject("MongoDB", "1")
					)
			);
			graphNodeRepository.insert(graphNode2);
		};
	}
}
