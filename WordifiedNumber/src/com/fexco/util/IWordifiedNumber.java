package com.fexco.util;

/**
 * Interface for number to words converters.
 */
public interface IWordifiedNumber {

	/**
	 * @param number
	 *            number to convert
	 * @return number in human readable form (e.g. one million one hundred)
	 * @throws InputException
	 *             - when number is out of range
	 */
	String toWords(int number) throws InputException;
}