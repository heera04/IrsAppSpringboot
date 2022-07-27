package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidCityException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidCityException(String message) {
		super(message);
	}

}
