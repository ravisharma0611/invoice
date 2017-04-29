package com.login.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity(name="UserDetail")
public class UserBean {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERDETAIL_SEQ")
    @SequenceGenerator(name="USERDETAIL_SEQ", sequenceName="USERDETAIL_SEQ", allocationSize=100)
	private int idKey;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String userName;
	private String password;
	
	@Transient
	private String passwordConfirm;
	
	private String emailId;
	/*private long phoneNumber;
	private Date dateOfBirth;
	private String gender;*/
	
	
	public String getFirstName() {
		return firstName;
	}
	public int getIdKey() {
		return idKey;
	}
	public void setIdKey(int idKey) {
		this.idKey = idKey;
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
	
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	@Override
	public String toString() {
		return "UserBean [idKey=" + idKey + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password
				+ ", passwordConfirm=" + passwordConfirm + ", emailId="
				+ emailId + "]";
	}
		
	
}
