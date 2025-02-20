package com.grownited.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;

@Controller
public class SessionController {
	//signup.jsp
	@GetMapping("login")
	public String login(String email,String password) {
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