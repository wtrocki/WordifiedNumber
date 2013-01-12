package com.fexco.util.lang.instances;

import com.fexco.util.lang.DefaultWordifiedNumber;
import com.fexco.util.lang.PolishWalker;

/**
 * Converter for an Polish language. Use this class directly in your client or
 * by NumberConversionManager.
 */
public class PolishWordifiedNumber extends DefaultWordifiedNumber {

	public PolishWordifiedNumber() {
		// Injecting custom walker and dictionary
		super(new PolishWalker());
	}
}
