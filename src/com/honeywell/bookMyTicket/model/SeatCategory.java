/**
 * 
 */
package com.honeywell.bookMyTicket;

import java.math.BigDecimal;

/**
 * @author Hackathon
 *
 */
public class SeatCategory {
	
	private  Long id;
	private BigDecimal basePrice;
	private String categoryType;
	private Long noofSeats;
	private Long movieId;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	/**
	 * @return the categoryType
	 */
	public String getCategoryType() {
		return categoryType;
	}
	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	/**
	 * @return the noofSeats
	 */
	public Long getNoofSeats() {
		return noofSeats;
	}
	/**
	 * @param noofSeats the noofSeats to set
	 */
	public void setNoofSeats(Long noofSeats) {
		this.noofSeats = noofSeats;
	}
	/**
	 * @return the movieId
	 */
	public Long getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	
	

}
