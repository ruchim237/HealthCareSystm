package com.capgemini.hcs.controller.Testing;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ControllerTestCases {
	 ControllerTesting controllerTesting;
	@Before
	public  void setUp() {
	    controllerTesting = new ControllerTesting();
	}
   
   @Test
	public void testValidChoice() {
	   assertEquals(true,controllerTesting.validChoice(3));
		
	}
   @After
	public void cleanUp() {
	   controllerTesting = null;
	}

}
