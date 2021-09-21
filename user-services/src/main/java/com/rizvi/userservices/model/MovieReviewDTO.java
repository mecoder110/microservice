package com.rizvi.userservices.model;

public class MovieReviewDTO {

	private int id;
	private String movieName;
	private float avgRating;
	private float yourRating;
	
	
	public MovieReviewDTO() {
		super();
	}
	public MovieReviewDTO(int id, String movieName, float avgRating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.avgRating = avgRating;
		
	}
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
	public float getYourRating() {
		return yourRating;
	}
	public void setYourRating(float yourRating) {
		this.yourRating = yourRating;
	}
	
	
}
