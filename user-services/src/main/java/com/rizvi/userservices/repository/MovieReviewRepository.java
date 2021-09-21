package com.rizvi.userservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rizvi.userservices.entities.MovieReview;

public interface MovieReviewRepository extends JpaRepository<MovieReview,Integer> {

	MovieReview findByMovieName(String name);
}
