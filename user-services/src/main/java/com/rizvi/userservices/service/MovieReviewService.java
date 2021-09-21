package com.rizvi.userservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizvi.userservices.entities.MovieReview;
import com.rizvi.userservices.model.MovieReviewDTO;
import com.rizvi.userservices.repository.MovieReviewRepository;
@Service
public class MovieReviewService {

	@Autowired
	private MovieReviewRepository repo;

	public MovieReviewDTO getMovieReview(String name) {
		MovieReview r = repo.findByMovieName(name);

		return new MovieReviewDTO(r.getId(), r.getMovieName(), r.getAvgRating());
	}
	
}
