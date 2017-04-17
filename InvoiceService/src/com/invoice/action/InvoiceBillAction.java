package com.invoice.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;

public class InvoiceBillAction extends BaseServiceAction {
	Logger logger = LogManager.getLogger(InvoiceBillAction.class);
	private static final long serialVersionUID = 1L;

	public String submitInvoiceBill() {
		this.logger.info("Inside SUBMIT action class...");
		JpaService jpaService = JpaServiceFactory.getFactory();
		jpaService.saveEntity(null);
		return SUCCESS;
	}
	
	public String loadInvoiceBill(){
		this.logger.info("Inside LOAD action class...");
		return SUCCESS;
	}
}