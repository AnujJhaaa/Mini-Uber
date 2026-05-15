package com.miniuber.javaapp.exception;

public class RideNotFoundException extends RuntimeException {
	public RideNotFoundException() {
		super();
	}

	public RideNotFoundException(String message) {
		super(message);
	}
}