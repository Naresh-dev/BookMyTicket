/**
 * 
 */
package com.honeywell.bookMyTicket.repository;

import com.honeywell.bookMyTicket.model.Show;
import com.honeywell.bookMyTicket.model.Theater;

/**
 * @author Hackathon
 *
 */
public class ShowRepositry {
	
private Map<Long, Show> showData = new HashMap<>();
	
	public void addShow(Show show)
	{
		showData.put(show.getId(), show);
	}
	
	public Theater getShow(Long id)
	{
		return showData.get(id);
	}

}
