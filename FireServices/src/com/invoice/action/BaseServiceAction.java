package com.invoice.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Base Action class which include all the Supporting Struts class/interfaces
 * @author RAVI
 *
 */
public class BaseServiceAction extends ActionSupport implements SessionAware, RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> session = new HashMap<String, Object>();
	
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}

}
