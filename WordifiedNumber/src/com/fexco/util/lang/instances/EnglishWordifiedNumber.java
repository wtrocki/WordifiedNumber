package com.fexco.util.lang.instances;

import com.fexco.util.lang.DefaultWordifiedNumber;
import com.fexco.util.lang.vocabulary.EnglishVocabulary;

/**
 * Converter for an English language. Use this class directly in your client or
 * by NumberConversionManager.
 */
public class EnglishWordifiedNumber extends DefaultWordifiedNumber {

	public EnglishWordifiedNumber() {
		// Injecting dictionary
		super(new EnglishVocabulary());
	}

}
