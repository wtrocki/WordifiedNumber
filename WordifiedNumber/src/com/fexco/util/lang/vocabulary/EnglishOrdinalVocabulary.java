package com.fexco.util.lang.vocabulary;

/**
 * Ordinal vocabulary (English)
 * 
 * TODO DRY - subclass for English vocabulary.
 * 
 * TODO Link with DefaultWordifiedNumber
 */
public class EnglishOrdinalVocabulary implements IVocabulary {

	private static final String[] firstNineteen = { "zero", "first", "second", "third",
			"fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
			"eleventh", "twelfth", "thirteenth", "fourteenth", "fourteen", "fifteenth",
			"sixteenth", "seventeenth", "eighteenth", "nineteenth", };

	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety", };

	private static final String[] scalleNumbers = { "", "thousand", "million", "billion", };

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
			return scalleNumbers[value];
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
