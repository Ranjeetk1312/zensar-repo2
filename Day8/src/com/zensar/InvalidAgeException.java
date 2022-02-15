package com.zensar;

//Example for custom checked/compile-time exception 
public class InvalidAgeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age is Invalid";
	}

}
