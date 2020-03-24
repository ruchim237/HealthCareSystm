package com.capgemini.hcs.exception;

public class WrongLoginException extends Exception{
	public WrongLoginException(String str)
	{
		System.out.println("Wrong Credentials...Enter Valid UserId and Password");
	}

}
