package com.invoice.action.intercepter;

import java.util.Map;

import com.invoice.bean.SessionData;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation paramActionInvocation)
			throws Exception {

		Map<String, Object> session = paramActionInvocation.getInvocationContext().getSession();
		SessionData sessionData = (SessionData) session.get("SESSION_DATA");

         if (null == sessionData || sessionData.getUserName() == null) 
         {
                 return Action.LOGIN;
         } 
         else 
         {
                 return paramActionInvocation.invoke();
         }
	}

}
