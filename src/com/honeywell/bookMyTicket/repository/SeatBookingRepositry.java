/**
 * 
 */
package com.honeywell.bookMyTicket.repository;

import com.honeywell.bookMyTicket.model.SelectedSeat;

/**
 * @author Hackathon
 *
 */
public class SeatBookingRepositry {
	
	private Map<Long, SeatBooking> seatBookingData = new HashMap<>();
	public void SeatBooking(SeatBooking seatBooking)
	{
		selectedSeatData.put(SeatBooking.getId(), seatBooking);
	}
	
	public SeatBooking getSeatBooking(Long id)
	{
		return seatBookingData.get(id);
	}


}
