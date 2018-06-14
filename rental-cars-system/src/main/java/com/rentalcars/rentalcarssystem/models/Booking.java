package com.rentalcars.rentalcarssystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String start_date;

	private String end_date;
	
	private Car car;
	
	private User user;
	
	private Booking_state booking_state;

	public long getId() {
		return id;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Booking_state getBooking_state() {
		return booking_state;
	}

	public void setBooking_state(Booking_state booking_state) {
		this.booking_state = booking_state;
	}
	

}

