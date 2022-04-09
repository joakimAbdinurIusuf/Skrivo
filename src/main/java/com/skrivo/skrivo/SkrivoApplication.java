package com.skrivo.skrivo;

import com.skrivo.skrivo.nodes.GraphNode;
import com.skrivo.skrivo.nodes.GraphNodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
	CommandLineRunner commandLineRunner(GraphNodeRepository graphNodeRepository) {
		return args -> {
			GraphNode graphNode = new GraphNode(
					0.31993293378583665,
					3.11830276223588,
					rangeMin + (rangeMax - rangeMin) * random.nextDouble()
			);
			graphNodeRepository.insert(graphNode);
		};
	}
}
