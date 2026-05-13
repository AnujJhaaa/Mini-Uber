package com.miniuber.javaapp.entity;

public class Edge {
	private int edgeId;
	private int sourceId;
	private int destinationId;
	private int distance;

	public Edge() {
	}

	public Edge(int edgeId, int sourceId, int destinationId, int distance) {
		this.edgeId = edgeId;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.distance = distance;
	}

	public int getEdgeId() {
		return edgeId;
	}

	public void setEdgeId(int edgeId) {
		this.edgeId = edgeId;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Edge [edgeId=" + edgeId + ", sourceId=" + sourceId + ", destinationId=" + destinationId + ", distance="
				+ distance + "]";
	}
}
