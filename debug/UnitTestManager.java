package com.init.debug;

import static java.lang.System.out;

import java.lang.reflect.Method;
import java.util.concurrent.Semaphore;

// TODO: Auto-generated Javadoc
/**
 * UnitTestManager.
 *
 * @author William Murray III
 * @version 1.0 13 June 2020
 */
public class UnitTestManager {
	
	/**
	 * Start unit tests.
	 *
	 * @return true, if successful
	 */
	public static boolean startUnitTests() {
		boolean unitTestResult = true;
		
		try {
			UnitTestThread logicTest = new UnitTestThread("LogicTest", null);
			UnitTestThread languageTest = new UnitTestThread("LanguageTest",
					new UnitTestThread[] {
							logicTest
					});
			
			UnitTestThread[] testSet = new UnitTestThread[] {
					logicTest,
					languageTest
			};
			
			for (UnitTestThread test : testSet) {
				UnitTestThread.activeTasks.acquire();
				test.start();
				Thread.sleep(1);
			}
			
			for (UnitTestThread test : testSet) {
				test.join();
				unitTestResult = test.result.getResult();
				
				if (unitTestResult == false) {
					break;
				}
			}
		} catch (Exception e) {
			return false;
		}
		
		return unitTestResult;
	}
}

/**
 * The Class UnitTestThread.
 */
class UnitTestThread extends Thread {
	
	/** The Constant UNIT_TEST_PATH. */
	private static final String UNIT_TEST_PATH = "com.init.debug.unit.";
	
	/** The active tasks. */
	public static Semaphore activeTasks = new Semaphore(4);
	
	/** The dependencies. */
	private Thread[] dependencies;
	
	/** The class to call. */
	private String classToCall;
	
	/** The result. */
	public DebugResult result;
	
	/**
	 * Instantiates a new unit test thread.
	 *
	 * @param classToCall the class to call
	 * @param dependencies the dependencies
	 */
	public UnitTestThread(String classToCall, Thread[] dependencies) {
		this.classToCall = classToCall;
		this.dependencies = dependencies;
	}
	
	/**
	 * Checks if is any dependency active.
	 *
	 * @return true, if is any dependency active
	 */
	private boolean isAnyDependencyActive() {
		boolean isDependencyActive = false;
		
		if (dependencies != null) {
			for (Thread dependency : this.dependencies) {
				isDependencyActive = dependency.isAlive();
				
				if (isDependencyActive) {
					break;
				}
			}
		}
		
		return isDependencyActive;
	}
	
	/**
	 * Run.
	 */
	@Override
	public void run() {
		try {
			out.println(String.format("[%25s]$ Staging Test",
					this.classToCall));
			
			while (this.isAnyDependencyActive());
			
			long startTime = System.currentTimeMillis();
			out.println(String.format("[%25s]$ Starting Test",
					this.classToCall));
			
			Class unitTest = Class.forName(UNIT_TEST_PATH + this.classToCall);
			Object instance = unitTest.newInstance();
			Method startTest = unitTest.getMethod("startTest");
			this.result = (DebugResult) startTest.invoke(instance);
			
			long elapsedTime = System.currentTimeMillis() - startTime;
			out.println(String.format("[%25s]$ Elapsed Time: %02d.%04d sec",
					this.classToCall, elapsedTime / 1000, elapsedTime % 1000));
			out.println(String.format("[%25s]$ Result: %s", this.classToCall,
					this.result.getResultMessage()));
		} catch (Exception e) {
			this.result = new DebugResult();
			try {
				this.result.addResult(e == null, e.toString());
			} catch (UnitFailureException e1) {
				out.println(String.format("[%25s]$ %s", this.classToCall,
						this.result.getResultMessage()));
			}
		}
		
		activeTasks.release();
	}
}