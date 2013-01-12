package com.fexco.util;

/**
 * Exception for invalid integer input
 */
public class InputException extends IllegalArgumentException {

	private static final long serialVersionUID = 3681933121804351452L;

	public InputException(String message) {
		super(message);
	}

}
