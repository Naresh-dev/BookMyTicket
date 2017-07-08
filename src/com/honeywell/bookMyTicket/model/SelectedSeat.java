package com.honeywell.bookMyTicket.model;

public class SelectedSeat {
	Long seatCategoryId;
	Long seatNumber;
	Long countSelected;
	
	public Long getSeatCategoryId() {
		return seatCategoryId;
	}
	public void setSeatCategoryId(Long seatCategoryId) {
		this.seatCategoryId = seatCategoryId;
	}
	public Long getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Long seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Long getCountSelected() {
		return countSelected;
	}
	public void setCountSelected(Long countSelected) {
		this.countSelected = countSelected;
	}
}
