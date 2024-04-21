package com.example.collectioncardsonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollectionCardsOnlineApplication {

	@RequestMapping
	String SayHello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(CollectionCardsOnlineApplication.class, args);
	}

}
