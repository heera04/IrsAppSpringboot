package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidNameException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidNameException(String message) {
		super(message);
	}

}