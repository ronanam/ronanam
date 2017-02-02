package com.ktds.ronanam.exceptions;

public class MissmatchValueException extends /*Exception*/RuntimeException{
	private static final long serialVersionUID = -2816413466738328750L;

	//Constructor 생성.
	public MissmatchValueException() {
		super();
	}

	public MissmatchValueException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MissmatchValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public MissmatchValueException(String message) {
		super(message);
	}

	public MissmatchValueException(Throwable cause) {
		super(cause);
	}

}
