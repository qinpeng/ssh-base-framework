/**
 * Created on 2013-3-10
 * 
 */
package com.frame.ssh.service;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import com.frame.ssh.dao.HhJob;
import com.frame.ssh.dao.HhJobApply;
import com.frame.ssh.dao.HibernateBase;

public class JobTest extends HibernateBase {

	@Test
	public void findTest() {
		beginTransaction();
		List<HhJob> i = session.createCriteria(HhJob.class).list();
		for (HhJob j : i) {
			System.out.println("find test ==> hhJobId " + j.getHhJobId());
		}
	}

	@Test
	public void findByGroupTest() {
		beginTransaction();
		List<Integer> i = session.createCriteria(HhJob.class).setProjection(Projections.groupProperty("companyId"))
				.list();

		for (int j : i) {
			System.out.println("find by group test ==> companyId " + j + " total " + i.size());
		}
	}

	@Test
	public void oneToManyTest() {
		beginTransaction();
		List<HhJob> i = session.createCriteria(HhJob.class).add(Restrictions.eq("hhJobId", 1)).list();
		for (HhJob j : i) {
			System.out.println("one to many test => apply size " + j.getHhJobApplies().size());
		}
	}

	@Test
	public void insertTest() {
		HhJob job = new HhJob();
		job.setName("abc");
		job.setCompanyId(111);
		job.setCountry((byte) 1);
		job.setCity((short) 1);
		job.setVacancy((short) 1);
		job.setNature((byte) 1);
		job.setSize((byte) 1);
		job.setIndustry((byte) 1);
		job.setFunctionCategory((byte) 1);
		job.setAnnualPay(1000);
		job.setDescription("descxxxxxxxxx");
		job.setRequirement("reqxxxxxxxxxx");
		job.setOnBoardDate(new Date());
		job.setOpenType('O');
		job.setOpenLevel('O');
		job.setPriceType('C');
		job.setUpdateTime(new Date());
		job.setCreateTime(new Date());
		beginTransaction();
		session.save(job);
		endTransaction(true);
		System.out.println("insert test ==> hhJobId " + job.getHhJobId());
	}

	@Test
	public void updateTest() {
		HhJob job = new HhJob();
		beginTransaction();
		HhJob jCp = (HhJob) session.createCriteria(HhJob.class).add(Restrictions.eq("hhJobId", 700)).list().get(0);
		endTransaction(false);
		BeanUtils.copyProperties(jCp, job);
		job.setMaskName("test");
		job.setUpdateTime(new Date());
		beginTransaction();
		session.update(job);
		endTransaction(true);
	}

	@Test
	public void oneToManyByCriteriaTest() {
		beginTransaction();
		List<HhJob> i = session.createCriteria(HhJob.class).createAlias("hhJobApplies", "apply")
				.add(Restrictions.eq("apply.email", "hanchaoy@hotmail.com")).list();
		for (HhJob j : i) {
			System.out.println("one to many by criteria test => apply size " + j.getHhJobApplies().size());
			for (HhJobApply apply : j.getHhJobApplies()) {
				System.out.println(apply.getEmail() + apply.getHhJobApplyId());
			}
		}

		endTransaction(false);
	}
}
