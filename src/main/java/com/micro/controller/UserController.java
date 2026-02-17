package com.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user-service")
public class UserController {

	@GetMapping("/greet")
	public String hello() {
		return "Returning from User service my greetings";
	}
}
