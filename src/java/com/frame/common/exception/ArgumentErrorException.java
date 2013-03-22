package com.frame.common.exception;

public class ArgumentErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ArgumentErrorException(String message) {
		super(message);
	}
}
