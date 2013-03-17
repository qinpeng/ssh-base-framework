/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

public interface BaseDao<T> {

	public Integer add(T model);

	public void addAll(Collection<T> models);

	public boolean updateById(T model);

	public void update(Collection<T> models);

	public boolean deleteById(Integer id);

	public boolean delete(T model);

	public T loadById(Integer id);

	public List<T> loadAll();

	public List<T> find(DetachedCriteria dc);

	public List<T> find(T model);

	public int count(DetachedCriteria dc);
	
	public int count(T model);
	
	public DetachedCriteria criteria();

	public Session session();

	public void closeSession();

	public HibernateTemplate getTemplate();
}
