package com.honeywell.bookMyTicket.repository;

import java.util.HashMap;
import java.util.Map;

import com.honeywell.bookMyTicket.model.Theater;

public class TheatrRepository {
	
	private Map<Long, Theater> theaterData = new HashMap<>();
	
	public void addTheatr(Theater theatr)
	{
		theaterData.put(theatr.getId(), theatr);
	}
	
	public Theater getTheatr(Long id)
	{
		return theaterData.get(id);
	}

}
