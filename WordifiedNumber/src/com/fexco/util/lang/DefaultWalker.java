package com.fexco.util.lang;

import java.util.List;

import com.fexco.util.lang.model.GroupElement;
import com.fexco.util.lang.vocabulary.IVocabulary;

/**
 * Default walker for English syntax based languages without scale variants
 */
public class DefaultWalker implements IGroupWalker {

	protected IVocabulary vocabulary;

	/**
	 * @param vocabulary
	 *            - walkers vocabullary
	 */
	public DefaultWalker(IVocabulary vocabulary) {
		this.vocabulary = vocabulary;
	}

	@Override
	public String getString(List<GroupElement> groups) {
		for (GroupElement groupElement : groups) {
			groupToWords(groupElement);
		}
		return combine(groups);
	}

	/**
	 * @param groups
	 * @return
	 */
	protected String combine(List<GroupElement> groups) {
		GroupElement firstGroup = groups.get(0);
		String combined = firstGroup.groupText;
		boolean shouldAppendAnd = shouldAppendAnd(firstGroup);
		// Visit all groups from smallest to largest
		for (int i = 1; i < groups.size(); i++) {
			GroupElement groupElement = groups.get(i);
			if (groupElement.value != 0) {
				// Build the string to add as a prefix
				StringBuffer prefix = new StringBuffer();
				prefix.append(groupElement.groupText);
				prefix.append(IVocabulary.WHITESPACE);
				prefix.append(getScalleNumbers(groupElement, i));
				if (combined.length() != 0) {
					prefix.append(shouldAppendAnd ? vocabulary.getAnd()
							: IVocabulary.SEPRATOR);
				}
				shouldAppendAnd = false;
				// Add the three-digit group to the combined string
				combined = prefix + combined;
			}
		}
		return combined;
	}

	protected String getScalleNumbers(GroupElement groupElement, int i) {
		return vocabulary.getScaleNumbers(i, null);
	}

	protected boolean shouldAppendAnd(GroupElement firstGroup) {
		return (firstGroup.value > 0) && (firstGroup.value < 100);
	}

	private void groupToWords(GroupElement groupElement) {
		// Initialise the return text
		StringBuffer groupText = new StringBuffer();

		// Hundreds rules
		if (groupElement.hundredElement != null) {
			int hundredsValue = groupElement.hundredElement.getValue();
			if (shouldAppendElementToHundred(hundredsValue)) {
				groupText.append(vocabulary.getFirstNineTeenFor(hundredsValue));
				groupText.append(IVocabulary.WHITESPACE);
			}
			groupText.append(vocabulary.getHundred(getHundredVariant(hundredsValue)));
			if (groupElement.tens != null || groupElement.firstNineteenElement != null) {
				groupText.append(vocabulary.getAnd());
			}
		}
		if (groupElement.tens != null) {
			int tensValue = groupElement.tens.getValue();
			groupText.append(vocabulary.getTens(tensValue));
			if (groupElement.firstNineteenElement != null) {
				groupText.append(IVocabulary.WHITESPACE);
			}
		}

		if (groupElement.firstNineteenElement != null) {
			int firstNineteenValue = groupElement.firstNineteenElement.getValue();
			String firstNineTeenFor = vocabulary.getFirstNineTeenFor(firstNineteenValue);
			groupText.append(firstNineTeenFor);
		}

		groupElement.groupText = groupText.toString();
	}

	protected boolean shouldAppendElementToHundred(int hundredsValue) {
		return true;
	}

	protected Integer getHundredVariant(int hundredsValue) {
		return null;
	}
}
