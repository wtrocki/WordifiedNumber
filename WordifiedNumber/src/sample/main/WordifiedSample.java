package sample.main;

import java.util.Locale;

import com.fexco.util.IWordifiedNumber;
import com.fexco.util.manager.NumberConversionManager;
import com.fexco.util.manager.UnsupportedLocaleException;

/**
 * Sample usage of provided library
 */
public class WordifiedSample {

	IWordifiedNumber number;

	int numbers[] = { 0, 1, 21, 105, 1000001, 56945781 };

	private IWordifiedNumber converter;

	public WordifiedSample() {
		// Locale locale = Locale.getDefault();
		Locale locale = Locale.ENGLISH;
		NumberConversionManager instance = NumberConversionManager.getInstance();
		try {
			converter = instance.getConverter(locale);
			testConverter();
		} catch (UnsupportedLocaleException e) {
			System.out.println(locale.getDisplayLanguage() + " not implemented");
			e.printStackTrace();
		}
	}

	private void testConverter() {
		for (int number : numbers) {
			System.out.println(converter.toWords(number));
		}
	}

	public static void main(String[] args) {
		new WordifiedSample();
	}
}
