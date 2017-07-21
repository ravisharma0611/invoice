package com.invoice.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class BaseServiceAction extends ActionSupport implements SessionAware, RequestAware, ServletRequestAware, ServletResponseAware, ServletContextAware {
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

	@Override
	public void setServletContext(ServletContext ctx)  {
		// TODO Auto-generated method stub
		JpaService jpaService = JpaServiceFactory.getFactory();
		///ctx.setAttribute("dataSource", getConnection());
		
	}
	
	
	/*public DataSource getConnection(){
		DataSource dataSource = null;
		try {
			String jndiPathForJasper = getText("jndiPathForJasper");
			InitialContext initialContext = new InitialContext();
			dataSource = (DataSource) initialContext.lookup(jndiPathForJasper);
			System.out.println("DB connection Success...");
		}  catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSource;
	}*/
	
}