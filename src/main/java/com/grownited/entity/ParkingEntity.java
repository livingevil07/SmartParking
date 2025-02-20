package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="vehicle")
public class ParkingEntity { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parkingId;;
	private String title;
	private String address;
	private Integer locationId;
	private Integer ownerId;
	private Integer totalCapacityTwoWheeler;
	private String  otherInformation;
	private Integer totalCapacityFourWheeler;
	private Boolean active;
	private Integer HourlyChargeTwoWheeler;
	private Integer HourlyChargeFourWheeler;
	private String parkingType;
	private Float lat;
	private Float log;
	
	
	public Integer getParkingId() {
		return parkingId;
	}
	public void setParkingId(Integer parkingId) {
		this.parkingId = parkingId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Integer getTotalCapacityTwoWheeler() {
		return totalCapacityTwoWheeler;
	}
	public void setTotalCapacityTwoWheeler(Integer totalCapacityTwoWheeler) {
		this.totalCapacityTwoWheeler = totalCapacityTwoWheeler;
	}
	public String getOtherInformation() {
		return otherInformation;
	}
	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}
	public Integer getTotalCapacityFourWheeler() {
		return totalCapacityFourWheeler;
	}
	public void setTotalCapacityFourWheeler(Integer totalCapacityFourWheeler) {
		this.totalCapacityFourWheeler = totalCapacityFourWheeler;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Integer getHourlyChargeTwoWheeler() {
		return HourlyChargeTwoWheeler;
	}
	public void setHourlyChargeTwoWheeler(Integer hourlyChargeTwoWheeler) {
		HourlyChargeTwoWheeler = hourlyChargeTwoWheeler;
	}
	public Integer getHourlyChargeFourWheeler() {
		return HourlyChargeFourWheeler;
	}
	public void setHourlyChargeFourWheeler(Integer hourlyChargeFourWheeler) {
		HourlyChargeFourWheeler = hourlyChargeFourWheeler;
	}
	public String getParkingType() {
		return parkingType;
	}
	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}
	public Float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public Float getLog() {
		return log;
	}
	public void setLog(Float log) {
		this.log = log;
	}
	
	
	
}
