package com.miniuber.javaapp.entity;

public class Location {
	private int locationId;
	private String name;

	public Location() {
	}

	public Location(int locationId, String name) {
		this.locationId = locationId;
		this.name = name;
	}

	public int getLocationId() {
		return locationId;
	}

	public String getName() {
		return name;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + "]";
	}
}
