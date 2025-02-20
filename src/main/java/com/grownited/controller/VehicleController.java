package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.grownited.entity.VehicleEntity;
import com.grownited.repository.VehicleRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class VehicleController { 
	@Autowired 
	VehicleRepository repositoryVehicle;
	
	@GetMapping("newvehicle")
	public String newVehicle() {
		return newVehicle();
	}
	
	@PostMapping("savevehicle")
	public String saveVehicle(VehicleEntity entityVehilce) {
	 repositoryVehicle.save(entityVehilce);
		return "";
	}
	
	
	

}
