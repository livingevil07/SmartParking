package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.LocationEntity;
import com.grownited.repository.LocationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LocationController { 
	@Autowired 
	LocationRepository repostitoryLocation;
	
	@GetMapping("newlocation")
	public String newLocation() {
		return "NewLocation";
	}
	
	@PostMapping("savelocation")
	public String saveLocation(LocationEntity entityLocation) {
		return "Location";
	}
	
	

}
