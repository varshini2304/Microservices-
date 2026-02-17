package com.micro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.UserDto;

@RestController
public class GateWayRestController {
	private final String targetUrl="http://localhost:9203/api";
	@PostMapping("/register")
	public ResponseEntity<String> reso(@RequestParam UserDto user,Model model){
		model.addAttribute("user", user);
		return ResponseEntity.ok(targetUrl+"/registerSuccess");
		
	}
}
