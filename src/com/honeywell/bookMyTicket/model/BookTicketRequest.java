/**
 * 
 */
package com.honeywell.bookMyTicket.model;

import java.util.List;

/**
 * @author Hackathon
 *
 */
public class BookTicketRequest {
	Long seatCategoryId;
	List<Long> seatNumbers;
	public Long getSeatCategoryId() {
		return seatCategoryId;
	}
	public void setSeatCategoryId(Long seatCategoryId) {
		this.seatCategoryId = seatCategoryId;
	}
	public List<Long> getSeatNumbers() {
		return seatNumbers;
	}
	public void setSeatNumbers(List<Long> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

}
