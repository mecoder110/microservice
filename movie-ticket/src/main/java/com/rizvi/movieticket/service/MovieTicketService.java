package com.rizvi.movieticket.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizvi.movieticket.entities.MovieTicket;
import com.rizvi.movieticket.model.MovieTicketDTO;
import com.rizvi.movieticket.persistence.MovieTicketRepository;

@Service
public class MovieTicketService {
	@Autowired
	private MovieTicketRepository repo;
	List<MovieTicketDTO> allTicket = new ArrayList<MovieTicketDTO>();

	public List<MovieTicketDTO> getAllTicket() {
		return repo.findAll().stream()
				.map(s -> new MovieTicketDTO(s.getId(), s.getSeatNo(), s.isSeatAvailabe(), s.getPrice()))
				.collect(Collectors.toList());
	}
	//fetch all seat
	public List<Integer> getAllSeat() {
		return repo.findAll().stream().map(s -> s.getSeatNo()).collect(Collectors.toList());
	}
	//
	public MovieTicketDTO toBook(int seatNo) {
		MovieTicket mt = repo.findBySeatNo(seatNo);
		if(mt.isSeatAvailabe()!=true) {throw new RuntimeException("Seat is not available, Kindly choose another seat");}
		else {
			mt.setSeatAvailabe(false);
			repo.save(mt);
		return new MovieTicketDTO(mt.getId(), mt.getSeatNo(), mt.isSeatAvailabe(), mt.getPrice());
		}
	}

	public boolean getSeatAvailable(int seatNo) {

		return repo.findBySeatNo(seatNo).isSeatAvailabe();
	}
}
