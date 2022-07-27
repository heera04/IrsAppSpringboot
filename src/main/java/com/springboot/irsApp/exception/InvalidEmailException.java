package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidEmailException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidEmailException(String message) {
		super(message);
	}

}


