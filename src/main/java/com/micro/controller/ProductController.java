package com.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/product-service")
public class ProductController {

	@GetMapping("/greet")
	public String hello() {
		return "Returning from Product service my greetings";
	}
}
