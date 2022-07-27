package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidPasswordException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPasswordException(String message) {
		super(message);
	}

}