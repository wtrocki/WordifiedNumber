package com.fexco.util.lang.vocabulary;

/**
 * Interface for all vocabularies. Associates human redable worlds with .
 * 
 * Do not using Java MessageBundles to improve visibility.
 * 
 * TODO Replace with enums
 */
public interface IVocabulary {

	static final String SEPRATOR = ", ";
	static final String WHITESPACE = " ";

	/**
	 * @param value
	 *            - input value. e.g. for Zero use 0, for Sixteen use 16.
	 * @return string representation of value
	 */
	String getFirstNineTeenFor(int value);

	/**
	 * @param value
	 *            - input value. e.g. for Twenty use 2..
	 * @return string representation of value
	 */
	String getTens(int value);

	/**
	 * @param value
	 *            input value e.g. for thousand use 1, for million use 2
	 * @param variantValue
	 *            variantValue only for language with different variants e.g (in
	 *            polish 1000 results with: jeden tysiac but 2000 results with:
	 *            dwa tysiace. If null return default variant.
	 * @return string representation of value
	 */
	String getScaleNumbers(int value, Integer variantValue);

	/**
	 * Expression linker
	 * 
	 * @return e.g "and" or "und" in some languages (e.g. polish) returns " " as
	 *         linker
	 */
	String getAnd();

	/**
	 * Gets hundert
	 * 
	 * @param vartiant
	 *            variantValue variantValue only for language with different
	 *            variants e.g (in polish 1000 results with: jeden tysiac but
	 *            2000 results with: dwa tysiace. If null return default variant
	 * @return @return e.g "and" or "und"
	 */
	String getHundred(Integer vartiant);

}
