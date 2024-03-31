package com.travelplanner.travelservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/Hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}