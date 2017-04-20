package com.invoice.jpa;

import com.invoice.jpa.impl.JpaServiceImpl;

public class JpaServiceFactory {
	static String  unitName = "jpa-invoice";
	private static JpaServiceImpl jpaServiceImpl = null;
	private static JpaService jpaService = null;
	
	public static synchronized JpaService getFactory(){
		if(jpaServiceImpl == null){
			return jpaService = new JpaServiceImpl(unitName);
		}else{
			return jpaService;
		}
	}
}
