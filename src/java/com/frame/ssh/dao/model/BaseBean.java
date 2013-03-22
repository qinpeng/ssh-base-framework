/**
 * Created on 2013-3-21
 * 
 */
package com.frame.ssh.dao.model;

import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

@SuppressWarnings("rawtypes")
public abstract class BaseBean {

	public BaseBean() {

		Map bean = null;

		try {
			bean = BeanUtils.describe(this);
			for (Object o : bean.entrySet()) {

				Map.Entry e = (Map.Entry) o;
				Class type = PropertyUtils.getPropertyType(this, e.getKey().toString());

				if (type.equals(Integer.class)) {
					PropertyUtils.setProperty(this, e.getKey().toString(), 0);
				} else if (type.equals(String.class)) {
					PropertyUtils.setProperty(this, e.getKey().toString(), "");
				} else if (type.equals(Date.class)) {
					PropertyUtils.setProperty(this, e.getKey().toString(), new Date());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		String ret = null;
		Map bean = null;

		try {
			StringBuffer sb = new StringBuffer();
			bean = BeanUtils.describe(this);
			for (Object o : bean.entrySet()) {
				Map.Entry e = (Map.Entry) o;
				sb.append(e.getKey()).append(":").append(e.getValue()).append(" ");
			}
			ret = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}

}
