package com.fexco.util.lang.model;

/**
 * Element for expressing number of hundreds. e.g. 1 for "100" etc.
 */
public class HundredElement implements IModelElement {

	private int value;

	public HundredElement(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static HundredElement createFor(int value) {
		assert value <= 9 && value > 0;
		return new HundredElement(value);
	}
}
