package com.invoice.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.invoice.bean.CustomerDetailBean;
import com.invoice.bean.DispatchDetailBean;
import com.invoice.bean.SessionData;
import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;

public class InvoiceBillAction extends BaseServiceAction {
	Logger logger = LogManager.getLogger(InvoiceBillAction.class);
	private static final long serialVersionUID = 1L;
	JpaService jpaService = JpaServiceFactory.getFactory();
	CustomerDetailBean customerDetailBean = new CustomerDetailBean();
	DispatchDetailBean dispatchDetailBean = new DispatchDetailBean();
	//String invoicePresent = "NP";

	SessionData sessionData = null;
	
	public String submitInvoiceBill()throws Exception {
		try{
			sessionData = (SessionData)sessionMap.get("SESSION_DATA");
			sessionData.setInvoiceNo(customerDetailBean.getInvoiceNo());
			sessionData.setCustomerDetailBean(customerDetailBean);
			dispatchDetailBean.setInvoiceNo(customerDetailBean.getInvoiceNo());
			sessionData.setDispatchDetailBean(dispatchDetailBean);
		}catch(Exception e){
			logger.error(e.getMessage());
			throw e;
		}
		return SUCCESS;
	}
	
	/*public String isInvoicePresent()throws Exception{
		try{
			jpaService.createEntityManager();
			if(request.getParameter("invoiceTestVal")!=null && !request.getParameter("invoiceTestVal").isEmpty()){
				Map<Integer,Object> parameters = new HashMap<Integer,Object>();
				Long invoiceUIValue = Long.parseLong(request.getParameter("invoiceTestVal"));
				String query = "select invoiceNo from CUSTOMERDETAIL where invoiceNo = "+invoiceUIValue+" and rownum = 1" ;
				if(jpaService.getUsingNativeQuery(query, parameters)!=null && 
						!jpaService.getUsingNativeQuery(query, parameters).isEmpty()){
					invoicePresent = "P";
				}
			}
			
		}catch(Exception e){
			logger.error(e.getMessage());
			throw e;
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		return SUCCESS;
	}*/
	public String loadInvoiceBill(){
		this.logger.info("Inside LOAD action class...");
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		try{
			jpaService.createEntityManager();
			if(customerDetailBean.getInvoiceNo()!=null){
				Map<Integer,Object> parameters = new HashMap<Integer,Object>();
				Long invoiceUIValue = customerDetailBean.getInvoiceNo();
				String query = "select invoiceNo from CUSTOMERDETAIL where invoiceNo = "+invoiceUIValue+" and rownum = 1" ;
				if(jpaService.getUsingNativeQuery(query, parameters)!=null && 
						!jpaService.getUsingNativeQuery(query, parameters).isEmpty()){
					addFieldError("invoiceNumberError","Invoice Number Already Present in System");
				}
			}
			
		}catch(Exception e){
			logger.error(e.getMessage());
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
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

	/*public String getInvoicePresent() {
		return invoicePresent;
	}

	public void setInvoicePresent(String invoicePresent) {
		this.invoicePresent = invoicePresent;
	}*/
	

	
	
	
}