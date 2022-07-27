package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidUserIDException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidUserIDException(String message) {
		super(message);
	}

}

