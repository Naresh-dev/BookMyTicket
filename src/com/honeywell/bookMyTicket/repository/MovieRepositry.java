/**
 * 
 */
package com.honeywell.bookMyTicket.repository;

import com.honeywell.bookMyTicket.model.Movie;

/**
 * @author Hackathon
 *
 */
public class MovieRepositry {
	
private Map<Long, Movie> movieData = new HashMap<>();
	
	public void addShow(Movie movie)
	{
		movieData.put(movie.getId(), movie);
	}
	
	public Movie getMovie(Long id)
	{
		return movieData.get(id);
	}

}
