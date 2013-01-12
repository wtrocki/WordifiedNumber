package com.fexco.util.lang.vocabulary;

/**
 * Polish language vocabulary
 */
public class PolishVocabulary implements IVocabulary {

	private static final String[] firstNineteen = { "zero", "jeden", "dwa", "trzy",
			"cztery", "pi��", "sze��", "siedem", "osiem", "dziewi��", "dziesi��",
			"jedyna�cie", "dwana�cie", "trzyna�cie", "czterna�cie", "pietna�cie",
			"szestna�cie", "siedemna�cie", "osiemna�cie", "dziewietna�cie", };

	private static final String[] tens = { "", "", "dwadzie�cia", "trzydzie�ci",
			"czterdzie�ci", "pi��dziesi�t", "sze��dziesi�t", "siedemdziesi�t",
			"osiemdziesi�t", "dziewi��dziesi�t", };

	private static final String[] variant1 = { "", "tysi��", "milion", "bilion", };

	private static final String[] variant2 = { "", "tysi�ce", "miliony", "biliony", };

	private static final String[] variant3 = { "", "tysi�cy", "milion�w", "bilion�w", };

	private static final String[][] scalleVariants = new String[][] { variant1, variant2,
			variant3, };

	private static final String[] hundredVariants = { "sto", "dwie�cie", "trzysta",
			"czterysta", "pi��set", "sze��set", "siedemset", "osiemset", "dziewi��set", };

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
		String[] factor;
		if (variantValue == null) {
			factor = scalleVariants[0];
		} else if (variantValue < 0 && variantValue > scalleVariants.length - 1) {
			throw new IllegalArgumentException();
		} else {
			factor = scalleVariants[variantValue];
		}

		if (value >= 0 && value <= 3) {
			return factor[value];
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String getAnd() {
		return " ";
	}

	/**
	 *   
	 */
	@Override
	public String getHundred(Integer variant) {
		if (variant != null) {
			if (hundredVariants.length < variant) {
				throw new IllegalArgumentException("Illegal variant");
			}
			return hundredVariants[variant - 1];
		} else {
			return hundredVariants[0];
		}
	}
}
