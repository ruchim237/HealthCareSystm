package com.capgemini.hcs.controller.Testing;

import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capgemini.hcs.dao.DAOTestCases;

import junit.framework.TestSuite;

@RunWith(Suite.class)

@SuiteClasses({
	DAOTestCases.class,
	ControllerTestCases.class,
})
public class TestSuits {
	public static void main(String[] args) {

		Result results = JUnitCore.runClasses(TestSuite.class);
		
		System.out.println("Test Result:"+results.wasSuccessful());
		
		System.out.println("No.of Failures:"+results.getFailureCount());
		
		
		List<Failure> failures = results.getFailures();
		
		for(Failure f:failures) {
			System.out.println("Failure is:"+f);
		}	
	}
}
