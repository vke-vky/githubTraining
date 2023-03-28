package org.stepdefinition;

import org.base.Base;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	@Before(order=1)
	//precondition
	
	private void precondition1() {
		launchBrowser();
	
	}
	@Before(order=4)
	private void precondition2() {
	
		Windowmaximize();
	}
	@Before(order=2,value = "@Feature1")
	private void precondition3() {
	System.out.println("launch the browser:");
	}
	@After(order=10)
	//postcondition
	private void postcondition1() {
		closeEntireBrowser();
			
	}
	@After(order=20)
	private void postcondition2() {
		System.out.println("close the browser:");
		
		
	}
	


}
