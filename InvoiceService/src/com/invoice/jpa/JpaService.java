package com.invoice.jpa;

import java.util.List;

public interface JpaService {

	<T> void saveEntity( Class<T> entity);
	
	<T> void updateEntity(Class<T> entity);
	
	<T> List<T> getEntity(int invoiceNo);

}
