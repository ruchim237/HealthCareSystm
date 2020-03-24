package com.capgemini.hcs.dao;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DAOTestCases {
	UserRegistrationDAOImpl UserRegistrationDAOImpl;
	@Before
		public  void setUp() throws Exception  {
		   UserRegistrationDAOImpl = new UserRegistrationDAOImpl();
		}
	   
	@Test
	public void testValidName()
	{
		assertEquals(true,UserRegistrationDAOImpl.validationName("Ruchi"));   //Testing for Name Validation
	}
	@Test
   public void testValidMobNumber()
    {
		assertEquals(true,UserRegistrationDAOImpl.validationNumber("9450323180"));   //Testing for Mobile Number

    }
	@Test
	public void testValidEmailId()
	{
		assertEquals(true,UserRegistrationDAOImpl.validationEmail("ruchim237@gmail.com"));  //Testing for Email Validation
	}
	@Test
	public void testValidPassword()
	{
		assertEquals(true,UserRegistrationDAOImpl.validationPassword("ruchim234@"));    //Testing for password Validation
	}
	@Test
	public void testValidAdminLogin()
	{
		assertEquals("Login Successful",UserRegistrationDAOImpl.adminLogin());   //Testing for admin Login
	}
	
	@After
	public void tearDown() throws Exception {
		UserRegistrationDAOImpl=null;
	}
}
