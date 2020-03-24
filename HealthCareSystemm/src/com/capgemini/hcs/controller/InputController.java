package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Map;
import com.capgemini.hcs.bean.UserBean;
import com.capgemini.hcs.service.UserRegistrationServiceImpl;

public class InputController {
	 static int i=0;
	 public void inputFromUser()
	  {
		UserRegistrationServiceImpl obj=new UserRegistrationServiceImpl();
		try
		{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
                     Boolean custExit=false;
                     do{
                         System.out.println("Enter 1 for New User");
                         System.out.println("Enter 2 for Existing User");
                         System.out.println("Enter 3 for Exiting The Menu ");
                         String ch2=br.readLine();                
                         switch(ch2)
                                {
                             case "1":
                            	
                   		  try{	            
         		    	     br=new BufferedReader(new InputStreamReader(System.in));
         		            System.out.println("Enter The Name");
         		            System.out.println("Tip: Name should not start with special characters and should not be blank. First letter should be capital");
         		            String name=br.readLine();
         		            if(!(obj.validationName(name)))
         		            {
         		                do{
         		                	System.out.println("Name Rule is voilated :");
         		                    System.out.println("Enter The Name Again");
         		                    name=br.readLine();
         		                }while(!(obj.validationName(name)));
         		                }
         		            
         		             System.out.println("Enter The Mobile No");
         		            System.out.println("Tip: Number Length Should be 10 digits and starting digit shouldn't be zero");
         		            String num=br.readLine();
         		            if(!(obj.validationNumber(num))){
         		            do{
         	                     System.out.println("The Mobile number Rule Is Violated");
         	                    System.out.println("Enter The Mobile No Again");
         		                num=br.readLine();
         		            }while(!(obj.validationNumber(num)));
         		            }  
         		            BigInteger mobNo=new BigInteger(num);
         		            System.out.println("Enter The Password");
         		            System.out.println("Tip: Password must contain one number,one alphabet,one special character and size should be at least 8 characters and not more than 14 characters");
         		            String pass=br.readLine();
         		            if(!(obj.validationPassword(pass))){
         		                do{
         		                    System.out.println("The Password Rule Is Violated");
         		                    System.out.println("Enter The Password Again");
         		                    pass=br.readLine();
         		                }while(!(obj.validationPassword(pass)));
         		           }
         		            
         		            System.out.println("Enter The Email ID");
         		            String emailId=br.readLine();
         		            if(!(obj.validationEmail(emailId))){
         			            do{
         			                System.out.println("The EmailID  Rule Is Violated");
         			                System.out.println("Enter The EmailID  Again");
         			                emailId=br.readLine();
         			            }while(!(obj.validationEmail(emailId)));
         			            }
         		            UserBean u1 = new UserBean(name,pass, emailId, mobNo);
         		           obj.getUsers().put(i++,u1);
         		           System.out.println("Thank You For Registering");
         		           System.out.println("Your user id is :"+(i-1));
         		        } catch (Exception e) {
         		            System.out.println(e);
         		        }
                   		    break;
                             case "2":
                                     System.out.println("Enter The User Id");
                                     String uId=br.readLine();
                                     System.out.println("Enter The User Password");
                                     String uPass=br.readLine();
                                     int found=0;
                                      for (Map.Entry<Integer,UserBean> u : obj.getUsers().entrySet())   
                                     {
                                    	  
                                         if(u.getValue().getUserId().equals(uId) && u.getValue().getUserPassword().equals(uPass))
                                         {
                                        	 System.out.println("User Exist : Successful Login");
                                             found=1;
                                             break;
                                         }
                                       }
                                        if (found==0)
                                       {
                                         System.out.println("Credential Wrong : please try Again");
                                         break;
                                        }
                                     break;
                               case "3":System.out.println("Exiting from User Menu");
                                     custExit=true;
                                     break;
                                     default: System.out.println("Wrong Choice");
                                  }
                                }while(!custExit);		
	           }catch (Exception e) 
                   {
         	        System.out.println(e);       	      
		           } 
		}
	

}
