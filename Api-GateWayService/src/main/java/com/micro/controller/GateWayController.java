package com.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micro.model.UserDto;

@Controller
public class GateWayController {
	private final String targetUrl="http://localhost:9203/api";
    @GetMapping("/")
	public String hello() {
		return "index";
	}
//    @GetMapping("/register")
//    public String register(UserDto user,Model model) {
//    	model.addAttribute("user", user);
//		return "redirect :targetUrl+/registerSuccess";
//    	
//    }
}
