/**
 * 
 */
package com.fexco.util.tdd.polish;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fexco.util.lang.instances.PolishWordifiedNumber;

/**
 * 
 */
public class PolishConverterTest {

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

	static int[] inputVector = { 1, 10, 11, 19, 20, 21, 32, 44, 67, 99, 100, 104, 114,
			119, 120, 195, 199, 200, 450, 761, 999, 1000, 1001, 2004, 3012, 4100, 5104,
			5123, 9999, 10000, 10002, 61431, 99999, 100000, 100021, 1000000, 1000001,
			1000013, 1000024, 1000100, 3000431, 80531431, 981531431, 616157171 };
	static String[] outputVector = {
			"jeden",
			"dziesi��",
			"jedyna�cie",
			"dziewietna�cie",
			"dwadzie�cia",
			"dwadzie�cia jeden",
			"trzydzie�ci dwa",
			"czterdzie�ci cztery",
			"sze��dziesi�t siedem",
			"dziewi��dziesi�t dziewi��",
			"sto",
			"sto cztery",
			"sto czterna�cie",
			"sto dziewietna�cie",
			"sto dwadzie�cia",
			"sto dziewi��dziesi�t pi��",
			"sto dziewi��dziesi�t dziewi��",
			"dwie�cie",
			"czterysta pi��dziesi�t",
			"siedemset sze��dziesi�t jeden",
			"dziewi��set dziewi��dziesi�t dziewi��",
			"jeden tysi��",
			"jeden tysi�� jeden",
			"dwa tysi�ce cztery",
			"trzy tysi�ce dwana�cie",
			"cztery tysi�ce, sto",
			"pi�� tysi�cy, sto cztery",
			"pi�� tysi�cy, sto dwadzie�cia trzy",
			"dziewi�� tysi�cy, dziewi��set dziewi��dziesi�t dziewi��",
			"dziesi�� tysi�cy",
			"dziesi�� tysi�cy dwa",
			"sze��dziesi�t jeden tysi��, czterysta trzydzie�ci jeden",
			"dziewi��dziesi�t dziewi�� tysi�cy, dziewi��set dziewi��dziesi�t dziewi��",
			"sto tysi�cy",
			"sto tysi�cy dwadzie�cia jeden",
			"jeden milion",
			"jeden milion jeden",
			"jeden milion trzyna�cie",
			"jeden milion dwadzie�cia cztery",
			"jeden milion, sto",
			"trzy miliony, czterysta trzydzie�ci jeden",
			"osiemdziesi�t milion�w, pi��set trzydzie�ci jeden tysi��, czterysta trzydzie�ci jeden",
			"dziewi��set osiemdziesi�t jeden milion, pi��set trzydzie�ci jeden tysi��, czterysta trzydzie�ci jeden",
			"sze��set szestna�cie milion�w, sto pi��dziesi�t siedem tysi�cy, sto siedemdziesi�t jeden", };

	@Test
	public void testVectors() {
		for (int i = 0; i < inputVector.length; i++) {
			String expected = outputVector[i];
			String result = converter.toWords(inputVector[i]);
			assertEquals(expected, result);
		}
	}

}
