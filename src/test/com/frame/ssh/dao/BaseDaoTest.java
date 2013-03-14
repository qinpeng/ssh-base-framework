/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.frame.ssh.dao.model.HhJob;
import com.frame.ssh.dao.model.HhJob.OpenLevel;
import com.frame.ssh.dao.model.HhJob.OpenType;
import com.frame.ssh.dao.model.HhJob.PriceType;
import com.frame.ssh.dao.model.HhJob.Status;
import com.frame.ssh.dao.model.HhJobApply;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans/spring-basic-beans.xml"})
public class BaseDaoTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	IBaseDao hhJobDao;

	@Test
	public void testDao() throws Exception {
		HhJob job = new HhJob();
		job.setHhJobId(713);
		System.out.println("get by id " + hhJobDao.loadById(job.getHhJobId()));
		job.setName("abc");
		System.out.println("find by example " + hhJobDao.find(job));
		job.setName("abc");
		System.out.println("delete by example " + hhJobDao.delete(job));

		job.setCompanyId(111);
		job.setCompanyUserId(1);
		job.setCountry((byte) 1);
		job.setCity((short) 1);
		job.setVacancy((short) 1);
		job.setIndustry((short) 1);
		job.setAnnualPay(1111);
		job.setNature((byte) 1);
		job.setSize((byte) 2222);
		job.setFunctionCategory((byte) 1);
		job.setStatus(Status.C.toString().charAt(0));
		job.setUrgent('Y');
		job.setPriceType(PriceType.F.toString().charAt(0));
		job.setOpenLevel(OpenLevel.A.toString().charAt(0));
		job.setOpenType(OpenType.A.toString().charAt(0));
		job.setName("abc");
		job.setDescription("ccc");
		job.setRequirement("eeeeeee");
		job.setOnBoardDate(new Date());
		job.setUpdateTime(new Date());
		System.out.println("insert " + hhJobDao.add(job));
	}

	@Test
	public void findTest() {
		List<HhJob> i = hhJobDao.session().createCriteria(HhJob.class).list();
		for (HhJob j : i) {
			System.out.println("find test ==> hhJobId " + j.getHhJobId());
		}
	}

	@Test
	public void findByGroupTest() {
		List<Integer> i = hhJobDao.session().createCriteria(HhJob.class)
				.setProjection(Projections.groupProperty("companyId")).list();

		for (int j : i) {
			System.out.println("find by group test ==> companyId " + j + " total " + i.size());
		}
	}

	@Test
	public void oneToManyTest() {
		List<HhJob> i = hhJobDao.session().createCriteria(HhJob.class).add(Restrictions.eq("hhJobId", 1)).list();
		for (HhJob j : i) {
			System.out.println("one to many test => apply size " + j.getHhJobApplies().size());
		}
	}

	@Test
	public void insertTest() {
		HhJob job = new HhJob();
		job.setCompanyId(111);
		job.setCompanyUserId(1);
		job.setCountry((byte) 1);
		job.setCity((short) 1);
		job.setVacancy((short) 1);
		job.setIndustry((short) 1);
		job.setAnnualPay(1111);
		job.setNature((byte) 1);
		job.setSize((byte) 2222);
		job.setFunctionCategory((byte) 1);
		job.setStatus(Status.C.toString().charAt(0));
		job.setUrgent('Y');
		job.setPriceType(PriceType.F.toString().charAt(0));
		job.setOpenLevel(OpenLevel.A.toString().charAt(0));
		job.setOpenType(OpenType.A.toString().charAt(0));
		job.setName("abc");
		job.setDescription("ccc");
		job.setRequirement("eeeeeee");
		job.setOnBoardDate(new Date());
		job.setUpdateTime(new Date());
		hhJobDao.session().save(job);
		hhJobDao.closeSession();
		System.out.println("insert test ==> hhJobId " + job.getHhJobId());
	}

	@Test
	public void updateTest() {
		HhJob job = (HhJob) hhJobDao.find(hhJobDao.criteria().add(Restrictions.eq("hhJobId", 400))).get(0);
		job.setMaskName("222222222222222");
		job.setUpdateTime(new Date());
		hhJobDao.updateById(job);
	}

	@Test
	public void oneToManyByCriteriaTest() {
		List<HhJob> i = hhJobDao.session().createCriteria(HhJob.class).createAlias("hhJobApplies", "apply")
				.add(Restrictions.eq("apply.email", "hanchaoy@hotmail.com")).list();
		for (HhJob j : i) {
			System.out.println("one to many by criteria test => apply size " + j.getHhJobApplies().size());
			for (HhJobApply apply : j.getHhJobApplies()) {
				System.out.println(apply.getEmail() + apply.getHhJobApplyId());
			}
		}

	}
}
