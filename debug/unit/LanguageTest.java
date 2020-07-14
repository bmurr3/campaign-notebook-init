package com.init.debug.unit;

import com.character.properties.language.Language;
import com.init.debug.DebugResult;
import com.init.debug.UnitFailureException;

/**
 * Language Unit Test
 * 
 * @author William Murray III
 * @version 1.0 13 July 2020
 */
public class LanguageTest implements LanguageTestParams {
	private static DebugResult result;
	
	private static boolean[] comparisonTests;
	private static String[] comparisonTestLabels;
	private static Language defaultConstructorTest;
	private static Language languageClassTest;
	private static Language languageSetterTest;
	private static Language languageStringStringTest;
	private static Language languageStringTest;
	private static Language[] toSortResult;
	private static Language[] toSortSet;
	
	private static void setUp() {
		defaultConstructorTest = new Language();
		languageClassTest = new Language();
		languageSetterTest = new Language();
		languageStringStringTest = new Language(
				STRING_STRING_CONSTRUCTOR_NAME,
				STRING_STRING_CONSTRUCTOR_SCRIPT);
		languageStringTest = new Language(
				STRING_CONSTRUCTOR_NAME);
		
		comparisonTests = new boolean[] {
			((new Language()).compareTo(new Language()) == 0),
			((new Language(COMPARISON_BASE_NAME, COMPARISON_BASE_SCRIPT))
					.compareTo(new Language(COMPARISON_BASE_NAME,
									COMPARISON_BASE_SCRIPT)) == 0),
			((new Language(COMPARISON_BASE_NAME, COMPARISON_BASE_SCRIPT))
					.compareTo(new Language(COMPARISON_EQUAL_NAME,
									COMPARISON_EQUAL_SCRIPT)) == 0),
			((new Language(COMPARISON_BASE_NAME, COMPARISON_BASE_SCRIPT))
					.compareTo(new Language(COMPARISON_PRECEDING_NAME,
									COMPARISON_EQUAL_SCRIPT)) > 0),
			((new Language(COMPARISON_BASE_NAME, COMPARISON_BASE_SCRIPT))
					.compareTo(new Language(COMPARISON_SUPERCEDING_NAME,
									COMPARISON_EQUAL_SCRIPT)) < 0),
			((new Language(COMPARISON_BASE_NAME, COMPARISON_BASE_SCRIPT))
					.compareTo(new Language(COMPARISON_EQUAL_NAME)) > 0),
			((new Language(COMPARISON_BASE_NAME))
					.compareTo(new Language(COMPARISON_EQUAL_NAME,
							COMPARISON_EQUAL_SCRIPT)) < 0),
			((new Language(COMPARISON_BASE_NAME))
					.compareTo(new Language(COMPARISON_EQUAL_NAME)) == 0)
		};
		comparisonTestLabels = new String[] {
			"Language().compareTo(Language()) == 0",
			"Language(Base, Base).compareTo(Language(Base, Base)) == 0",
			"Language(Base, Base).compareTo(Language(Equal, Equal)) == 0",
			"Language(Base, Base).compareTo(Language(Preceding, Equal)) > 0",
			"Language(Base, Base).compareTo(Language(Superceding, Equal)) < 0",
			"Language(Base, Base).compareTo(Language(Equal)) > 0",
			"Language(Base).compareTo(Language(Equal, Equal)) < 0",
			"Language(Base).compareTo(Language(Equal)) == 0"
		};
		
		toSortSet = new Language[] {
			TO_SORT_Z, TO_SORT_A, TO_SORT_Y, TO_SORT_B, TO_SORT_X, TO_SORT_C,
			TO_SORT_W, TO_SORT_D, TO_SORT_V, TO_SORT_E, TO_SORT_U, TO_SORT_F,
			TO_SORT_T, TO_SORT_G, TO_SORT_S, TO_SORT_H, TO_SORT_R, TO_SORT_I,
			TO_SORT_Q, TO_SORT_J, TO_SORT_P, TO_SORT_K, TO_SORT_O, TO_SORT_L,
			TO_SORT_N, TO_SORT_M
		};
		toSortResult = new Language[] {
			TO_SORT_A, TO_SORT_B, TO_SORT_C, TO_SORT_D, TO_SORT_E, TO_SORT_F,
			TO_SORT_G, TO_SORT_H, TO_SORT_I, TO_SORT_J, TO_SORT_K, TO_SORT_L,
			TO_SORT_M, TO_SORT_N, TO_SORT_O, TO_SORT_P, TO_SORT_Q, TO_SORT_R,
			TO_SORT_S, TO_SORT_T, TO_SORT_U, TO_SORT_V, TO_SORT_W, TO_SORT_X,
			TO_SORT_Y, TO_SORT_Z
		};
	}
	
	/**
	 * Start the unit test.
	 *
	 * @return the debug result
	 */
	public static DebugResult startTest() {
		result = new DebugResult();
		setUp();
		
		try {
			testClass();
			
			testGetLanguageName();
			testGetWrittenScript();
			
			testToString();
			
			testSetLanguageName();
			testSetWrittenScript();
			
			testCompareTo();
			testSort();
		} catch (UnitFailureException ufException) {
			return result;
		}
		
		tearDown();
		return result;
	}
	
