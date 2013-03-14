/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {
	protected Log log = LogFactory.getLog(this.getClass());
	protected int firstResult;
	protected int maxResults;
	private Class<T> modelClass;

	public void setModelClass(Class<T> modelClass) {
		this.modelClass = modelClass;
	}

	public BaseDaoImpl(Class<T> modelClass) {
		this.modelClass = modelClass;
	}

	@Override
	public Integer add(T model) {
		Integer id = null;
		try {
			id = (Integer) this.getHibernateTemplate().save(model);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return id;
	}

	@Override
	public void addAll(Collection<T> models) {
		try {
			this.getHibernateTemplate().saveOrUpdateAll(models);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@Override
	public boolean updateById(T model) {
		boolean bo = false;
		try {
			this.getHibernateTemplate().update(model);
			bo = true;
		} catch (Exception e) {
			bo = false;
			log.error(e.getMessage(), e);
		}
		return bo;
	}

	@Override
	public void update(Collection<T> models) {
		try {
			this.getHibernateTemplate().saveOrUpdateAll(models);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T loadById(Integer id) {
		T ety = null;
		try {
			ety = (T) this.getHibernateTemplate().get(modelClass, id);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ety;
	}

	@Override
	public boolean deleteById(Integer id) {
		boolean bo = false;
		try {
			T ety = loadById(id);
			if (ety != null)
				this.getHibernateTemplate().delete(ety);
			bo = true;
		} catch (Exception e) {
			bo = false;
			log.error(e.getMessage(), e);
		}
		return bo;
	}
	@Override
	public boolean delete(T model) {
		boolean bo = false;
		try {
			List<T> etys = find(model);
			if (etys != null)
				this.getHibernateTemplate().deleteAll(etys);
			bo = true;
		} catch (Exception e) {
			bo = false;
			log.error(e.getMessage(), e);
		}
		return bo;
	}

	@Override
	public List<T> loadAll() {
		List<T> list = null;
		try {
			this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(modelClass));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(DetachedCriteria dc) {
		List<T> list = new ArrayList<T>();
		try {
			list = (List<T>) this.getHibernateTemplate().findByCriteria(dc);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(T model) {
		List<T> list = new ArrayList<T>();
		try {
			list = (List<T>) this.getHibernateTemplate().findByExample(model);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return list;

	}
	@Override
	public Session session() {
		return this.getSession();
	}

	@Override
	public HibernateTemplate getTemplate() {
		return this.getHibernateTemplate();
	}

}
