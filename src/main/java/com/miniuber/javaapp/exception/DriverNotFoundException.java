package com.miniuber.javaapp.exception;

public class DriverNotFoundException extends RuntimeException {

	public DriverNotFoundException() {
		super();
	}

	public DriverNotFoundException(String message) {
		super(message);
	}
}