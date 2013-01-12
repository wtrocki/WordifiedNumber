/**
 * 
 */
package com.fexco.util.tdd.english;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fexco.util.lang.instances.EnglishWordifiedNumber;
import com.fexco.util.lang.vocabulary.EnglishVocabulary;

/**
 * 
 */
public class EnglishVocabularyTest {

	private EnglishWordifiedNumber converter;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		converter = new EnglishWordifiedNumber();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirstNineteen() {
		EnglishVocabulary vocabullary = new EnglishVocabulary();
		for (int i = 0; i < 18; i++) {
			String possibleResult = vocabullary.getFirstNineTeenFor(i);
			String result = converter.toWords(i);
			assertEquals(possibleResult, result);
		}
	}

	@Test
	public void testTens() {
		EnglishVocabulary vocabullary = new EnglishVocabulary();
		for (int i = 2; i < 10; i++) {
			String possibleResult = vocabullary.getTens(i);
			String result = converter.toWords(i * 10);
			assertEquals(possibleResult, result);
		}
	}

	@Test
	public void testScalle() {
		EnglishVocabulary vocabullary = new EnglishVocabulary();
		int number = 0;
		for (int i = 1; i < 3; i++) {
			String possibleResult = vocabullary.getScaleNumbers(i, null);
			if (i != 1) {
				number = number * 1000;
			} else {
				number = i * 1000;
			}
			String result = converter.toWords(number);
			possibleResult = "one " + possibleResult;
			assertEquals(possibleResult, result);
		}
	}

}
