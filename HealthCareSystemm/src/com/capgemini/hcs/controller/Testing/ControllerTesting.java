package com.capgemini.hcs.controller.Testing;

public class ControllerTesting {
	public boolean validChoice(int n)
	{
	boolean	validChoice=false;
	if(n==1 || n==2 || n==3)
	{
		validChoice=true;
	}else
	{
		validChoice=false;
		
	}
	return validChoice;
   }
	
	
}
