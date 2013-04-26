/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao.model;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class Model<T extends Model> {

	protected Log log = LogFactory.getLog(this.getClass());

	public abstract Integer getPk();

	public abstract void setPk(Integer pk);

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (getClass().getName().equals(obj.getClass().getName())) {
			T objModel = (T) obj;
			if (getPk() != null && objModel.getPk() != null && getPk().equals(objModel.getPk()))
				isEqual = true;
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime + getPk();
		return result;
	}

	@Override
	public String toString() {
		String ret = null;
		Map bean = null;
		StringBuffer sb = null;

		try {
			sb = new StringBuffer();
			bean = BeanUtils.describe(this);

			for (Object o : bean.entrySet()) {
				Map.Entry e = (Map.Entry) o;
				if (e.getKey().equals(this.getClass().getSimpleName() + "Id")) {
					sb.append("class:").append(this.getClass().getSimpleName()).append(" ").append(e.getKey())
							.append(":").append(e.getValue());
				}
			}
			ret = sb.toString();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		return ret;
	}

	public T prop(Object name, Object value) {
		try {
			BeanUtils.setProperty(this, name.toString(), value);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return (T) this;
	}
}