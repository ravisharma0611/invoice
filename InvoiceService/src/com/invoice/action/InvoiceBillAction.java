package com.invoice.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InvoiceBillAction extends BaseServiceAction {
	Logger logger = LogManager.getLogger(InvoiceBillAction.class);
	private static final long serialVersionUID = 1L;

	public String submitInvoiceBill() {
		this.logger.info("Inside SUBMIT action class...");
		return SUCCESS;
	}
	
	public String loadInvoiceBill(){
		this.logger.info("Inside LOAD action class...");
		return SUCCESS;
	}
}