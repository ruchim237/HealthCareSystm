package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.capgemini.hcs.exception.InvalidChoiceException;
import com.capgemini.hcs.service.UserRegistrationServiceImpl;

public class MainController
	{	
	public static void main(String args[]) {
		UserRegistrationServiceImpl obj=new UserRegistrationServiceImpl();
	try
	{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Boolean OuterExit=false;	
	 do{
         System.out.println("Enter 1 for Admin");
         System.out.println("Enter 2 for Customer");
         System.out.println("Enter 3 for Exit");
         String ch=br.readLine();
         switch(ch)
         {
             case "1":String result=obj.adminLogin();
                      System.out.println("\n"+result+"\n");
                      break;
             case "2":InputController inputController=new InputController();
         	          inputController.inputFromUser();
            	  
            	 break;
             case "3":
                  System.out.println("Exiting From The System\n Good Bye!");
                   OuterExit=true;
                   break;
         default:
                 throw new InvalidChoiceException("Wrong choice");
           }
    }while(!OuterExit);
  }
  catch (Exception e) 
  {
    System.out.println(e);       	      
  } 
 
}

}