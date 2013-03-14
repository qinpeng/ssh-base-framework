/**
 * Created on 2013-3-14
 * 
 */
package com.frame.ssh.dao;

import java.util.Date;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans/spring-basic-beans.xml"})
public class BaseDaoTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void testDao() throws Exception {
		IBaseDao jobDao = SpringContextHolder.getBean("hhJobDao");
		HhJob job = new HhJob();
		job.setHhJobId(713);
		System.out.println("get by id " + jobDao.loadById(job.getHhJobId()));
		job.setName("abc");
		System.out.println("find by example " + jobDao.find(job));
		job.setName("abc");
		System.out.println("delete by example " + jobDao.delete(job));

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
		System.out.println("insert " + jobDao.add(job));
	}
}
