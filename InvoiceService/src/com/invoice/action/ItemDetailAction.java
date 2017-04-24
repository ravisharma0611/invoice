package com.invoice.action;

import com.invoice.bean.ItemDetailBean;
import com.invoice.jpa.JpaServiceFactory;
import com.invoice.jpa.impl.JpaServiceImpl;

@SuppressWarnings("serial")
public class ItemDetailAction extends BaseServiceAction{
	private ItemDetailBean itemDetailBean;
	JpaServiceImpl jpaService = (JpaServiceImpl) JpaServiceFactory.getFactory();
	
	
	public String submitItemDetails()throws Exception{
		try{
			jpaService.createEntityManager();
			
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
