package com.fexco.util.lang;

import java.util.List;

import com.fexco.util.IInputValidator;
import com.fexco.util.IWordifiedNumber;
import com.fexco.util.InputException;
import com.fexco.util.lang.model.GroupElement;
import com.fexco.util.lang.vocabulary.IVocabulary;

/**
 * Default converter for English syntax based languages
 */
public class DefaultWordifiedNumber implements IWordifiedNumber {

	private IInputValidator validator;
	private IGroupWalker walker;
	private NumberParser parser;

	/**
	 * Creates converted with default walker
	 * 
	 * @param vocabulary
	 */
	public DefaultWordifiedNumber(IVocabulary vocabulary) {
		this();
		this.walker = new DefaultWalker(vocabulary);
	}

	/**
	 * Creates converter with specific walker
	 * 
	 * @param walker
	 */
	public DefaultWordifiedNumber(IGroupWalker walker) {
		this();
		this.walker = walker;
	}

	private DefaultWordifiedNumber() {
		this.parser = new NumberParser();
		this.validator = new InputValidator();
	}

	/**
	 * Translates Integer to human language format. Current implementation uses
	 * following 10 ten 100 hundred 1,000 thousand 1,000,000 one million
	 * 1,000,000,000 one billion
	 */
	@Override
	public String toWords(int number) throws InputException {
		validator.validate(number);
		List<GroupElement> groups = parser.toGroups(number);
		return walker.getString(groups);
	}

}
