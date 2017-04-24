package com.invoice.bean;

public class SessionData {
	private static SessionData sessionData = null;
	private SessionData(){
		super();
	}
	
	public static SessionData getInstance(){
		if(sessionData == null){
			return new SessionData();
		}
		return sessionData;
	}
	
	private Long invoiceNo;
	
	public Long getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	} 
}
