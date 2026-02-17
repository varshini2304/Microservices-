package com.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micro.model.User;
import com.micro.service.UserService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Controller
@RequestMapping("/api")
public class UserHomeController {
	private UserService userService;
    @GetMapping("/registerSuccess")
	public String get(User user,Model model) {
    	User gg = userService.addUser(user);
		model.addAttribute("user", gg);
    	return "FunSuccess";
	}
}
