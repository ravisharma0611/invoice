package com.login.action;

import com.invoice.action.BaseServiceAction;
import com.login.bean.LoginUserBean;
import com.login.bean.RegisterUserBean;

public class LoginAction extends BaseServiceAction {
	LoginUserBean loginUserBean = new LoginUserBean(); 
	RegisterUserBean registerUserBean = new RegisterUserBean();
	
	public String loginUser(){
		System.out.println(loginUserBean);
		return SUCCESS;
	}
	
	public String registerUser(){
		System.out.println("Inside regiter");
		System.out.println(registerUserBean);
		return SUCCESS;
	}
	
	private boolean validateUser(){
		
		return false;
	}
	
	@Override
	public void validate() {
		super.validate();
	}

	public LoginUserBean getLoginUserBean() {
		return loginUserBean;
	}

	public void setLoginUserBean(LoginUserBean loginUserBean) {
		this.loginUserBean = loginUserBean;
	}

	public RegisterUserBean getRegisterUserBean() {
		return registerUserBean;
	}

	public void setRegisterUserBean(RegisterUserBean registerUserBean) {
		this.registerUserBean = registerUserBean;
	}
	
	
	
	
}
