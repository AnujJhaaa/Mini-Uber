package com.miniuber.javaapp.entity;

public class Ride {
	private int rideId;
	private int userId;
	private int driverId;
	private int sourceId;
	private int destinationId;
	private int distance;
	
	public Ride() {}

	public Ride(int userId, int driverId, int sourceId, int destinationId, int distance) {
		this.userId = userId;
		this.driverId = driverId;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.distance = distance;
	}

	public int getRideId() {
		return rideId;
	}

	public int getUserId() {
		return userId;
	}

	public int getDriverId() {
		return driverId;
	}

	public int getSourceId() {
		return sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public int getDistance() {
		return distance;
	}

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", userId=" + userId + ", driverId=" + driverId + ", sourceId=" + sourceId
				+ ", destinationId=" + destinationId + ", distance=" + distance + "]";
	}
	
}
