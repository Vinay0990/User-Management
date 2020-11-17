package com.nilam.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nilam.dev.model.User;
import com.nilam.dev.repository.UserRepository;

@Controller
public class AppController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/process_login")
	public String postLogin(User user) {
		User temp = repository.findByEmail(user.getEmail());
		if(temp.getPassword().equals(user.getPassword())) {
			System.out.println("yes found");
		}else {
			System.out.println("no");
		}
		return "index";
	}
	
	@PostMapping("/process_register")
	public String postRegister(User user) {
		repository.save(user);
		return "index";
	}
}
