/**
 * 
 */
package com.honeywell.bookMyTicket.model;

/**
 * @author Hackathon
 *
 */
public class SeatBooking {
	
	private String SeatNumber;
	private Long seatCategoryId;
	private Boolean isBooked;
	/**
	 * @return the seatNumber
	 */
	public String getSeatNumber() {
		return SeatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(String seatNumber) {
		SeatNumber = seatNumber;
	}
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
