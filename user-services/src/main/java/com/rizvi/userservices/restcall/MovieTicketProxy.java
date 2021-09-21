package com.rizvi.userservices.restcall;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rizvi.userservices.model.MovieTicketDTO;


@FeignClient(name = "movie-ticket")//, url = "localhost:8100")
public interface MovieTicketProxy {
	
	@GetMapping("/env")
	public String getEnv();

	@GetMapping("movie/ticket")
	public List<MovieTicketDTO> getTicket();
	
	@GetMapping("movie/seat")
	public List<Integer> getMovieSeat();
	
	@GetMapping("movie/book/seat/{seat}")
	public MovieTicketDTO bookMovieTicket(@PathVariable int seat);
	
	@GetMapping("movie/available/seat/{seat}")
	public boolean TicketAvailable(@PathVariable int seat);
}
