package com.miniuber.javaapp.exception;

public class NoDriverAvailableException extends RuntimeException {
	public NoDriverAvailableException() {
		super();
	}

	public NoDriverAvailableException(String message) {
		super(message);
	}
}