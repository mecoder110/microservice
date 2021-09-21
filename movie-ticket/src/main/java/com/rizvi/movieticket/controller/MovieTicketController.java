package com.rizvi.movieticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizvi.movieticket.model.MovieTicketDTO;
import com.rizvi.movieticket.service.MovieTicketService;

@RestController()
public class MovieTicketController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private MovieTicketService movieTicketService;
	List<MovieTicketDTO> allMovieTicket = new ArrayList<MovieTicketDTO>();

	@GetMapping("movie/ticket")
	public List<MovieTicketDTO> getMovieTicket() {
		return movieTicketService.getAllTicket();

	}

	@GetMapping("movie/seat")
	public List<Integer> getMovieSeat() {
		return movieTicketService.getAllSeat();

	}
	@GetMapping("movie/book/seat/{seat}")
	public MovieTicketDTO bookMovieTicket(@PathVariable int seat) {
		System.out.println(seat);
		MovieTicketDTO mtDto = movieTicketService.toBook(seat);
		mtDto.setStatus("you just booked");
		mtDto.setSeatAvailabe(true);
		return mtDto;
		}
	
	@GetMapping("movie/available/seat/{seat}")
	public boolean TicketAvailable(@PathVariable int seat) {
		
		return movieTicketService.getSeatAvailable(seat);
		
		}
	@GetMapping("/env")
	public String getEnv() {
		return env.getProperty("local.server.port");
	}

}
