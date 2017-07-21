package com.invoice.action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.convert.ConversionLocale;
import com.convert.NumberToWord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.invoice.bean.CustomerDetailBean;
import com.invoice.bean.ItemDetailBean;
import com.invoice.bean.SessionData;
import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;

@SuppressWarnings("serial")
public class ItemDetailAction extends BaseServiceAction{
	Logger logger = LogManager.getLogger(ItemDetailAction.class);
	private String operationStatus;
	private Long invoiceNumber;
	

	JpaService jpaService = JpaServiceFactory.getFactory();
	SessionData sessionData = null;
	
	public String submitItemDetails()throws Exception{
		try{
			Float grandTotal = 0.0f;
			Float greatGrandTotal = 0.0f;
			sessionData = (SessionData)sessionMap.get("SESSION_DATA");
			jpaService.createEntityManager();
			invoiceNumber = sessionData.getInvoiceNo();
			String jsonObject = request.getParameter("JSONObject");
			if(jsonObject!=null && !jsonObject.isEmpty()){
				Gson gson = new Gson();
				List<ItemDetailBean> itemDetailBeanList = gson.fromJson(jsonObject,new TypeToken<List<ItemDetailBean>>(){}.getType());
				if(itemDetailBeanList!=null && !itemDetailBeanList.isEmpty()){
					for(int i=0;i<itemDetailBeanList.size();i++){
						grandTotal+=itemDetailBeanList.get(i).getSubTotal();
						itemDetailBeanList.get(i).setInvoiceNo(sessionData.getInvoiceNo());
						jpaService.saveEntity(itemDetailBeanList.get(i));
					}
				}
			}
			if(sessionData.getCustomerDetailBean()!=null && sessionData.getDispatchDetailBean()!=null){
				sessionData.getCustomerDetailBean().setGrandTotal(grandTotal);
				
				CustomerDetailBean customerDetailBean = sessionData.getCustomerDetailBean();
				Float lbtCalculated = 0.0F;
				if(null != customerDetailBean.getLbtPercent()){
					lbtCalculated = (Float) (grandTotal*customerDetailBean.getLbtPercent()/100);
				}
				Float vatCalculated = 0.0F;
				if(null != customerDetailBean.getVatPercent()){
					vatCalculated = (Float) (grandTotal*customerDetailBean.getVatPercent()/100);
				}
				Float serviceTaxCalculated = 0.0F;
				if(null != customerDetailBean.getServiceTaxPercent()){
					serviceTaxCalculated = (Float) (grandTotal*customerDetailBean.getServiceTaxPercent()/100);
				}
				Float courierCharge =0.0F;
				if(null != customerDetailBean.getCourierCharge()){
					courierCharge = customerDetailBean.getCourierCharge();
				}
				greatGrandTotal = grandTotal+lbtCalculated+vatCalculated+serviceTaxCalculated+courierCharge;
				
				sessionData.getCustomerDetailBean().setLbt(lbtCalculated);
				sessionData.getCustomerDetailBean().setVat(vatCalculated);
				sessionData.getCustomerDetailBean().setServiceTax(serviceTaxCalculated);
				
				String numberToWord = NumberToWord.getNumberToWord(Math.round(greatGrandTotal), ConversionLocale.INDIA);
				//NumberToWords.convert((Integer)Math.round(greatGrandTotal))
				sessionData.getCustomerDetailBean().setGrandTotalWords(numberToWord);
				sessionData.getCustomerDetailBean().setGreatGrandTotal(greatGrandTotal);
				jpaService.saveEntity(sessionData.getCustomerDetailBean());
				jpaService.saveEntity(sessionData.getDispatchDetailBean());
			}else{
				throw new Exception("CustomerDetailBean or DispatchDetailBean is null");
			}
			operationStatus = "SUCCESS";
			
			
		}catch(Exception e){
			operationStatus = "FAIL";
			logger.error(e.getMessage());
			throw e;
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		return SUCCESS;
	}
	
	
	public String getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}
	public Long getInvoiceNumber() {
		return invoiceNumber;
	}


	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
}
