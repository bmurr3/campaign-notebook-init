package com.init.debug.unit;

import com.init.debug.DebugResult;
import com.init.debug.UnitFailureException;
import com.util.logic.Logic;

/**
 * Logic Unit Test - Unit test for com.util.logic.Logic
 * 
 * @version 1.0 13 June 2020
 * @author William Murray III
 */
public class LogicTest {
	private static DebugResult result;

	public static DebugResult startTest() {
		LogicTest.result = new DebugResult();
		
		try {
			LogicTest.testAnd();
			LogicTest.testOr();
			LogicTest.testXor();
		} catch (UnitFailureException ufException) {
			return LogicTest.result;
		}
		
		return LogicTest.result;
	}
	
	private static void testAnd() throws UnitFailureException {
		String testLabel;
		
		testLabel = "and(false) == false";
		LogicTest.result.addResult((Logic.and(false) == false), testLabel);
		
		testLabel = "and(true) == true";
		LogicTest.result.addResult(Logic.and(true), testLabel);
		
		testLabel = "and(false, false) == false";
		LogicTest.result.addResult(Logic.and(false, false) == false, testLabel);
		
		testLabel = "and(false, true) == false";
		LogicTest.result.addResult(Logic.and(false, true) == false, testLabel);
		
		testLabel = "and(true, false) == false";
		LogicTest.result.addResult(Logic.and(true, false) == false, testLabel);
		
		testLabel = "and(true, true) == true";
		LogicTest.result.addResult(Logic.and(true, true) == true, testLabel);
		
		testLabel = "and(false, false, false) == false";
		LogicTest.result.addResult(Logic.and(false, false, false) == false,
				testLabel);
		
		testLabel = "and(false, false, true) == false";
		LogicTest.result.addResult(Logic.and(false, false, true) == false,
				testLabel);
		
		testLabel = "and(false, true, false) == false";
		LogicTest.result.addResult(Logic.and(false, true, false) == false,
				testLabel);
		
		testLabel = "and(false, true, true) == false";
		LogicTest.result.addResult(Logic.and(false, true, true) == false,
				testLabel);
		
		testLabel = "and(true, false, false) == false";
		LogicTest.result.addResult(Logic.and(true, false, false) == false,
				testLabel);
		
		testLabel = "and(true, false, true) == false";
		LogicTest.result.addResult(Logic.and(true, false, true) == false,
				testLabel);
		
		testLabel = "and(true, true, false) == false";
		LogicTest.result.addResult(Logic.and(true, true, false) == false,
				testLabel);
		
		testLabel = "and(true, true, true) == true";
		LogicTest.result.addResult(Logic.and(true, true, true) == true,
				testLabel);
	}
	
	private static void testOr() throws UnitFailureException {
		String testLabel;
		
		testLabel = "or(false) == false";
		LogicTest.result.addResult(Logic.or(false) == false, testLabel);
		
		testLabel = "or(true) == true";
		LogicTest.result.addResult(Logic.or(true), testLabel);
		
		testLabel = "or(false, false) == false";
		LogicTest.result.addResult(Logic.or(false, false) == false, testLabel);
		
		testLabel = "or(false, true) == true";
		LogicTest.result.addResult(Logic.or(false, true) == true, testLabel);
		
		testLabel = "or(true, false) == true";
		LogicTest.result.addResult(Logic.or(true, false) == true, testLabel);
		
		testLabel = "or(true, true) == true";
		LogicTest.result.addResult(Logic.or(true, true) == true, testLabel);
		
		testLabel = "or(false, false, false) == false";
		LogicTest.result.addResult(Logic.or(false, false, false) == false,
				testLabel);
		
		testLabel = "or(false, false, true) == true";
		LogicTest.result.addResult(Logic.or(false, false, true) == true,
				testLabel);
		
		testLabel = "or(false, true, false) == true";
		LogicTest.result.addResult(Logic.or(false, true, false) == true,
				testLabel);
		
		testLabel = "or(false, true, true) == true";
		LogicTest.result.addResult(Logic.or(false, true, true) == true,
				testLabel);
		
		testLabel = "or(true, false, false) == true";
		LogicTest.result.addResult(Logic.or(true, false, false) == true,
				testLabel);
		
		testLabel = "or(true, false, true) == true";
		LogicTest.result.addResult(Logic.or(true, false, true) == true,
				testLabel);
		
		testLabel = "or(true, true, false) == true";
		LogicTest.result.addResult(Logic.or(true, true, false) == true,
				testLabel);
		
		testLabel = "or(true, true, true) == true";
		LogicTest.result.addResult(Logic.or(true, true, true) == true,
				testLabel);
	}
	
	private static void testXor() throws UnitFailureException {
		String testLabel;
		
		testLabel = "xor(false, false) == false";
		LogicTest.result.addResult(Logic.xor(false, false) == false, testLabel);
		
		testLabel = "xor(false, true) == true";
		LogicTest.result.addResult(Logic.xor(false, true) == true, testLabel);
		
		testLabel = "xor(true, false) == true";
		LogicTest.result.addResult(Logic.xor(true, false) == true, testLabel);
		
		testLabel = "xor(true, true) == false";
		LogicTest.result.addResult(Logic.xor(true, true) == false, testLabel);
	}
}