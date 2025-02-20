package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="reservation")
public class ReservationEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer reservationId;
	private Integer userId;
	private Integer parkingSlotId;
	private Integer parkingId;
	private Integer date;
	private Integer vehicleId;
	private Integer startTime;
	private Integer endTime;
	private String  paymentStatus;
	private Float   amountPaid;
	private Float   securityAmountPaid;
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getParkingSlotId() {
		return parkingSlotId;
	}
	public void setParkingSlotId(Integer parkingSlotId) {
		this.parkingSlotId = parkingSlotId;
	}
	public Integer getParkingId() {
		return parkingId;
	}
	public void setParkingId(Integer parkingId) {
		this.parkingId = parkingId;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Float amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Float getSecurityAmountPaid() {
		return securityAmountPaid;
	}
	public void setSecurityAmountPaid(Float securityAmountPaid) {
		this.securityAmountPaid = securityAmountPaid;
	}
	
	

}
