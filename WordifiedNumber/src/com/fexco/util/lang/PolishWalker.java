package com.fexco.util.lang;

import com.fexco.util.lang.model.GroupElement;
import com.fexco.util.lang.vocabulary.IVocabulary;

/**
 * Walker for polish language. Used to calculate different variants for polish
 * language.
 */
public class PolishWalker extends DefaultWalker {

	public PolishWalker(IVocabulary vocabulary) {
		super(vocabulary);
	}

	@Override
	protected Integer getHundredVariant(int hundredsValue) {
		return hundredsValue;
	}

	@Override
	protected String getScalleNumbers(GroupElement groupElement, int i) {
		int variant = getVariant(groupElement);
		return vocabulary.getScaleNumbers(i, variant);
	}

	private int getVariant(GroupElement groupElement) {
		if (groupElement.firstNineteenElement != null) {
			int value = groupElement.firstNineteenElement.getValue();
			// TODO variants are a little bit unreadable replace with enums
			if (value < 10) {
				if (value == 1) {
					return 0;
				}
				if (value < 5) {
					return 1;
				} else {
					return 2;
				}
			}
		}
		return 2;
	}

	@Override
	protected boolean shouldAppendElementToHundred(int hundredsValue) {
		return false;
	}
}
