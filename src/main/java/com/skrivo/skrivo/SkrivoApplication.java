package com.skrivo.skrivo;

import com.usernodes.GraphNode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SkrivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkrivoApplication.class, args);
	}

	@GetMapping
	public List<GraphNode> hello(){
		return List.of(new GraphNode(134, 0.5, 3.6, 2.0));
	}

	/*
	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "World");
	}
	*/

}
