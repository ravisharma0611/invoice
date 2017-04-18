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

	private static EntityManagerFactory managerFactory =null;
	
	public JpaServiceImpl(String unitName) {
		if(managerFactory == null){
			managerFactory = Persistence.createEntityManagerFactory(unitName);
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
