package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.grownited.entity.ParkingEntity;

@Controller
public interface ParkingRepository extends JpaRepository<ParkingEntity, Integer>{
	
}
