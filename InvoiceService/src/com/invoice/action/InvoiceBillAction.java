package com.invoice.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.invoice.bean.CustomerDetailBean;
import com.invoice.bean.DispatchDetailBean;

public class InvoiceBillAction extends BaseServiceAction {
	Logger logger = LogManager.getLogger(InvoiceBillAction.class);
	private static final long serialVersionUID = 1L;
	CustomerDetailBean customerDetailBean = new CustomerDetailBean();
	DispatchDetailBean dispatchDetailBean = new DispatchDetailBean();
	
	public String submitInvoiceBill() {
		this.logger.info("Inside SUBMIT action class...");
		System.out.println(customerDetailBean);
		System.out.println(dispatchDetailBean);
		return SUCCESS;
	}
	
	public String loadInvoiceBill(){
		this.logger.info("Inside LOAD action class...");
		return SUCCESS;
	}

	public CustomerDetailBean getCustomerDetailBean() {
		return customerDetailBean;
	}

	public void setCustomerDetailBean(CustomerDetailBean customerDetailBean) {
		this.customerDetailBean = customerDetailBean;
	}

	public DispatchDetailBean getDispatchDetailBean() {
		return dispatchDetailBean;
	}

	public void setDispatchDetailBean(DispatchDetailBean dispatchDetailBean) {
		this.dispatchDetailBean = dispatchDetailBean;
	}
	
	
}