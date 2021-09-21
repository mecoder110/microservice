package com.rizvi.userservices.model;

public class MovieTicketDTO {

	private long id;
	private int seatNo;	
	private boolean isSeatAvailabe;
	private double price;
	private String status;
	
	
	public MovieTicketDTO() {
		super();
	}
	public MovieTicketDTO(long id, int seatNo, boolean isSeatAvailabe, double price, String status) {
		super();
		this.id = id;
		this.seatNo = seatNo;
		this.isSeatAvailabe = isSeatAvailabe;
		this.price = price;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
