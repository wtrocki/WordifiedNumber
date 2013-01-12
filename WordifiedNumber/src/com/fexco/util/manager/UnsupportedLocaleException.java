package com.fexco.util.manager;

/**
 * Exception thrown when user wants to fetch conventer for unsupported locale
 */
public class UnsupportedLocaleException extends Exception {

	public UnsupportedLocaleException(String string) {
		super(string);
	}

	private static final long serialVersionUID = 4552342332L;
}
