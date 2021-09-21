package com.rizvi.movieticket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieTicket {
	@Id()
	private long id;
	@Column(name = "seat_no")
	private int seatNo;
	@Column(name = "is_seat_available")
	private boolean isSeatAvailabe;
	private double price;
	
	
	
	public MovieTicket() {
		super();
	}
	public MovieTicket(long id, int seatNo, boolean isSeatAvailabe, double price) {
		super();
		this.id = id;
		this.seatNo = seatNo;
		this.isSeatAvailabe = isSeatAvailabe;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public boolean isSeatAvailabe() {
		return isSeatAvailabe;
	}
	public void setSeatAvailabe(boolean isSeatAvailabe) {
		this.isSeatAvailabe = isSeatAvailabe;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MovieTicket [id=" + id + ", seatNo=" + seatNo + ", isSeatAvailabe=" + isSeatAvailabe + ", price="
				+ price + "]";
	}
	
	
	
}
