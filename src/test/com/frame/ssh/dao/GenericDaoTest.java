/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.frame.ssh.dao.model.HhJob;
import com.frame.ssh.dao.model.HhJob.OpenLevel;
import com.frame.ssh.dao.model.HhJob.OpenType;
import com.frame.ssh.dao.model.HhJob.PriceType;
import com.frame.ssh.dao.model.HhJob.Status;
import com.frame.ssh.util.context.SpringContextHolder;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.googlecode.genericdao.search.Search;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans/spring-basic-beans.xml"})
public class GenericDaoTest extends AbstractJUnit4SpringContextTests {
	GenericDAO<HhJob, Integer> hhJobDao;
	@Test
	public void testDao() throws Exception {
		hhJobDao = SpringContextHolder.getBean("hhJobDao");
		HhJob job = new HhJob();
		List<HhJob> jobs = null;
		int maxId = 0;
		//
		jobs = hhJobDao.search(new Search().addSort(HhJob.FieldNamesEnum.hhJobId.toString(), true).setMaxResults(1));
		maxId = jobs.get(0).getHhJobId();
		System.out.println("get max id " + maxId);
		//
		job.setName("abc");
		jobs = hhJobDao.search(new Search().addFilter(hhJobDao.getFilterFromExample(job)));
		System.out.println("find by example "
				+ hhJobDao.search(new Search().addFilter(hhJobDao.getFilterFromExample(job))).size());
		//
		for (HhJob j : jobs)
			System.out.println("delete by id " + hhJobDao.removeById(j.getHhJobId()));
		//
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
		System.out.println("insert " + hhJobDao.save(job));
		job.setHhJobId(null);
		System.out.println("insert " + hhJobDao.save(job));
		job.setHhJobId(null);
		System.out.println("insert " + hhJobDao.save(job));
	}
}