	private static void tearDown() {
		comparisonTests = null;
		comparisonTestLabels = null;
		defaultConstructorTest = null;
		languageClassTest = null;
		languageSetterTest = null;
		languageStringStringTest = null;
		languageStringTest = null;
		toSortResult = null;
		toSortSet = null;
	}
	
	private static void testClass() throws UnitFailureException {
		String testLabel;
		
		testLabel = "Language.getClass() == Language.class";
		result.addResult(
				(languageClassTest.getClass() == Language.class),
				testLabel);
	}
	
	private static void testCompareTo() throws UnitFailureException {
		for (int i = 0; i < comparisonTests.length; ++i) {
			result.addResult(comparisonTests[i], comparisonTestLabels[i]);
		}
		
		String testLabel;
		
		testLabel = "Language().CompareTo(Object) > IllegalArgumentException";
		try {
			@SuppressWarnings("unused")
			int tmp = (new Language()).compareTo(new Object());
			result.addResult(false, testLabel);
		} catch (Exception e) {
			result.addResult(
					(e.getClass() == IllegalArgumentException.class),
					testLabel);
		}
	}
	
	private static void testGetLanguageName() throws UnitFailureException {
		String testLabel;
		
		testLabel = "defaultConstructorTest.getLanguageName().equals("
				+ DEFAULT_CONSTRUCTOR_NAME + ")";
		result.addResult(
				(defaultConstructorTest.getLanguageName().equals(
						DEFAULT_CONSTRUCTOR_NAME)),
				testLabel);
		
		testLabel = "languageStringTest.getLanguageName().equals("
				+ STRING_CONSTRUCTOR_NAME + ")";
		result.addResult(
				(languageStringTest.getLanguageName().equals(
						STRING_CONSTRUCTOR_NAME)),
				testLabel);
		
		testLabel = "languageStringStringTest.getLanguageName().equals("
				+ STRING_STRING_CONSTRUCTOR_NAME + ")";
		result.addResult(
				(languageStringStringTest.getLanguageName().equals(
						STRING_STRING_CONSTRUCTOR_NAME)),
				testLabel);
	}
	
	private static void testGetWrittenScript() throws UnitFailureException {
		String testLabel;
		
		testLabel = "defaultConstructorTest.getWrittenScript().equals(" +
				DEFAULT_CONSTRUCTOR_SCRIPT + ")";
		result.addResult(
				(defaultConstructorTest.getWrittenScript().equals(
						DEFAULT_CONSTRUCTOR_SCRIPT)),
				testLabel);
		
		testLabel = "languageStringTest.getWrittenScript() == null";
		result.addResult(
				(languageStringTest.getWrittenScript() == null),
				testLabel);
		
		testLabel = "languageStringStringTest.getWrittenScript().equals("
				+ STRING_STRING_CONSTRUCTOR_SCRIPT + ")";
		result.addResult(
				(languageStringStringTest.getWrittenScript()
						.equals(STRING_STRING_CONSTRUCTOR_SCRIPT)),
				testLabel);
	}
	
	private static void testSetLanguageName() throws UnitFailureException {
		String testLabel;
		
		testLabel = "languageSetterTest.setLanguageName(" + SET_LANGUAGE_NAME
				+ ")";
		languageSetterTest.setLanguageName(SET_LANGUAGE_NAME);
		result.addResult(
				(languageSetterTest.getLanguageName()
						.equals(SET_LANGUAGE_NAME)),
				testLabel);
	}
	
	private static void testSetWrittenScript() throws UnitFailureException {
		String testLabel;
		
		testLabel = "languageSetterTest.setWrittenScript(" + SET_WRITTEN_SCRIPT
				+ ")";
		languageSetterTest.setWrittenScript(SET_WRITTEN_SCRIPT);
		result.addResult(
				(languageSetterTest.getWrittenScript()
						.equals(SET_WRITTEN_SCRIPT)),
				testLabel);
	}
	
	private static void testSort() throws UnitFailureException {
		Language.sortLanguages(toSortSet);
		for (int i = 0; i < toSortSet.length; ++i) {
			result.addResult((toSortSet[i] == toSortResult[i]),
					"Language.sortLanguages()");
		}
	}
	
	private static void testToString() throws UnitFailureException {
		String testLabel;
		
		testLabel = "defaultConstructorTest.toString().equals("
				+ DEFAULT_CONSTRUCTOR_STRING + ")";
		result.addResult(
				(defaultConstructorTest.toString()
						.equals(DEFAULT_CONSTRUCTOR_STRING)),
				testLabel);
		
		testLabel = "languageStringTest.toString().equals("
				+ STRING_CONSTRUCTOR_STRING + ")";
		result.addResult(
				(languageStringTest.toString()
						.equals(STRING_CONSTRUCTOR_STRING)),
				testLabel);
		
		testLabel = "languageStringStringTest.toString().equals("
				+ STRING_STRING_CONSTRUCTOR_STRING + ")";
		result.addResult(
				(languageStringStringTest.toString()
						.equals(STRING_STRING_CONSTRUCTOR_STRING)),
				testLabel);
	}
}