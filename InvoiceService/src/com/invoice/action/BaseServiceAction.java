package com.invoice.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseServiceAction extends ActionSupport implements SessionAware, RequestAware, ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L;
	public Map<String, Object> sessionMap ;
	HttpServletRequest request ;
	HttpServletResponse response;
	
	public void setRequest(Map<String, Object> arg0) {
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	public Map<String, Object> getSession() {
        return sessionMap;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request  = request;
		
	}
}