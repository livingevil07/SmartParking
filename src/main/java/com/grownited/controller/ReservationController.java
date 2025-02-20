package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.ReservationEntity;
import com.grownited.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ReservationController {

	@Autowired
	ReservationRepository repositoryReservation;
 
	@GetMapping("newreservation")
	public String newReservation() {
		return"NewReservation";
	}

	
	@PostMapping("savereservation")
	public String saveReservation(ReservationEntity  entityReservation) {
		repositoryReservation.save(entityReservation);
		return "";
	}
	
}
