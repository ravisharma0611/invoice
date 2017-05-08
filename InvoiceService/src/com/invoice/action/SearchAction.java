package com.invoice.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.invoice.bean.CustomerDetailBean;
import com.invoice.bean.ItemDetailBean;
import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;

@SuppressWarnings("serial")
public class SearchAction extends BaseServiceAction{
	//JpaService jpaService = JpaServiceFactory.getFactory();
	List<CustomerDetailBean> custList = new ArrayList<>();
	List<ItemDetailBean> itemList = new ArrayList<>();
	

	


	public String searchData()throws Exception{
		try{
			//jpaService.createEntityManager();
			System.out.println("in class");
			dummyData();
			
			
			/*Map<Integer,Object> parameters = new HashMap<Integer,Object>();
			StringBuffer query = new StringBuffer();
			query.append("select * from XYZ_TABLE where ");
			int count = 0;
			
			if(request.getParameter("invoiceId")!=null && !request.getParameter("invoiceId").isEmpty()){
				++count;
				query.append("INVOICENO=? and ");
				Long invoiceNo = Long.getLong(request.getParameter("invoiceId"));
				parameters.put(count,invoiceNo);
			}
			
			if(request.getParameter("date")!=null && !request.getParameter("date").isEmpty()){
				++count;
				String dateRange = request.getParameter("date");
				String startDate = dateRange.split("-")[0].trim();
				String endDate = dateRange.split("-")[1].trim();
				query.append("INVOICE_DATE>=? and INVOICE_DATE<=?");
				parameters.put(count,startDate);
				parameters.put(count+1,endDate);
				
			}
			
			if(query.toString().substring(query.length()-4).equalsIgnoreCase("and")){
				custList = jpaService.getUsingNativeQuery(query.toString().replaceFirst("and",""), parameters,CustomerDetailBean.class);
			}else{
				custList = jpaService.getUsingNativeQuery(query.toString(), parameters,CustomerDetailBean.class);
			}
			*/
			
			
			
		}catch(Exception e){
			throw e;
		}finally{
			//jpaService.commitAndCloseEntityManager();
		}
		return SUCCESS;
	}
	
	
	public String findItem()throws Exception{
		try{
			dummyItem();
		}catch(Exception e){
			
		}finally{
			
		}
		return SUCCESS;
	}
	
	private void dummyItem(){
		ItemDetailBean bn = new ItemDetailBean();
		bn.setItem("Dummy Item");
		bn.setPer("NA");
		bn.setPrice(345.76f);
		bn.setQuantity(12);
		bn.setSubTotal(4356.980f);
		itemList.add(bn);
	}
	
	private void dummyData(){
		/*CustomerDetailBean bean = new CustomerDetailBean();
		bean.setBilledAddress("Patna");
		bean.setBilledName("Vivek");
		bean.setChallanNo("ASP-897-BN");
		bean.setChallanNoDate("12-April-2017");
		bean.setCourierCharge(567l);
		bean.setGrandTotal(980d);
		bean.setGrandTotalWords("Nine Hundred and Eighty Only");
		bean.setInvoiceDate("12-April-2017");
		bean.setInvoiceNo(129167l);
		bean.setLbt(23d);
		bean.setLbtPercent(12d);
		bean.setPoNo("UI:123");
		bean.setPoNoDate("12-April-2017");
		bean.setServiceTax(23d);
		bean.setServiceTaxPercent(12d);
		bean.setVat(3.4d);
		bean.setVatNo("34SD");
		bean.setVatPercent(1d);*/
		
		//custList.add(bean);
	}
	
	public List<CustomerDetailBean> getCustList() {
		return custList;
	}

	public void setCustList(List<CustomerDetailBean> custList) {
		this.custList = custList;
	}
	
	public List<ItemDetailBean> getItemList() {
		return itemList;
	}


	public void setItemList(List<ItemDetailBean> itemList) {
		this.itemList = itemList;
	}
}
