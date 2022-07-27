package com.springboot.irsApp.exception;

import com.springboot.irsApp.exception.IrsAppException;

public class InvalidPhoneException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPhoneException(String message) {
		super(message);
	}

}
