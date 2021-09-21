package com.rizvi.userservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieReview {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "avg_rating")
	private float avgRating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	
	
	
}
