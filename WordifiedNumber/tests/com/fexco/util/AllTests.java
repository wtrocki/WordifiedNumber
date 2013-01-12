package com.fexco.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fexco.util.performance.PerformanceTest;
import com.fexco.util.tdd.InputEdgesDefaultNumberTest;
import com.fexco.util.tdd.english.EnglishConverterTest;
import com.fexco.util.tdd.english.EnglishVocabularyTest;
import com.fexco.util.tdd.polish.PolishConverterTest;
import com.fexco.util.tdd.polish.PolishVocabularyTest;

@RunWith(Suite.class)
@SuiteClasses({ InputEdgesDefaultNumberTest.class, EnglishVocabularyTest.class,
		EnglishConverterTest.class, PolishVocabularyTest.class,
		PolishConverterTest.class, PerformanceTest.class, })
public class AllTests {

}
