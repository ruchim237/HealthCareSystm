package com.capgemini.hcs.service;

public interface IUserRegistrationService {
	 public boolean validationNumber(String num);
	 public boolean validationPassword(String pass);
	 public boolean validationName(String name);
	 public boolean validationEmail(String email) ;
	 public String adminLogin();
}
