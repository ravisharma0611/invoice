package com.login.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.invoice.action.BaseServiceAction;
import com.invoice.bean.SessionData;
import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;
import com.login.bean.UserBean;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends BaseServiceAction {
	UserBean userBean = new UserBean();
	SessionData sessionData = SessionData.getInstance();
	JpaService jpaService = JpaServiceFactory.getFactory();
	
	public String loginUser(){
		System.out.println(userBean);
		//Temp Code
		sessionData.setUserName(userBean.getUserName());
		sessionData.setFirstName("Ravi");
		sessionMap.put("SESSION_DATA", sessionData);
		return SUCCESS;
	}
	
	@SkipValidation
	 public String logOut() {
		 sessionMap.remove("SESSION_DATA");
         addActionMessage("You have been Successfully Logged Out");
         return SUCCESS;
	 }
	 
	public String registerUser(){
		System.out.println("Inside regiter");
		System.out.println(userBean);
		try {
			jpaService.createEntityManager();
			jpaService.saveEntity(userBean);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		addActionMessage("User "+userBean.getUserName() + " has been created successfully.");
		return SUCCESS;
	}
	
	private boolean validateUser() throws Exception{
		//check whether user present in DB
		//Then Yes, Else NO
		try {
			jpaService.createEntityManager();
			String nativeQquery = "select * from UserDetail ud where ud.userName=? and ud.password=?";
			Map<Integer, Object> parameters = new HashMap<Integer, Object>();
			parameters.put(1, userBean.getUserName());
			parameters.put(2, userBean.getPassword());
			List<UserBean> usingNativeQuery = jpaService.getUsingNativeQuery(nativeQquery, parameters, UserBean.class);
			if(!usingNativeQuery.isEmpty() && usingNativeQuery.get(0).getUserName().equals(userBean.getUserName()) &&
					usingNativeQuery.get(0).getPassword().equals(userBean.getPassword())){
					sessionData.setUserName(usingNativeQuery.get(0).getUserName());
					sessionData.setFirstName(usingNativeQuery.get(0).getFirstName());
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			new Exception("Exception in comparing UserName and Password from database.");
			throw e;
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		return false;
	}
	
	@Override
	public void validate() {
		super.validate();
		ActionContext context = ActionContext.getContext();
		String actionName = context.getName();
		System.out.println("Action Name : "+actionName);
		if(actionName.equals("registerAction")){
			System.out.println("context : Action called registerAction.");
			try {
				if(checkUserName()){
					addFieldError("userNameTaken", "Username is already taken!");
				}
			} catch (Exception e) {
				addActionError("Some Exception occured! "+e.getMessage());
				e.printStackTrace();
			}
			if(!userBean.getPassword().equals(userBean.getPasswordConfirm())){
				addFieldError("passwordMatch", "Password does not match!");
			}
		}
		if(actionName.equals("login")){
			System.out.println("context : Action called Login.");
		
			if(null !=userBean && (userBean.getUserName().isEmpty() || userBean.getPassword().isEmpty())){
				addFieldError("userName", "User ID is required");
				addFieldError("password", "Password is required");
			} else
				try {
					if(!validateUser()){
						addActionError("I don't know you, dont try to hack me!");
					}
				} catch (Exception e) {
					addActionError("Some Exception occured! "+e.getMessage());
					e.printStackTrace();
				}
		}
	}

	
	public boolean checkUserName() throws Exception{
		try {
			jpaService.createEntityManager();
			String nativeQquery = "select * from UserDetail ud where ud.userName=?";
			Map<Integer, Object> parameters = new HashMap<Integer, Object>();
			parameters.put(1, userBean.getUserName());
			List<UserBean> usingNativeQuery = jpaService.getUsingNativeQuery(nativeQquery, parameters, UserBean.class);
			if(!usingNativeQuery.isEmpty() ){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			new Exception("Exception in comparing UserName and Password from database.");
			throw e;
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		return false;
	}
	public UserBean getRegisterUserBean() {
		return userBean;
	}

	public void setRegisterUserBean(UserBean registerUserBean) {
		this.userBean = registerUserBean;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	
	
	
}
