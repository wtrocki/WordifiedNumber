package com.fexco.util.lang.vocabulary;

/**
 * English language vocabulary
 */
public class EnglishVocabulary implements IVocabulary {

	private static String[] firstNineteen = new String[] { "zero", "one", "two", "three",
			"four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", };

	private static String[] tens = new String[] { "", "", "twenty", "thirty", "forty",
			"fifty", "sixty", "seventy", "eighty", "ninety", };

	private static String[] factor = new String[] { "", "thousand", "million", "million", };

	@Override
	public String getFirstNineTeenFor(int value) {
		if (value >= 0 && value <= 19) {
			return firstNineteen[value];
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String getTens(int value) {
		if (value >= 2 && value <= 9) {
			return tens[value];
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String getScaleNumbers(int value, Integer variantValue) {
		if (variantValue != null) {
			throw new IllegalArgumentException("No support for variants in this language");
		}
		if (value >= 0 && value <= 3) {
			return factor[value];
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String getAnd() {
		return " and ";
	}

	@Override
	public String getHundred(Integer vartiant) {
		return "Hundred";
	}
}
