package org.TestSpringhibernate.SpringHibernate_ZH.stumag.dao;

import java.util.List;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.Pages;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.StudentBean;


/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:47:00
*/
public interface IStudentDao {

public void saveStuudentBean(StudentBean student);
	
	public void deleteStuudentBean2Id(StudentBean student);
	
	public void updateStuudentBean(StudentBean student);
	
	public StudentBean getStuudentBeanById(Long id);
	
	public Pages findUserListByObjectToPager(Pages page,String stuname);
	
	public List<?> findClassBeanByStuname(String name);
}

