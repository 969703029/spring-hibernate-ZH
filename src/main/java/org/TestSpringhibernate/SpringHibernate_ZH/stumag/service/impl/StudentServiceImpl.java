package org.TestSpringhibernate.SpringHibernate_ZH.stumag.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.Pages;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.StudentBean;
import org.TestSpringhibernate.SpringHibernate_ZH.stumag.dao.IStudentDao;
import org.TestSpringhibernate.SpringHibernate_ZH.stumag.service.IStudentService;
import org.springframework.stereotype.Service;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:47:54
*/
@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	
	
	public void saveStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveStuudentBean(student);
	}

	public void deleteStuudentBean2Id(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStuudentBean2Id(student);
	}

	public void updateStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateStuudentBean(student);
	}

	public StudentBean getStuudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStuudentBeanById(id);
	}

	public Pages findUserListByObjectToPager(Pages page, String stuname) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findUserListByObjectToPager(page, stuname);
	}

	public List<?> findClassBeanByStuname(String name) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findClassBeanByStuname(name);
	}

}

