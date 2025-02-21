package com.grownited.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller 
public class UsersController { 
			@Autowired
	      UserRepository repositoryUser;  
			
			@GetMapping(value = {"/","signup"})
			public String signup() {
				return "Signup";
			} 
	
			
	@GetMapping("newuser")
	public String newUser() {
		return "NewUser";
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity entityUser) {
		repositoryUser.save(entityUser);
	return "Login";
	} 
	

	@GetMapping("listuser")
	public String listUser(Model model) {
		List<UserEntity> userList=repositoryUser.findAll();
		model.addAttribute("userList",userList);
		return "ListUser";
	}
	
	@GetMapping("viewuser")
	public String viewUser(Integer userId , Model model) {
		System.out.println("id ===>"+userId);
		return "viewuser";
		
	}
	
	
}
