package org.TestSpringhibernate.SpringHibernate_ZH;


import java.util.List;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.Pages;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.StudentBean;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.service.IClassBeanService;
import org.TestSpringhibernate.SpringHibernate_ZH.stumag.service.IStudentService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午10:33:58
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestStumag {

	@Resource
	private IStudentService studentServiceImpl;
	
	@Resource
	private IClassBeanService classBeanService;
	
	@Test
	public void findClassBeanByStuname(){
		List<?> cb = studentServiceImpl.findClassBeanByStuname("张");
		System.out.println(cb);
	}
	
	@Ignore
	public void findUserListByObjectToPager(){
		Pages pg = new Pages(1,2);
		Pages result = studentServiceImpl.findUserListByObjectToPager(pg, "张");
		System.out.println(result);
		
	}

	@Ignore
	public void updateStuudentBean(){
		StudentBean stu = new StudentBean();
		stu.setId(6l);
		stu.setGender("男");
		stu.setBirthday("1999-9-9");
		stu.setStuName("张富贵");
		studentServiceImpl.updateStuudentBean(stu);
	}
	
	
	@Ignore
	public void deleteStuudentBean2Id(){
		StudentBean stu = studentServiceImpl.getStuudentBeanById(5l);
		Assert.assertNotNull(stu);
		studentServiceImpl.deleteStuudentBean2Id(stu);
	}
	
//	@Ignore
//	public void testSaveStudentBean(){
//		
//		ClassBean cb = classBeanService.getClassBeanandStus(8l);
//		
//		
//		StudentBean stu = new StudentBean();
//		stu.setStuName("程序员");
//		stu.setGender("男");
//		stu.setBirthday("1960-5-9");
//		
//		cb.getStu().add(stu);
//		stu.setCb(cb);
//		
//		studentServiceImpl.saveStuudentBean(stu);
//	}
	
	
	
	
}

