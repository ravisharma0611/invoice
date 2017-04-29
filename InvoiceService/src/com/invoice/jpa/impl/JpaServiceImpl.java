/**
 * 
 */
package com.invoice.jpa.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import com.invoice.jpa.JpaService;

/**
 * @author RAVI
 *
 */
public class JpaServiceImpl implements JpaService {

	private static EntityManagerFactory managerFactory =null;
	private EntityManager entityManager;
	
	public JpaServiceImpl(String unitName) {
		if(managerFactory == null){
			managerFactory = Persistence.createEntityManagerFactory(unitName);
		}
	}
	
	@Override
	public void createEntityManager()throws Exception{
		try{
			entityManager = managerFactory.createEntityManager();
			if(entityManager.isOpen()){
				entityManager.getTransaction().begin();
			}else{
				throw new Exception("Entity Manager is closed");
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	@Override
	public void commitAndCloseEntityManager(){
		try{
			if(entityManager.getTransaction().isActive()){
				entityManager.getTransaction().commit();
				if(entityManager.isOpen()){
					entityManager.close();
				}else{
					throw new Exception("Transaction not active");
				}
			}else{
				throw new Exception("Entity Manager is closed");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public <T> void saveEntity(Object entity) throws Exception{
		try{
			entityManager.persist(entity);
		}catch(RollbackException e){
			entityManager.getTransaction().rollback();
		}catch(Exception e){
			throw e;
		}
		
	}

	@Override
	public <T> void updateEntity(Object entity) throws Exception{
		try{
			entityManager.merge(entity);
		}catch(RollbackException e){
			entityManager.getTransaction().rollback();
		}catch(Exception e){
			throw e;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getEntity(Class<T> entityBean,int invoiceNo) throws Exception{
		Object obj = null;
		try{
			obj = entityManager.find(entityBean, invoiceNo);
		}catch(Exception e){
			throw e;
		}
		return (T) obj;
	}
	
	public void getEntityManager(){
		managerFactory.createEntityManager( );
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getUsingNamedQuery(String namedQueryName, Map<String, Object> parameters, Class<T> entity)
			throws Exception {
		List<T> list = null;
		try{
			Query query = entityManager.createNamedQuery(namedQueryName,entity);
			for(Map.Entry<String, Object> param:parameters.entrySet()){
				query.setParameter(param.getKey(), param.getValue());
			}
			list = query.getResultList();
		}catch(Exception e){
			throw e;
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getUsingNativeQuery(String nativeQquery, Map<Integer, Object> parameters) throws Exception {
		List<T> list = null;
		try{
			Query query = entityManager.createNativeQuery(nativeQquery);
			for(Map.Entry<Integer, Object> param:parameters.entrySet()){
				query.setParameter(param.getKey(), param.getValue());
			}
			list = query.getResultList();
		}catch(Exception e){
			throw e;
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getUsingNativeQuery(String nativeQquery, Map<Integer, Object> parameters,Class<T> className) throws Exception {
		List<T> list = null;
		try{
			Query query = entityManager.createNativeQuery(nativeQquery,className);
			for(Map.Entry<Integer, Object> param:parameters.entrySet()){
				query.setParameter(param.getKey(), param.getValue());
			}
			list = query.getResultList();
		}catch(Exception e){
			throw e;
		}
		return list;
	}

}
