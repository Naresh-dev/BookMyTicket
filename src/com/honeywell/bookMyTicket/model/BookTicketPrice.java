package com.honeywell.bookMyTicket.model;

import java.math.BigDecimal;

public class BookTicketPrice {
	
	Long categoryId;
	Long seatNumber;
	BigDecimal newPrice;
	BigDecimal basePrice;
	Double increaseFactor;
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Long seatNumber) {
		this.seatNumber = seatNumber;
	}
	public BigDecimal getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(BigDecimal newPrice) {
		this.newPrice = newPrice;
	}
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	public Double getIncreaseFactor() {
		return increaseFactor;
	}
	public void setIncreaseFactor(Double increaseFactor) {
		this.increaseFactor = increaseFactor;
	}
	

}
