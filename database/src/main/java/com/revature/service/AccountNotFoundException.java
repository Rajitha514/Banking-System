package com.revature.service;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(String accNum) {
		super(accNum);
	}

}
