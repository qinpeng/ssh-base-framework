/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Model {

	protected Log log = LogFactory.getLog(this.getClass());

	public abstract Integer getPk();

	public abstract void setPk(Integer pk);

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (getClass().getName().equals(obj.getClass().getName())) {
			Model objModel = (Model) obj;
			if (getPk() != null && objModel.getPk() != null && getPk().equals(objModel.getPk()))
				isEqual = true;
		}
		return isEqual;
	}
}
