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
			GraphNode graphNode1 = new GraphNode(
					0.31993293378583665,
					3.11830276223588,
					rangeMin + (rangeMax - rangeMin) * random.nextDouble(),
					List.of("kicked",
			        "la",
					"suicide",
					"gosh",
					"mmmm",
					"ganas",
					"tla",
					"goods",
					"cruel",
					"press",
					"nutella",
					"throw",
					"albeit",
					"fra",
					"layout",
					"recorded",
					"barbs",
					"screwed",
					"elgato",
					"titas",
					"rizal",
					"bf",
					"fever",
					"inca",
					"llama",
					"truck",
					"lurgy",
					"progress",
					"stage",
					"unagi",
					"laine",
					"plz",
					"lansi",
					"cornwall",
					"marathon",
					"catching",
					"politics",
					"abusive",
					"leh",
					"nathan",
					"agonising",
					"bless",
					"buying",
					"hug",
					"soul",
					"wig",
					"tbf",
					"mv",
					"plisss",
					"cunt"
					),
					List.of(3,
					10,
					2,
					6,
					1,
					1,
					1,
					1,
					1,
					1,
					1,
					2,
					1,
					4,
					2,
					1,
					1,
					2,
					1,
					1,
					1,
					2,
					7,
					1,
					1,
					2,
					1,
					1,
					14,
					1,
					1,
					3,
					1,
					1,
					3,
					1,
					1,
					1,
					1,
					1,
					1,
					2,
					1,
					15,
					5,
					1,
					1,
					1,
					1,
					1
					)
			);
			graphNodeRepository.insert(graphNode1);
		};
	}
}
