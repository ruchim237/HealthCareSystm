package com.capgemini.hcs.bean;
import java.math.BigInteger;
public class UserBean {
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public BigInteger getContactNo() {
			return contactNo;
		}
		public void setContactNo(BigInteger contactNo) {
			this.contactNo = contactNo;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
			public String getUserId() {
				return userId;
			
		}
		public String getUserRole() {
				return userRole;
			}
		public void setUserRole(String userRole) {
				this.userRole = userRole;
			}

	    static int ustart=0;
	    private String userRole;
	    private String userPassword;
		private String userName;
		private String emailId;
		private String userId;
	    private BigInteger contactNo;
	    public UserBean(String userName,String userPassword,String emailId,BigInteger contactNo){
	        this.userPassword=userPassword;
	        this.userName=userName;
	        this.emailId=emailId;
	        this.contactNo=contactNo;
	        this.userId=Integer.toString(ustart++);
	        this.setUserRole("Customer");
	    }
	    public UserBean(String userName,String userPassword,String emailId,BigInteger contactNo,String userRole){
	        this.userPassword=userPassword;
	        this.userName=userName;
	        this.emailId=emailId;
	        this.contactNo=contactNo;
	        this.userId=Integer.toString(ustart++);
	        this.setUserRole(userRole);
	    }

}
