package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class StateController { 
	@GetMapping("states")
	public String states() {
		return "States";
	}
	

}
