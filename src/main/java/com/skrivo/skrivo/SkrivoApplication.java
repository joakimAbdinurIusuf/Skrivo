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
	double rangeMin = 0.0;
	double rangeMax = 2*Math.PI;

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
					rangeMin + (rangeMax - rangeMin) * random.nextDouble(),
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
					)
			);
			graphNodeRepository.insert(centerNode);

			GraphNode graphNode1 = new GraphNode(
					0.36311161543,
					0.222,
					rangeMin + (rangeMax - rangeMin) * random.nextDouble(),
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
					)
			);
			graphNodeRepository.insert(graphNode1);
		};
	}
}
