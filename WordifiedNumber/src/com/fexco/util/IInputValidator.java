package com.fexco.util;

/**
 * Interface for all integer input validators.
 */
public interface IInputValidator {
	void validate(int input) throws InputException;
}
