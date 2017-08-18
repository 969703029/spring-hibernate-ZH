package org.TestSpringhibernate.SpringHibernate_ZH;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.ClassBean;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.StudentBean;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.TeacherBean;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.service.IClassBeanService;
import org.TestSpringhibernate.SpringHibernate_ZH.stumag.service.IStudentService;
import org.TestSpringhibernate.SpringHibernate_ZH.teamag.service.ITeacherBeanService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author CC
* @version 创建时间：2017年8月15日 下午1:36:12
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestTeamag {

	@Resource
	private ITeacherBeanService teacherBeanServiceimpl;
	
	@Resource
	private IStudentService studentServiceImpl;
	
	@Resource
	private IClassBeanService classBeanService;
	
	@Ignore
	public void saveTeacher(){
		TeacherBean tb = new TeacherBean();
		tb.setTerName("张老师");
		teacherBeanServiceimpl.saveteacher(tb);
	}
	
	@Test
	public void savestuandtea(){
		
//		ClassBean cb = classBeanService.getClassBeanandStus(8l);
//		
//		StudentBean stu = new StudentBean();
//		stu.setGender("男");
//		stu.setBirthday("1987-10-1");
//		stu.setStuName("祝小庆");
//		stu.setCb(cb);
		
		StudentBean stu =studentServiceImpl.getStuudentBeanById(6l);
		TeacherBean tb = teacherBeanServiceimpl.getteacherByid(3l);
		
//		tb.getStus().add(stu);
//		stu.getTeas().add(tb);
		
//		studentServiceImpl.saveStuudentBean(stu);
	}
	
	@Ignore
	public void TestfindstudentBytea(){
		List<?> list = teacherBeanServiceimpl.findstudentBytea("测试");
//		for(int i=0;i<list.size();i++){
//			System.out.println(((StudentBean)list.get(i)).getTeas());
//		}
		System.out.println(list);
	}
	@Ignore
	public void TestSession(){
//		Session session =SessionUtils.getSession();
//		Session session2 =SessionUtils.getSession();
//		Transaction tx1 = session.beginTransaction();
//		Transaction tx2 = session2.beginTransaction();
//		ClassBean cla1 = (ClassBean) session.get(ClassBean.class, 9l);
//		ClassBean cla2 = (ClassBean) session2.get(ClassBean.class, 9l);
//
//
//		cla1.setCalssName("测试5");
//		session.saveOrUpdate(cla1);
//		tx1.commit();
		
//		cla2.setCalssName("测试4");
//		session2.saveOrUpdate(cla2);
//		tx2.commit();
	}
	
}

