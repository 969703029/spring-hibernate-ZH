package org.TestSpringhibernate.SpringHibernate_ZH;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.ClassBean;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.service.IClassBeanService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author CC
* @version 创建时间：2017年8月14日 下午8:28:22
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Testclassmag {

	@Resource
	private IClassBeanService classBeanService;
	
	@Ignore
	public void getClassBean(){
//		ClassBean cb = classBeanService.getClassBeanandStus(2l);
//		System.out.println(cb);
//		Session session =getSession().getSession();
//		Session session2 =getSession().getSession();
//		Transaction tx1 = session.beginTransaction();
//		Transaction tx2 = session2.beginTransaction();
//		ClassBean cla1 = (ClassBean) session.get(ClassBean.class, 9l);
//		ClassBean cla2 = (ClassBean) session2.get(ClassBean.class, 9l);
//
//		System.out.println(cla1.getVersion());
//		System.out.println(cla2.getVersion());
//		
//		
//	
//		
//		cla1.setCalssName("测试5");
//		session.saveOrUpdate(cla1);
//		tx1.commit();
//		
//		cla2.setCalssName("测试4");
//		session2.saveOrUpdate(cla2);
//		tx2.commit();
	}
	
	
	
	@Ignore
	public void TestSaveClassBean(){
		ClassBean cb = new ClassBean();
		cb.setCalssName("J127");
		cb.setTime("2016-10-9");
		classBeanService.saveClassBean(cb);
	}
	
	@Test
	public void TestgetclassBean(){
		classBeanService.getClassBeanandStus(5l);
	}
}

