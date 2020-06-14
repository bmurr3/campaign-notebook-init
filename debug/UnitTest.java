package com.init.debug;

/**
 * UnitTest Interface
 * 
 * @version 1.0 13 June 2020
 * @author William Murray III
 */
public interface UnitTest {
	public DebugResult startTest();
	void createTestObjects();
	void destroyTestObjects();
}