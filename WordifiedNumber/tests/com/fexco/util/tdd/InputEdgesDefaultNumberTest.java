/**
 * 
 */
package com.fexco.util.tdd;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.fexco.util.IWordifiedNumber;
import com.fexco.util.InputException;
import com.fexco.util.lang.instances.EnglishWordifiedNumber;

/**
 * 
 */
public class InputEdgesDefaultNumberTest {

	IWordifiedNumber testObject;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Enshuring that object state was cleared
		testObject = new EnglishWordifiedNumber();
	}

	/**
	 * Test method for minimal values
	 */
	@Test
	public final void testMin() {
		try {
			testObject.toWords(Integer.MIN_VALUE);
		} catch (InputException e) {
			return;
		}
		Assert.fail("No InputException for min value");
	}

	/**
	 * Test method for maximum values
	 */
	@Test
	public final void testMax() {
		try {
			testObject.toWords(Integer.MAX_VALUE);
		} catch (InputException e) {
			return;
		}
		Assert.fail("No InputException for max value");
	}

	/**
	 * Test method for maximum values
	 */
	@Test
	public final void testValid() {
		try {
			testObject.toWords(0);
			testObject.toWords(999999999);
		} catch (InputException e) {
			Assert.fail("Argument is valid");
		}
	}

}
