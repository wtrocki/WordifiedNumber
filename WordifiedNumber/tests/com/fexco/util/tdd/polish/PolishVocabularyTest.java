/**
 * 
 */
package com.fexco.util.tdd.polish;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fexco.util.lang.instances.PolishWordifiedNumber;
import com.fexco.util.lang.vocabulary.PolishVocabulary;

/**
 * 
 */
public class PolishVocabularyTest {

	private PolishWordifiedNumber converter;

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
		converter = new PolishWordifiedNumber();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirstNineteen() {
		PolishVocabulary vocabullary = new PolishVocabulary();
		for (int i = 0; i < 18; i++) {
			String possibleResult = vocabullary.getFirstNineTeenFor(i);
			String result = converter.toWords(i);
			assertEquals(possibleResult, result);
		}
	}

	@Test
	public void testTens() {
		PolishVocabulary vocabullary = new PolishVocabulary();
		for (int i = 2; i < 10; i++) {
			String possibleResult = vocabullary.getTens(i);
			String result = converter.toWords(i * 10);
			assertEquals(possibleResult, result);
		}
	}

	@Test
	public void testScalle() {
		PolishVocabulary vocabullary = new PolishVocabulary();
		int number = 0;
		for (int i = 1; i < 3; i++) {
			String possibleResult = vocabullary.getScaleNumbers(i, null);
			if (i != 1) {
				number = number * 1000;
			} else {
				number = i * 1000;
			}
			String result = converter.toWords(number);
			possibleResult = "jeden " + possibleResult;
			assertEquals(possibleResult, result);
		}
	}

	@Test
	public final void teststo() {
		String possibleResult = "sto";
		String result = converter.toWords(100);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testdwie�cie() {
		String possibleResult = "dwie�cie";
		String result = converter.toWords(200);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testtrzysta() {
		String possibleResult = "trzysta";
		String result = converter.toWords(300);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testczterysta() {
		String possibleResult = "czterysta";
		String result = converter.toWords(400);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testpi��set() {
		String possibleResult = "pi��set";
		String result = converter.toWords(500);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testsze��set() {
		String possibleResult = "sze��set";
		String result = converter.toWords(600);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testsiedemset() {
		String possibleResult = "siedemset";
		String result = converter.toWords(700);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testosiemset() {
		String possibleResult = "osiemset";
		String result = converter.toWords(800);
		assertEquals(possibleResult, result);
	}

	@Test
	public final void testdziewi��set() {
		String possibleResult = "dziewi��set";
		String result = converter.toWords(900);
		assertEquals(possibleResult, result);
	}

}
