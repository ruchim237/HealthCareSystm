package com.capgemini.hcs.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import com.capgemini.hcs.exception.WrongLoginException;

public class UserRegistrationDAOImpl implements IUserRegistrationDAO {
	@Override
	public boolean validationNumber(String num) {
		 Boolean numvalid=true;
         if (num.charAt(0)=='0' || !(num.length()==10)){
             numvalid=false;
         }
            
         else
             {for(int i=1;i<num.length();i++){
             if(!(num.charAt(i)>=48 && num.charAt(i)<=57)){
                 numvalid=false;   
             }
         }
     }
     return numvalid;
	}

	@Override
	public boolean validationPassword(String pass) {
		 Boolean valid=true;
	        int digit=0,special_charcters=0,alphabet=0;
	        if(pass.length()<8 || pass.length()>=14){
	            valid=false;
	        }else {
	            for(int i=0;i<pass.length();i++){
	                char c=pass.charAt(i);
	                if(c>=48 && c<=57 ){
	                    digit++;
	                }
	                if((c>=65 && c<=90) || (c>=97 && c<=122)){
	                    alphabet++;
	                }
	                else if((c>=32 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=126))
	                {
	                    special_charcters++;
	                }
	            }
	            if(digit==0 || special_charcters==0 || alphabet==0){
	                valid=false;
	            }
	        }
	        return valid;
	}

	@Override
	public boolean validationName(String name) {

		 boolean validname=true;
       if(!(name.charAt(0)>=65 && name.charAt(0)<=90)){
          validname=false;
        }else 
        {
       	 for(int i=1;i<name.length();i++)
       	 {
       		 if(!(name.charAt(i)>=97 && name.charAt(i)<=122))
       		 {
       			 validname=false;    			 
       		 }
       	 }
       }
       	 return   validname;  	       
	}

	@Override
	public boolean validationEmail(String email) {
      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 

	}

	@Override
	public String adminLogin() {
			 String loginAdmin="";
		 try{			 
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Enter The Admin Id");
	         String id=br.readLine();
	         System.out.println("Enter The Admin Password");
	         String pass=br.readLine();
	         if((id.equals("admin")) && pass.equals("password"))
	         {
	             loginAdmin= "Login Successful";
	         }     
	          else
	         {
	        	  throw new WrongLoginException("Credential Wrong : Please Try Again");   //Thowing Exception for WrongLogin
	         }
	        }catch(Exception e) {
		            System.out.println(e);
		        } 
		return loginAdmin;
		 }
		 

}
