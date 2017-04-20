package com.login.bean;


public class RegisterUserBean {

	private String firstName;
	private String middleName;
	private String lastName;
	
	private String userName;
	private String password;
	
	private String emailId;
	/*private long phoneNumber;
	private Date dateOfBirth;
	private String gender;*/
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Override
	public String toString() {
		return "RegisterUserBean [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", emailId=" + emailId
				+ "]";
	}
	
	
	
}
