package com.fexco.util.lang.model;

/**
 * Structure for handling 3 digits integer groups.
 * 
 */
public class GroupElement implements IModelElement {

	public int value;
	public String groupText;

	public HundredElement hundredElement;
	public FirstNineteenElement firstNineteenElement;
	public TensElement tens;

	public GroupElement(int value) {
		this.value = value;
	}

	public void createHundreds(int number) {
		hundredElement = HundredElement.createFor(number);
	}

	public void createFirstNineteenElement(int number) {
		firstNineteenElement = FirstNineteenElement.createFor(number);
	}

	public void createTens(int number) {
		tens = TensElement.createFor(number);
	}
}
