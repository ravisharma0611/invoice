package com.invoice.jpa;

import java.util.List;
import java.util.Map;

public interface JpaService {

	<T> void saveEntity( Object entity)throws Exception;
	
	<T> void updateEntity(Object entity)throws Exception;
	
	<T> T getEntity(Class<T> entityBean,int invoiceNo)throws Exception;
	
	<T> List<T> getUsingNamedQuery(String namedQueryName,Map<String,Object> parameters,Class<T> entity)throws Exception;
	
	<T> List<T> getUsingNativeQuery(String nativeQquery,Map<Integer,Object> parameters)throws Exception;
	
	void createEntityManager()throws Exception;
	
	void commitAndCloseEntityManager();

}
