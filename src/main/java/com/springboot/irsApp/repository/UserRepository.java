package com.springboot.irsApp.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	private String successMessage = "UserRespository.REGISTRATION_SUCCESS";
	public String registerUser() {
		return successMessage;
	}
}