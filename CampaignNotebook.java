package com.init;

import static java.lang.System.exit;

import com.init.debug.UnitTestManager;

/**
 * CampaignNotebook
 * 
 * @version 1.0 13 June 2020
 * @author William Murray III
 */
public class CampaignNotebook {

	public static void main(String[] args) {
		if (UnitTestManager.startUnitTests() == false) {
			exit(-1);
		}
	}
}