/**
 * 
 */
package com.honeywell.bookMyTicket.repository;

import com.honeywell.bookMyTicket.model.Movie;

/**
 * @author Hackathon
 *
 */
public class SelectedSeatRepositry {
	
	private Map<Long, SelectedSeat> selectedSeatData = new HashMap<>();
	public void SelectedSeat(SelectedSeat selectedSeat)
	{
		selectedSeatData.put(SelectedSeat.getId(), selectedSeat);
	}
	
	public SelectedSeat getSelectedSeat(Long id)
	{
		return selectedSeatData.get(id);
	}

}
