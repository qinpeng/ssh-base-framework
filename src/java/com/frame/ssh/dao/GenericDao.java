/**
 * Created on 2013-3-17
 * 
 */
package com.frame.ssh.dao;

import java.io.Serializable;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

public class GenericDao<T, ID extends Serializable> extends GenericDAOImpl<T, ID> {

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

}
