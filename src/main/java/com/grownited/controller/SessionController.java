package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
	//signup.jsp
	@GetMapping("signup.jsp")
	public String signup() {
		return "Signup";
	} 
	
	public String login() { 
		return "Login";
	}
	
}