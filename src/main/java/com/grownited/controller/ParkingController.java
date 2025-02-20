package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.ParkingEntity;
import com.grownited.repository.ParkingRepository;

//import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ParkingController {
	
	@Autowired 
	ParkingRepository repositoryParking; 
	
	@GetMapping("newparking")
	public String  newParking() {
		return "newParking";
	}
	
	@PostMapping("saveparking")
	public String saveParking(ParkingEntity entityParking) {
		repositoryParking.save(entityParking);
		return "SaveParking";
		
	}
	

}
