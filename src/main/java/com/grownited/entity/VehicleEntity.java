package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class VehicleEntity { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	private Integer userId;
	private String registratiomNum;
	private String vehicleType;
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
	public String getRegistratiomNum() {
		return registratiomNum;
	}
	public void setRegistratiomNum(String registratiomNum) {
		this.registratiomNum = registratiomNum;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	

}
