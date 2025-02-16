package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name="vehicle")
public class ParkingEntitiy {
	private Integer parkingId;;
	private Integer title;
	private Integer address;
	private Integer locationId;
	private Integer ownerId;
	private Integer totalCapacityTwoWheeler;
	private Integer otherInformation;
	private Integer totalCapacityFourWheeler;
	private Integer active;
	private Integer HourlyChargeTwoWheeler;
	private Integer HourlyChargeFourWheeler;
	private Integer parkingType;
	private Integer lat;
	private Integer log;

}
