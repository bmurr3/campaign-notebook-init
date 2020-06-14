/*
 * A wrapper class to control the results of debugging within the unit test
 * suite.
 */
package com.init.debug;

/**
 * DebugResult
 * 
 * @version 1.0 13 June 2020
 * @author William Murray III
 */
public class DebugResult {
	/**
	 * The message to be returned upon the failure of a unit test.
	 */
	private String resultMessage;
	/**
	 * The overall result of the debug tests.
	 */
	private boolean hasPassed;
	
	public DebugResult() {
		this.resultMessage = "[ OK ]";
		this.hasPassed = true;
	}
	
	public void addResult(boolean arg0, String messageOnFailure)
			throws UnitFailureException {
		this.hasPassed = arg0;
		
		if (this.hasPassed == false) {
			this.resultMessage = "[FAIL]: " + messageOnFailure;
			throw new UnitFailureException();
		}
	}
	
	public String getResultMessage() {
		return this.resultMessage;
	}
	
	public boolean getResult() {
		return this.hasPassed;
	}
}