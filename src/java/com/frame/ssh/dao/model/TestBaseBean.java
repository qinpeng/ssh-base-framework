/**
 * Created on 2013-3-21
 * 
 */
package com.frame.ssh.dao.model;

import java.util.Date;

public class TestBaseBean extends BaseBean {
	private Integer id;
	private String name;
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static void main(String[] args) {
		TestBaseBean bean = new TestBaseBean();
		System.out.println(bean);
	}

}
