package com.practice1.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

	public EmployeeNotFoundException() {
		super();
	}

}
