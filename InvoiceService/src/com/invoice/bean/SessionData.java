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
	private String userName;
	private String firstName;
	private DispatchDetailBean dispatchDetailBean;
	private CustomerDetailBean customerDetailBean;
	
	public DispatchDetailBean getDispatchDetailBean() {
		return dispatchDetailBean;
	}

	public void setDispatchDetailBean(DispatchDetailBean dispatchDetailBean) {
		this.dispatchDetailBean = dispatchDetailBean;
	}

	public CustomerDetailBean getCustomerDetailBean() {
		return customerDetailBean;
	}

	public void setCustomerDetailBean(CustomerDetailBean customerDetailBean) {
		this.customerDetailBean = customerDetailBean;
	}

	public Long getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} 
	
	
}
