package com.init.debug.unit;

import com.character.properties.language.Language;

interface LanguageTestParams {
	static final String COMPARISON_BASE_NAME = "Gnomish";
	static final String COMPARISON_BASE_SCRIPT = "Gnomish";
	static final String COMPARISON_EQUAL_NAME = COMPARISON_BASE_NAME;
	static final String COMPARISON_EQUAL_SCRIPT = COMPARISON_BASE_SCRIPT;
	static final String COMPARISON_PRECEDING_NAME = "Common";
	static final String COMPARISON_PRECEDING_SCRIPT = "Common";
	static final String COMPARISON_SUPERCEDING_NAME = "Undercommon";
	static final String COMPARISON_SUPERCEDING_SCRIPT = "Undercommon";
	
	static final String DEFAULT_CONSTRUCTOR_NAME = "Common";
	static final String DEFAULT_CONSTRUCTOR_SCRIPT = "Common";
	static final String DEFAULT_CONSTRUCTOR_STRING = "Language [languageName="
			+ DEFAULT_CONSTRUCTOR_NAME + ", writtenScript="
			+ DEFAULT_CONSTRUCTOR_SCRIPT + "]";
	
	static final String SET_LANGUAGE_NAME = "Demonic";
	static final String SET_WRITTEN_SCRIPT = "Demonic";
	
	static final String STRING_CONSTRUCTOR_NAME = "Dwarvish";
	static final String STRING_CONSTRUCTOR_STRING = "Language [languageName="
			+ STRING_CONSTRUCTOR_NAME + ", writtenScript=null]";
	
	static final String STRING_STRING_CONSTRUCTOR_NAME = "Elvish";
	static final String STRING_STRING_CONSTRUCTOR_SCRIPT = "Elvish";
	static final String STRING_STRING_CONSTRUCTOR_STRING = 
			"Language [languageName=" + STRING_STRING_CONSTRUCTOR_NAME
			+ ", writtenScript=" + STRING_STRING_CONSTRUCTOR_SCRIPT + "]";
	
	static final Language TO_SORT_A = new Language("A");
	static final Language TO_SORT_B = new Language("B");
	static final Language TO_SORT_C = new Language("C");
	static final Language TO_SORT_D = new Language("D");
	static final Language TO_SORT_E = new Language("E");
	static final Language TO_SORT_F = new Language("F");
	static final Language TO_SORT_G = new Language("G");
	static final Language TO_SORT_H = new Language("H");
	static final Language TO_SORT_I = new Language("I");
	static final Language TO_SORT_J = new Language("J");
	static final Language TO_SORT_K = new Language("K");
	static final Language TO_SORT_L = new Language("L");
	static final Language TO_SORT_M = new Language("M");
	static final Language TO_SORT_N = new Language("N");
	static final Language TO_SORT_O = new Language("O");
	static final Language TO_SORT_P = new Language("P");
	static final Language TO_SORT_Q = new Language("Q");
	static final Language TO_SORT_R = new Language("R");
	static final Language TO_SORT_S = new Language("S");
	static final Language TO_SORT_T = new Language("T");
	static final Language TO_SORT_U = new Language("U");
	static final Language TO_SORT_V = new Language("V");
	static final Language TO_SORT_W = new Language("W");
	static final Language TO_SORT_X = new Language("X");
	static final Language TO_SORT_Y = new Language("Y");
	static final Language TO_SORT_Z = new Language("Z");
}