package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class VehicleEntitiy { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	private Integer userId;
	private Integer registratiomNumber;
	private Integer vehicleType;
	
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRegistratiomNumber() {
		return registratiomNumber;
	}
	public void setRegistratiomNumber(Integer registratiomNumber) {
		this.registratiomNumber = registratiomNumber;
	}
	public Integer getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(Integer vehicleType) {
		this.vehicleType = vehicleType;
	}
	

}
