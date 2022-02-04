package com;

import java.io.Serializable;

public class SearchFlightBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int flight_no;
	private String airline_name;
	private int price;
	private String source_city;
    private String destination_city;
	private String departure_time;
	private String arrival_time;
	private int total_seats;
	private int booked_searts;
	private int seat_available; 
	private String date_travel;
	
	public SearchFlightBean(){
		
	}
	
	
	public int getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSource_city() {
		return source_city;
	}
	public void setSource_city(String source_city) {
		this.source_city = source_city;
	}
	public String getDestination_city() {
		return destination_city;
	}
	public void setDestination_city(String destination_city) {
		this.destination_city = destination_city;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	public int getBooked_searts() {
		return booked_searts;
	}
	public void setBooked_searts(int booked_searts) {
		this.booked_searts = booked_searts;
	}
	public int getSeat_available() {
		return seat_available;
	}
	public void setSeat_available(int seat_available) {
		this.seat_available = seat_available;
	}
	public String getDate_travel() {
		return date_travel;
	}
	public void setDate_travel(String date_travel) {
		this.date_travel = date_travel;
	}
	
    
    
  
}
