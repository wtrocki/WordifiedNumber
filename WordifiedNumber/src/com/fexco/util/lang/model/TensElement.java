package com.fexco.util.lang.model;

/**
 * Tens element of integer e.g 2 for "20", 5 for "50".
 */
public class TensElement {

	private int value;

	public TensElement(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static TensElement createFor(int value) {
		assert value <= 19 && value > 0;
		return new TensElement(value);
	}
}
