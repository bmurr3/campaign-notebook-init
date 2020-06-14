package com.init.debug.unit;

import com.init.debug.DebugResult;
import com.init.debug.UnitFailureException;
import com.init.debug.UnitTest;
import com.util.logic.Logic;

/**
 * Logic Unit Test - Unit test for com.util.logic.Logic
 * 
 * @version 1.0 13 June 2020
 * @author William Murray III
 */
public class LogicTest implements UnitTest {
	private DebugResult result;

	@Override
	public DebugResult startTest() {
		try {
			this.testLogic();
			this.testAnd();
			this.testOr();
			this.testXor();
		} catch (UnitFailureException ufException) {
			//Exception not required.
		}
		
		return this.result;
	}

	@Override
	public void createTestObjects() {
		// No Test Objects Required
	}

	@Override
	public void destroyTestObjects() {
		// No Test Objects Required
	}
	
	private void testLogic() throws UnitFailureException {
		String testLabel;
		
		testLabel = "Logic.class == Logic.class";
		this.result.addResult(Logic.class == Logic.class, testLabel);
	}
	
	private void testAnd() throws UnitFailureException {
		String testLabel;
		
		testLabel = "and(false) == false";
		this.result.addResult(Logic.and(false) == false, testLabel);
		
		testLabel = "and(true) == true";
		this.result.addResult(Logic.and(true), testLabel);
		
		testLabel = "and(false, false) == false";
		this.result.addResult(Logic.and(false, false) == false, testLabel);
		
		testLabel = "and(false, true) == false";
		this.result.addResult(Logic.and(false, true) == false, testLabel);
		
		testLabel = "and(true, false) == false";
		this.result.addResult(Logic.and(true, false) == false, testLabel);
		
		testLabel = "and(true, true) == true";
		this.result.addResult(Logic.and(true, true) == true, testLabel);
		
		testLabel = "and(false, false, false) == false";
		this.result.addResult(Logic.and(false, false, false) == false,
				testLabel);
		
		testLabel = "and(false, false, true) == false";
		this.result.addResult(Logic.and(false, false, true) == false,
				testLabel);
		
		testLabel = "and(false, true, false) == false";
		this.result.addResult(Logic.and(false, true, false) == false,
				testLabel);
		
		testLabel = "and(false, true, true) == false";
		this.result.addResult(Logic.and(false, true, true) == false,
				testLabel);
		
		testLabel = "and(true, false, false) == false";
		this.result.addResult(Logic.and(true, false, false) == false,
				testLabel);
		
		testLabel = "and(true, false, true) == false";
		this.result.addResult(Logic.and(true, false, true) == false,
				testLabel);
		
		testLabel = "and(true, true, false) == false";
		this.result.addResult(Logic.and(true, true, false) == false,
				testLabel);
		
		testLabel = "and(true, true, true) == true";
		this.result.addResult(Logic.and(true, true, true) == true,
				testLabel);
	}
	
	private void testOr() throws UnitFailureException {
		String testLabel;
		
		testLabel = "or(false) == false";
		this.result.addResult(Logic.or(false) == false, testLabel);
		
		testLabel = "or(true) == true";
		this.result.addResult(Logic.or(true), testLabel);
		
		testLabel = "or(false, false) == false";
		this.result.addResult(Logic.or(false, false) == false, testLabel);
		
		testLabel = "or(false, true) == true";
		this.result.addResult(Logic.or(false, true) == true, testLabel);
		
		testLabel = "or(true, false) == true";
		this.result.addResult(Logic.or(true, false) == true, testLabel);
		
		testLabel = "or(true, true) == true";
		this.result.addResult(Logic.or(true, true) == true, testLabel);
		
		testLabel = "or(false, false, false) == false";
		this.result.addResult(Logic.or(false, false, false) == false,
				testLabel);
		
		testLabel = "or(false, false, true) == true";
		this.result.addResult(Logic.or(false, false, true) == true,
				testLabel);
		
		testLabel = "or(false, true, false) == true";
		this.result.addResult(Logic.or(false, true, false) == true,
				testLabel);
		
		testLabel = "or(false, true, true) == true";
		this.result.addResult(Logic.or(false, true, true) == true,
				testLabel);
		
		testLabel = "or(true, false, false) == true";
		this.result.addResult(Logic.or(true, false, false) == true,
				testLabel);
		
		testLabel = "or(true, false, true) == true";
		this.result.addResult(Logic.or(true, false, true) == true,
				testLabel);
		
		testLabel = "or(true, true, false) == true";
		this.result.addResult(Logic.or(true, true, false) == true,
				testLabel);
		
		testLabel = "or(true, true, true) == true";
		this.result.addResult(Logic.or(true, true, true) == true,
				testLabel);
	}
	
	private void testXor() throws UnitFailureException {
		String testLabel;
		
		testLabel = "xor(false, false) == false";
		this.result.addResult(Logic.and(false, false) == false, testLabel);
		
		testLabel = "xor(false, true) == true";
		this.result.addResult(Logic.and(false, true) == true, testLabel);
		
		testLabel = "xor(true, false) == true";
		this.result.addResult(Logic.and(true, false) == true, testLabel);
		
		testLabel = "xor(true, true) == false";
		this.result.addResult(Logic.and(true, true) == false, testLabel);
	}
}