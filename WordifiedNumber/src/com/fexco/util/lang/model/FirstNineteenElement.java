package com.fexco.util.lang.model;

/**
 * Element below 20: one of following one,two...Eighteen,Nineteen
 */
public class FirstNineteenElement implements IModelElement {

	private int value;

	public FirstNineteenElement(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static FirstNineteenElement createFor(int value) {
		assert value <= 19 && value >= 0;
		return new FirstNineteenElement(value);
	}
}
