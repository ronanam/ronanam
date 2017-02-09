package com.ktds.ronanam.exceptions;

/**
 * 무언가를 적어야하는데 적지 않았을 때
 * 
 * @author ronanam (ronanam992@gmail.com)
 *
 */
public class MissingValueException extends Exception {
	/*
	 * The serializable class MissingValueException does not declare a static
	 * final serialVersionUID field of type long
	 */
	private static final long serialVersionUID = 7131050079711384585L;

	
	// Constructor
	public MissingValueException() {
		super();

	}

//	Exception이 상속하고 있는 것. Throwable(Serialize를 인터페이스로 상속하고 있음.) 예외의 가장 상위. 
	public MissingValueException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public MissingValueException(String message, Throwable cause) {
		super(message, cause);

	}

	public MissingValueException(String message) {
		super(message);

	}

	public MissingValueException(Throwable cause) {
		super(cause);

	}

}
