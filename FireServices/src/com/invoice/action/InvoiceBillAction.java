/**
 * 
 */
package com.invoice.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * @author RAVI
 *
 */
public class InvoiceBillAction extends BaseServiceAction {

	Logger logger = LogManager.getLogger(InvoiceBillAction.class) ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String submitInvoiceBill(){
		logger.info("Inside action class...");
		return SUCCESS;
	}

}
