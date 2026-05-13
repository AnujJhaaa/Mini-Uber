package com.miniuber.javaapp.entity;

public class Driver {
	private int driverId;
	private String name;
	private String emailAddress;
	private String password;
	private int currentLocationId;
	private boolean availability;
	private double rating;
	
	public Driver() {}

	public Driver(String name, String emailAddress, String password, int currentLocationId, boolean availability,
			double rating) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.password = password;
		this.currentLocationId = currentLocationId;
		this.availability = availability;
		this.rating = rating;
	}

	public int getDriverId() {
		return driverId;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public int getCurrentLocationId() {
		return currentLocationId;
	}

	public boolean isAvailability() {
		return availability;
	}

	public double getRating() {
		return rating;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCurrentLocationId(int currentLocationId) {
		this.currentLocationId = currentLocationId;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", name=" + name + ", emailAddress=" + emailAddress + ", password="
				+ password + ", currentLocationId=" + currentLocationId + ", availability=" + availability + ", rating="
				+ rating + "]";
	}
}
