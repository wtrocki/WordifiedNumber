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
			"dziesiêæ",
			"jedynaœcie",
			"dziewietnaœcie",
			"dwadzieœcia",
			"dwadzieœcia jeden",
			"trzydzieœci dwa",
			"czterdzieœci cztery",
			"szeœædziesi¹t siedem",
			"dziewiêædziesi¹t dziewiêæ",
			"sto",
			"sto cztery",
			"sto czternaœcie",
			"sto dziewietnaœcie",
			"sto dwadzieœcia",
			"sto dziewiêædziesi¹t piêæ",
			"sto dziewiêædziesi¹t dziewiêæ",
			"dwieœcie",
			"czterysta piêædziesi¹t",
			"siedemset szeœædziesi¹t jeden",
			"dziewiêæset dziewiêædziesi¹t dziewiêæ",
			"jeden tysi¹æ",
			"jeden tysi¹æ jeden",
			"dwa tysi¹ce cztery",
			"trzy tysi¹ce dwanaœcie",
			"cztery tysi¹ce, sto",
			"piêæ tysiêcy, sto cztery",
			"piêæ tysiêcy, sto dwadzieœcia trzy",
			"dziewiêæ tysiêcy, dziewiêæset dziewiêædziesi¹t dziewiêæ",
			"dziesiêæ tysiêcy",
			"dziesiêæ tysiêcy dwa",
			"szeœædziesi¹t jeden tysi¹æ, czterysta trzydzieœci jeden",
			"dziewiêædziesi¹t dziewiêæ tysiêcy, dziewiêæset dziewiêædziesi¹t dziewiêæ",
			"sto tysiêcy",
			"sto tysiêcy dwadzieœcia jeden",
			"jeden milion",
			"jeden milion jeden",
			"jeden milion trzynaœcie",
			"jeden milion dwadzieœcia cztery",
			"jeden milion, sto",
			"trzy miliony, czterysta trzydzieœci jeden",
			"osiemdziesi¹t milionów, piêæset trzydzieœci jeden tysi¹æ, czterysta trzydzieœci jeden",
			"dziewiêæset osiemdziesi¹t jeden milion, piêæset trzydzieœci jeden tysi¹æ, czterysta trzydzieœci jeden",
			"szeœæset szestnaœcie milionów, sto piêædziesi¹t siedem tysiêcy, sto siedemdziesi¹t jeden", };

	@Test
	public void testVectors() {
		for (int i = 0; i < inputVector.length; i++) {
			String expected = outputVector[i];
			String result = converter.toWords(inputVector[i]);
			assertEquals(expected, result);
		}
	}

}
