package com.miniuber.javaapp.entity;

public class Node {

	private String name;
	private int distance;

	public Node(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + distance + ")";
	}

}
