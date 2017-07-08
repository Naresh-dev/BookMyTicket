/**
 * 
 */
package com.honeywell.bookMyTicket.model;

/**
 * @author Hackathon
 *
 */

public class BookTicketRequest {
	Long seatCategoryId;
	String[] seatNumbers;
	public Long getSeatCategoryId() {
		return seatCategoryId;
	}
	public void setSeatCategoryId(Long seatCategoryId) {
		this.seatCategoryId = seatCategoryId;
	}
	public String[] getSeatNumbers() {
		return seatNumbers;
	}
	public void setSeatNumbers(String[] seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

}
