package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/welcome")
	public String welcomeMethod() {
		return "Welcome!!!";
	}
	
	@GetMapping("/greeting")
	public String greetingMethod() {
		return "greeting method";
	}
	@GetMapping("/hello")
	public String helloMethod() {
		return "hello";
	}
	
	@PostMapping("/user")
	
	

}
