package com.glen.thymeleaf.controller;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.glen.thymeleaf.command.LoginCommand;

@Controller
public class AuthController {

	@GetMapping("/login")
	public String getLoginForm(Model model) {
		model.addAttribute("loginCommand",new LoginCommand());
		return "loginForm";
	}
	
	@PostMapping("/authenticateUser")
	public String authenticateUser(
			@Valid LoginCommand loginCommand,
			BindingResult bindingResult
	) {
		System.out.println("login");
		if(bindingResult.hasErrors()) {
			return "loginForm";
		}
		return "redirect:/";
	}
}
