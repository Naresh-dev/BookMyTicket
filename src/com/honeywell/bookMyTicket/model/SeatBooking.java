/**
 * 
 */
package com.honeywell.bookMyTicket.model;

import java.math.BigDecimal;

/**
 * @author Hackathon
 *
 */
public class SeatBooking {
	
	private Long seatNumber;
	private Long seatCategoryId;
	private Boolean isBooked;
	private BigDecimal price;
	
	/**
	 * @return the seatCategoryId
	 */
	public Long getSeatCategoryId() {
		return seatCategoryId;
	}
	/**
	 * @param seatCategoryId the seatCategoryId to set
	 */
	public void setSeatCategoryId(Long seatCategoryId) {
		this.seatCategoryId = seatCategoryId;
	}
	/**
	 * @return the isBooked
	 */
	public Boolean getIsBooked() {
		return isBooked;
	}
	/**
	 * @param isBooked the isBooked to set
	 */
	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	
	
	

}
