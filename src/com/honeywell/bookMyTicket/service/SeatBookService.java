package com.honeywell.bookMyTicket.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.honeywell.bookMyTicket.model.BookTicketPrice;
import com.honeywell.bookMyTicket.model.BookTicketRequest;
import com.honeywell.bookMyTicket.model.SeatCategory;
import com.honeywell.bookMyTicket.model.SelectedSeat;

public class SeatBookService 
{
	
	public void checkout(List<BookTicketRequest> request)
	{
		List<BookTicketPrice> priceList = new ArrayList<>();
		request.stream().forEach(bookticketRequest -> {
			bookticketRequest.getSeatNumbers().stream().forEach(seatNumber ->
			{
				SeatCategory seatCategory = getSeatCategory(bookticketRequest.getSeatCategoryId());
				BookTicketPrice bookTicketPrice = new BookTicketPrice();
				bookTicketPrice.setBasePrice(seatCategory.getBasePrice());
				bookTicketPrice.setSeatNumber(seatNumber);
				bookTicketPrice.setCategoryId(bookticketRequest.getSeatCategoryId());
				updateThePrice(bookTicketPrice, seatCategory);
				priceList.add(bookTicketPrice);
			});
		});
	}

	private void updateThePrice(BookTicketPrice bookTicketPrice, SeatCategory seatCategory) {
		SelectedSeat selectedSeat = getSelectedSeat(seatCategory.getCategoryType(),bookTicketPrice);
		if(selectedSeat == null)
		{
			//No Seats are selected keep original price
			bookTicketPrice.setIncreaseFactor(new Double(0.0));
			bookTicketPrice.setNewPrice(seatCategory.getBasePrice());
			return;
		}
		Double increaseFactor = (double) ((selectedSeat.getCountSelected()*seatCategory.getIncreaseFactor())/100);
		bookTicketPrice.setIncreaseFactor(increaseFactor);
		BigDecimal newPrice = seatCategory.getBasePrice().add(seatCategory.getBasePrice().multiply(new BigDecimal(increaseFactor)));
		bookTicketPrice.setNewPrice(newPrice);
		
	}

	private SelectedSeat getSelectedSeat(String categoryType, BookTicketPrice bookTicketPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	private SeatCategory getSeatCategory(Long seatCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
