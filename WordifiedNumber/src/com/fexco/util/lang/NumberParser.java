package com.fexco.util.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fexco.util.InputException;
import com.fexco.util.lang.model.GroupElement;

/**
 * Parser for numbers.
 * 
 * Creates simple flat structure basing on all subclasses of
 * {@code IModelElement}.
 */
public class NumberParser {

	public NumberParser() {
	}

	/**
	 * Creates model for provided number
	 */
	public List<GroupElement> toGroups(int number) throws InputException {
		// Zero case
		if (number == 0) {
			GroupElement groupElement = new GroupElement(0);
			groupElement.createFirstNineteenElement(0);
			return Collections.singletonList(groupElement);
		}

		List<GroupElement> digitGroups = createGroups(number);

		// Convert each three-digit group to words
		for (GroupElement element : digitGroups) {
			convertGroupToWord(element);
		}
		return digitGroups;
	}

	/**
	 * @param number
	 *            input number
	 * @return 3 digit groups, for example: 114 399 has two groups {114,399}
	 */
	protected List<GroupElement> createGroups(int number) {
		List<GroupElement> digitGroups = new ArrayList<>(4);
		int value = number;
		while (number != 0) {
			value = number % 1000;
			digitGroups.add(new GroupElement(value));
			number /= 1000;
		}
		return digitGroups;
	}

	/**
	 * Converts a three-digit group into words
	 * 
	 * @param group
	 * @return string representation
	 */
	protected void convertGroupToWord(GroupElement group) {
		// Split to two parts: > 100 and < 100
		int tensPart = group.value % 100;
		int hundredsPart = group.value / 100;

		// Split to the tens and units
		int singleTens = tensPart / 10;
		int units = tensPart % 10;

		// Tens and units
		if (singleTens >= 2) {
			group.createTens(singleTens);
			if (units != 0) {
				group.createFirstNineteenElement(units);
			}
		} else if (tensPart != 0) {
			group.createFirstNineteenElement(tensPart);
		}

		// Hundreds
		if (hundredsPart != 0) {
			group.createHundreds(hundredsPart);
		}
	}

}
