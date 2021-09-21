package com.rizvi.userservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rizvi.userservices.model.MovieReviewDTO;
import com.rizvi.userservices.model.MovieTicketDTO;
import com.rizvi.userservices.restcall.MovieTicketProxy;
import com.rizvi.userservices.service.MovieReviewService;

@RestController
public class UserController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private MovieTicketProxy proxy;
	@Autowired
	private MovieReviewService mRService;
	
	@GetMapping("/movie/review/name/{name}")
	public MovieReviewDTO getMovieReview(@PathVariable String name) {		
		return mRService.getMovieReview(name);
	}
	//proxy method call
	@GetMapping("movie/ticket")
	public List<MovieTicketDTO> getMovieTicket() {
		return proxy.getTicket();
		
	}
	@GetMapping("movie/seat")
	public List<Integer> getMovieSeat(){
		return proxy.getMovieSeat();
	}
	
	@GetMapping("movie/book/seat/{seat}")
	public MovieTicketDTO bookMovieTicket(@PathVariable int seat) {
		return proxy.bookMovieTicket(seat);
	}
	
	@GetMapping("movie/available/seat/{seat}")
	public boolean TicketAvailable(@PathVariable int seat) {
		return proxy.TicketAvailable(seat);
		
	}
	@GetMapping("/env")
	public String getEnv() {
		return proxy.getEnv();
	}
}
