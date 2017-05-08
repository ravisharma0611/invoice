package com.invoice.action;

import com.invoice.bean.ItemDetailBean;
import com.invoice.jpa.JpaService;
import com.invoice.jpa.JpaServiceFactory;

@SuppressWarnings("serial")
public class ItemDetailAction extends BaseServiceAction{
	private ItemDetailBean itemDetailBean;
	JpaService jpaService = JpaServiceFactory.getFactory();
	
	
	public String submitItemDetails()throws Exception{
		try{
			jpaService.createEntityManager();
			itemDetailBean.setInvoiceNo(76548l);
			jpaService.saveEntity(itemDetailBean);
			
		}catch(Exception e){
			throw e;
		}finally{
			jpaService.commitAndCloseEntityManager();
		}
		return SUCCESS;
	}
	
	public ItemDetailBean getItemDetailBean() {
		return itemDetailBean;
	}

	public void setItemDetailBean(ItemDetailBean itemDetailBean) {
		this.itemDetailBean = itemDetailBean;
	}

}
