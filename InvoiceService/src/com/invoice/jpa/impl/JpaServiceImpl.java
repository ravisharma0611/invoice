/**
 * 
 */
package com.invoice.jpa.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.invoice.jpa.JpaService;

/**
 * @author RAVI
 *
 */
public class JpaServiceImpl implements JpaService {

	private static JpaServiceImpl jpaServiceImpl = null;
	private static EntityManagerFactory managerFactory =null;
	
	private JpaServiceImpl() {
	}
	
	private JpaServiceImpl(String unitName) {
		managerFactory = Persistence.createEntityManagerFactory(unitName);
	}
	
	public static JpaService createInstance(String unitName){
		if(managerFactory == null){
			return jpaServiceImpl = new JpaServiceImpl(unitName);
		}else{
			return jpaServiceImpl;
		}
	}
	
	@Override
	public <T> void saveEntity(Class<T> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void updateEntity(Class<T> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> List<T> getEntity(int invoiceNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void getEntityManager(){
		managerFactory.createEntityManager( );
	}

}
