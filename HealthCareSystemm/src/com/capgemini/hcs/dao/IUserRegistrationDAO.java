package com.capgemini.hcs.dao;

public interface IUserRegistrationDAO {
	 public boolean validationNumber(String num);
	 public boolean validationPassword(String pass);
	 public boolean validationName(String name);
	 public boolean validationEmail(String email) ;
	 public String adminLogin();

}
