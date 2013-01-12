package com.fexco.util.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.fexco.util.IWordifiedNumber;
import com.fexco.util.lang.instances.EnglishWordifiedNumber;
import com.fexco.util.lang.instances.PolishWordifiedNumber;

/**
 * Manager for number converters. Holds relations between converter and
 * language. By default supports english language.
 */
public enum NumberConversionManager {

	OBJ;

	public static NumberConversionManager getInstance() {
		return OBJ;
	}

	private IWordifiedNumber defaultConverter;
	private List<ConverterContainer> converterContainers;

	private NumberConversionManager() {
		this.converterContainers = new ArrayList<>(3);
		init();
	}

	private void init() {
		IWordifiedNumber currentConverter = new EnglishWordifiedNumber();
		Locale locale = Locale.ENGLISH;
		addLocale(currentConverter, locale);

		setDefaultConverter(currentConverter);
		currentConverter = new PolishWordifiedNumber();
		locale = new Locale("pl", "PL");
		addLocale(currentConverter, locale);

	}

	private void addLocale(IWordifiedNumber converter, Locale locale) {
		ConverterContainer converterContainer = new ConverterContainer(converter,
				new Locale[] { locale });
		converterContainers.add(converterContainer);
	}

	private void setDefaultConverter(IWordifiedNumber converter) {
		this.defaultConverter = converter;
	}

	/**
	 * @return default converter (English)
	 */
	public IWordifiedNumber getDefaultConverter() {
		return this.defaultConverter;
	}

	/**
	 * 
	 * @param currentLocale
	 *            - locale for a converter language
	 * @return
	 * @throws UnsupportedLocaleException
	 *             - if there is no implemented converter for provided locale
	 */
	public IWordifiedNumber getConverter(Locale currentLocale)
			throws UnsupportedLocaleException {
		for (ConverterContainer container : converterContainers) {
			if (container.matches(currentLocale)) {
				return container.getConverter();
			}
		}
		throw new UnsupportedLocaleException(currentLocale.toString());
	}
}
