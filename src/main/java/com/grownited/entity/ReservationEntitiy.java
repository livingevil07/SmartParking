package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name="reservation")
public class ReservationEntitiy {

	private Integer reservationId;
	private Integer userId;
	private Integer parkingSlotId;
	private Integer parkingId;
	private Integer date;
	private Integer vehicleId;
	private Integer startTime;
	private Integer endTime;
	private Integer paymentStatus;
	private Integer amountPaid;
	private Integer securityAmountPaid;

}
