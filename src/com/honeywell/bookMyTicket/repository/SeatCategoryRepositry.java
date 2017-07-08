/**
 * 
 */
package com.honeywell.bookMyTicket.repository;

import com.honeywell.bookMyTicket.model.SelectedSeat;

/**
 * @author Hackathon
 *
 */
public class SeatCategoryRepositry {
	
	private Map<Long, SeatCategory> seatCategoryData = new HashMap<>();
	public void seatCategory(SeatCategory seatCategory)
	{
		seatCategoryData.put(SeatCategory.getId(), seatCategory);
	}
	
	public SeatCategory getSeatCategory(Long id)
	{
		return seatCategoryData.get(id);
	}

}
