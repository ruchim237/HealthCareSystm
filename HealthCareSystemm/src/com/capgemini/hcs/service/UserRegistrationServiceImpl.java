package com.capgemini.hcs.service;

import java.util.HashMap;
import com.capgemini.hcs.bean.UserBean;
import com.capgemini.hcs.dao.UserRegistrationDAOImpl;

public class UserRegistrationServiceImpl implements IUserRegistrationService {
	UserRegistrationDAOImpl userRegistrationDAOImpl=new UserRegistrationDAOImpl();
	 private static HashMap<Integer,UserBean> users=new HashMap<>();
		
		
		public static HashMap<Integer, UserBean> getUsers()
		{
		return users;
	    }
	    public static void setUsers(HashMap<Integer, UserBean> users)
	    {
	    	UserRegistrationServiceImpl.users = users;
	    }
	@Override
	public boolean validationNumber(String num) {
     boolean numResult=userRegistrationDAOImpl.validationNumber( num);
		return numResult;
	}

	@Override
	public boolean validationPassword(String pass) {
	 boolean passResult=userRegistrationDAOImpl.validationPassword(pass);			
	  return passResult;
	}

	@Override
	public boolean validationName(String name) {
	 boolean nameResult=userRegistrationDAOImpl.validationName(name);			
	  return nameResult;
	}

	@Override
	public boolean validationEmail(String email) {
	 boolean emailResult=userRegistrationDAOImpl.validationEmail(email);			
	  return emailResult;
	}

	@Override
	public String adminLogin() {
		 String loginResult=userRegistrationDAOImpl.adminLogin();			
		  return loginResult;
	}

}
