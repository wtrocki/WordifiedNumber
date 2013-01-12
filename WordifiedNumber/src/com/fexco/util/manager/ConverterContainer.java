package com.fexco.util.manager;

import java.util.Locale;

import com.fexco.util.IWordifiedNumber;

/**
 * Container for associating converters with supported locales.
 * 
 * Using {@link Locale} interface because in some languages spelling may vary based on
 * location (e.g. Spanish, partially English). Currently supporting only
 * language comparison
 * 
 * TODO Locale may be included in IWordifiedNumber interface
 */
public class ConverterContainer {

	private Locale[] locales;
	private final IWordifiedNumber converter;

	/**
	 * @param locales
	 *            - supported locales
	 * @param converter
	 *            - related converter
	 */
	public ConverterContainer(IWordifiedNumber converter, Locale... locales) {
		assert converter != null && locales != null && locales.length > 0;
		this.locales = locales;
		this.converter = converter;
	}

	/**
	 * @param locale
	 * @return true if locale matches one of supported locales
	 */
	public boolean matches(Locale locale) {
		for (Locale itLocale : locales) {
			String language = itLocale.getLanguage();
			String language2 = locale.getLanguage();
			if (language2.equals(language)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return related number converter
	 */
	public IWordifiedNumber getConverter() {
		return converter;
	}

}
