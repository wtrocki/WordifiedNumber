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

/**
 * 
 */
public class EnglishConverterTest {

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

	static int[] inputVector = { 1, 10, 11, 19, 20, 21, 32, 44, 67, 99, 100, 104, 114,
			119, 120, 195, 199, 200, 450, 761, 999, 1000, 1001, 2004, 3012, 4100, 5104,
			5123, 9999, 10000, 10002, 61431, 99999, 100000, 100021, 1000000, 1000001,
			1000013, 1000024, 1000100, 3000431, 80531431, 981531431, 616157171 };
	static String[] outputVector = {
			"one",
			"ten",
			"eleven",
			"nineteen",
			"twenty",
			"twenty one",
			"thirty two",
			"forty four",
			"sixty seven",
			"ninety nine",
			"one Hundred",
			"one Hundred and four",
			"one Hundred and fourteen",
			"one Hundred and nineteen",
			"one Hundred and twenty",
			"one Hundred and ninety five",
			"one Hundred and ninety nine",
			"two Hundred",
			"four Hundred and fifty",
			"seven Hundred and sixty one",
			"nine Hundred and ninety nine",
			"one thousand",
			"one thousand and one",
			"two thousand and four",
			"three thousand and twelve",
			"four thousand, one Hundred",
			"five thousand, one Hundred and four",
			"five thousand, one Hundred and twenty three",
			"nine thousand, nine Hundred and ninety nine",
			"ten thousand",
			"ten thousand and two",
			"sixty one thousand, four Hundred and thirty one",
			"ninety nine thousand, nine Hundred and ninety nine",
			"one Hundred thousand",
			"one Hundred thousand and twenty one",
			"one million",
			"one million and one",
			"one million and thirteen",
			"one million and twenty four",
			"one million, one Hundred",
			"three million, four Hundred and thirty one",
			"eighty million, five Hundred and thirty one thousand, four Hundred and thirty one",
			"nine Hundred and eighty one million, five Hundred and thirty one thousand, four Hundred and thirty one",
			"six Hundred and sixteen million, one Hundred and fifty seven thousand, one Hundred and seventy one", };

	@Test
	public void testVectors() {
		for (int i = 0; i < inputVector.length; i++) {
			String expected = outputVector[i];
			String result = converter.toWords(inputVector[i]);
			assertEquals(expected, result);
		}
	}

}
