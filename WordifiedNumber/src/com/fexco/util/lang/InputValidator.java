package com.fexco.util.lang;

import com.fexco.util.IInputValidator;
import com.fexco.util.InputException;

/**
 * Default validator for an integer input
 */
public class InputValidator implements IInputValidator {

	/**
	 * Limit for integer value.
	 */
	static final int LIMIT = 999999999;

	@Override
	public void validate(int input) throws InputException {
		if (input > LIMIT || input < 0) {
			throw new InputException("Number " + input + " out of range.");
		}
	}
}
