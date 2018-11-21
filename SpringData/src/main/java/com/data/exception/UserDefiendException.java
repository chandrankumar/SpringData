package com.data.exception;

public class UserDefiendException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2611019730076059499L;

	public UserDefiendException() {
		super();
	}

	public UserDefiendException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserDefiendException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDefiendException(String message) {
		super(message);
	}

	public UserDefiendException(Throwable cause) {
		super(cause);
	}

}
