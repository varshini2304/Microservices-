package com.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-service")
public class BillerController {
    @GetMapping("/greet")
	public String hello() {
		return "Returning from billing service my greetings";
	}
}
