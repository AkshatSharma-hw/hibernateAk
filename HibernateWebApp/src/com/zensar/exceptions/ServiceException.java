package com.zensar.exceptions;

public class ServiceException extends Exception {
	
	private String errorMessage;

	public  ServiceException() {
		errorMessage="error:Service exception";
		 
	}
	
	public  ServiceException(String errorMessage) {
		super();
		this.errorMessage=errorMessage;
		 
	}

	@Override
	public String toString() {
		return "ServiceException [errorMessage=" + errorMessage + "]";
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	

}
