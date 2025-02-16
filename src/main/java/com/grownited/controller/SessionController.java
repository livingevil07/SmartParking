package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.UserEntity;

@Controller
public class SessionController {
	//signup.jsp
	@GetMapping(value = {"/","signup"})
	public String signup() {
		return "Signup";
	} 
	
	@GetMapping("login")
	public String login(String email,String password) {
		return "Login";
	} 
	
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity) {
		System.out.println(userEntity.getFirstName());
		System.out.println(userEntity.getLastName());
		System.out.println(userEntity.getGender());
		System.out.println(userEntity.getPassword());		
	return "Login";
	}
	
	@GetMapping("changepassword")
	public String changepassword() {
		return "ChangePassword";
	}  
	
	@GetMapping("/forgotpassword")
	public String forgotPassword() {
		return "ForgotPassword";
	} 
	
	@PostMapping("sendOtp")
	public String sendOtp() {
		return "ChangePassword";
	}

	@PostMapping("updatepassword")
	public String updatePassword() {
		return "Login";
	}
	
}