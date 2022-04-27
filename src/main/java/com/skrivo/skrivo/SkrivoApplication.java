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
	double rangeMaxSize = 0.4;
	double rangeMinDistance = 1.0;
	double rangeMaxDistance = 4.0;

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
							createJSONObject("Databases", "1"),
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
							createJSONObject("Oxford", "1"),
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode2);

			GraphNode graphNode3 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode3);

			GraphNode graphNode4 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode4);

			GraphNode graphNode5 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Indiana Jones", "10"),
							createJSONObject("Tom Cruise", "3"),
							createJSONObject("Buzz Lightyear", "1"),
							createJSONObject("Toy Story", "7"),
							createJSONObject("Jack Sparrow", "1"),
							createJSONObject("Terminator", "1"),
							createJSONObject("Liam Neeson", "2"),
							createJSONObject("Batman", "4"),
							createJSONObject("Catwoman", "1"),
							createJSONObject("Han Solo", "1"),
							createJSONObject("Al Pacino", "10"),
							createJSONObject("Lord Of The Rings", "3"),
							createJSONObject("Tom Hanks", "1"),
							createJSONObject("Forrest Gump", "7"),
							createJSONObject("The Matrix", "1"),
							createJSONObject("Will Smith", "1"),
							createJSONObject("Oscars", "2"),
							createJSONObject("Leonardo DiCaprio", "4"),
							createJSONObject("Russell Crowe", "1"),
							createJSONObject("Hannibal", "1")
					)
			);
			graphNodeRepository.insert(graphNode5);

			GraphNode graphNode6 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
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
							createJSONObject("Databases", "1"),
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
			graphNodeRepository.insert(graphNode6);

			GraphNode graphNode7 = new GraphNode(
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
							createJSONObject("Oxford", "1"),
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
			graphNodeRepository.insert(graphNode7);

			GraphNode graphNode8 = new GraphNode(
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode8);

			GraphNode graphNode9 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode9);

			GraphNode graphNode10 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode10);

			GraphNode graphNode11 = new GraphNode(
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
							createJSONObject("Oxford", "1"),
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
			graphNodeRepository.insert(graphNode11);

			GraphNode graphNode12 = new GraphNode(
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode12);

			GraphNode graphNode13 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode13);

			GraphNode graphNode14 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode14);

			GraphNode graphNode15 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Indiana Jones", "10"),
							createJSONObject("Tom Cruise", "3"),
							createJSONObject("Buzz Lightyear", "1"),
							createJSONObject("Toy Story", "7"),
							createJSONObject("Jack Sparrow", "1"),
							createJSONObject("Terminator", "1"),
							createJSONObject("Liam Neeson", "2"),
							createJSONObject("Batman", "4"),
							createJSONObject("Catwoman", "1"),
							createJSONObject("Han Solo", "1"),
							createJSONObject("Al Pacino", "10"),
							createJSONObject("Lord Of The Rings", "3"),
							createJSONObject("Tom Hanks", "1"),
							createJSONObject("Forrest Gump", "7"),
							createJSONObject("The Matrix", "1"),
							createJSONObject("Will Smith", "1"),
							createJSONObject("Oscars", "2"),
							createJSONObject("Leonardo DiCaprio", "4"),
							createJSONObject("Russell Crowe", "1"),
							createJSONObject("Hannibal", "1")
					)
			);
			graphNodeRepository.insert(graphNode15);

			GraphNode graphNode16 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
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
							createJSONObject("Databases", "1"),
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
			graphNodeRepository.insert(graphNode16);

			GraphNode graphNode17 = new GraphNode(
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
							createJSONObject("Oxford", "1"),
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
			graphNodeRepository.insert(graphNode17);

			GraphNode graphNode18 = new GraphNode(
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode18);

			GraphNode graphNode19 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode19);

			GraphNode graphNode20 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode20);

			GraphNode graphNode21 = new GraphNode(
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
							createJSONObject("Oxford", "1"),
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
			graphNodeRepository.insert(graphNode21);

			GraphNode graphNode22 = new GraphNode(
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode22);

			GraphNode graphNode23 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode23);

			GraphNode graphNode24 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode24);

			GraphNode graphNode25 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Indiana Jones", "10"),
							createJSONObject("Tom Cruise", "3"),
							createJSONObject("Buzz Lightyear", "1"),
							createJSONObject("Toy Story", "7"),
							createJSONObject("Jack Sparrow", "1"),
							createJSONObject("Terminator", "1"),
							createJSONObject("Liam Neeson", "2"),
							createJSONObject("Batman", "4"),
							createJSONObject("Catwoman", "1"),
							createJSONObject("Han Solo", "1"),
							createJSONObject("Al Pacino", "10"),
							createJSONObject("Lord Of The Rings", "3"),
							createJSONObject("Tom Hanks", "1"),
							createJSONObject("Forrest Gump", "7"),
							createJSONObject("The Matrix", "1"),
							createJSONObject("Will Smith", "1"),
							createJSONObject("Oscars", "2"),
							createJSONObject("Leonardo DiCaprio", "4"),
							createJSONObject("Russell Crowe", "1"),
							createJSONObject("Hannibal", "1")
					)
			);
			graphNodeRepository.insert(graphNode25);

			GraphNode graphNode26 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
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
							createJSONObject("Databases", "1"),
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
			graphNodeRepository.insert(graphNode26);

			GraphNode graphNode27 = new GraphNode(
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
							createJSONObject("Oxford", "1"),
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
			graphNodeRepository.insert(graphNode27);

			GraphNode graphNode28 = new GraphNode(
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
							createJSONObject("Channel", "4"),
							createJSONObject("Viewers", "1"),
							createJSONObject("Subscribers", "1"),
							createJSONObject("Click rate", "10"),
							createJSONObject("1000 subs", "3"),
							createJSONObject("Content creation", "1"),
							createJSONObject("Blog post ideas", "7"),
							createJSONObject("Thumbnails", "1"),
							createJSONObject("Title", "1"),
							createJSONObject("Generation", "2"),
							createJSONObject("Equipment", "4"),
							createJSONObject("Camera", "1"),
							createJSONObject("Recorder", "1")
					)
			);
			graphNodeRepository.insert(graphNode28);

			GraphNode graphNode29 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Skrivo", "10"),
							createJSONObject("Scaleup Robotics", "3"),
							createJSONObject("Apartly", "1"),
							createJSONObject("Cavitreat", "7"),
							createJSONObject("Datana", "1"),
							createJSONObject("DewDrop", "1"),
							createJSONObject("Eithos", "2"),
							createJSONObject("ElvfTech", "4"),
							createJSONObject("funki", "1"),
							createJSONObject("Knowcean", "1"),
							createJSONObject("Miniinvasive", "10"),
							createJSONObject("Nobit", "3"),
							createJSONObject("Pearch", "1"),
							createJSONObject("ReWheel", "7"),
							createJSONObject("Sammy", "1"),
							createJSONObject("Sannisole", "1"),
							createJSONObject("tranit", "2"),
							createJSONObject("Virtual Bartender", "4"),
							createJSONObject("KTH Innovation", "1"),
							createJSONObject("Startups", "1")
					)
			);
			graphNodeRepository.insert(graphNode29);

			GraphNode graphNode30 = new GraphNode(
					rangeMinSize + (rangeMaxSize - rangeMinSize) * random.nextDouble(),
					rangeMinDistance + (rangeMaxDistance - rangeMinDistance) * random.nextDouble(),
					rangeMinAngle + (rangeMaxAngle - rangeMinAngle) * random.nextDouble(),
					List.of(createJSONObject("Bruins", "10"),
							createJSONObject("Red Wings", "3"),
							createJSONObject("Panthers", "1"),
							createJSONObject("Senators", "7"),
							createJSONObject("Maple leafs", "1"),
							createJSONObject("Devils", "1"),
							createJSONObject("Rangers", "2"),
							createJSONObject("Islanders", "4"),
							createJSONObject("Penguins", "1"),
							createJSONObject("Capitals", "1"),
							createJSONObject("Flyers", "10"),
							createJSONObject("Blackhawks", "3"),
							createJSONObject("Ducks", "1"),
							createJSONObject("Kings", "7"),
							createJSONObject("Flames", "1"),
							createJSONObject("Canucks", "1"),
							createJSONObject("Golden Knights", "2"),
							createJSONObject("Sharks", "4"),
							createJSONObject("Oilers", "1"),
							createJSONObject("Coyotes", "1")
					)
			);
			graphNodeRepository.insert(graphNode30);
		};
	}
}
