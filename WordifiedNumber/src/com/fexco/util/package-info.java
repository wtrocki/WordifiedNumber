/**
 * <p>Provides the classes for translating numbers to human readable numerals.
 * Package supports English and Polish language. 
 * Each language has own generator (because of different syntax and declination)
 * Vocabulary is based on translations standards for a given language: </p>
 * <p>For english using short scale:
 * {@link  http://en.wikipedia.org/wiki/English_numerals}</p>
 * <p>For polish using standard joining:
 * {@link http://en.wikipedia.org/wiki/Polish_numerals#Numbers_and_quantifiers}</p>
 *
 * <p><strong>Note:</strong>
 * Integer input are limited to 999999999, but it can be simply extended by altering validator. (Real limit is an integer range)
 * </p>
 * 
 * @see IWordifiedNumber
 * @see IInputValidator

 * @author wtr - wtrocki@gmail.com
 */
package com.fexco.util;