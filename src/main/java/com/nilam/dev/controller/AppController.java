package com.nilam.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String viewRegister() {
		return "register";
	}
	
	@GetMapping("/login")
	public String viewLogin() {
		return "login";
	}
}
