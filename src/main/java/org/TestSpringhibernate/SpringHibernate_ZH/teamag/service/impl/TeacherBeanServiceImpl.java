package org.TestSpringhibernate.SpringHibernate_ZH.teamag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.TeacherBean;
import org.TestSpringhibernate.SpringHibernate_ZH.teamag.dao.ITeacherDao;
import org.TestSpringhibernate.SpringHibernate_ZH.teamag.service.ITeacherBeanService;
import org.springframework.stereotype.Service;

/**
* @author CC
* @version 创建时间：2017年8月15日 下午1:31:42
*/
@Service
public class TeacherBeanServiceImpl implements ITeacherBeanService {
	@Resource
	private ITeacherDao teacherDaoimpl;
	
	public void saveteacher(TeacherBean tb) {
		// TODO Auto-generated method stub
		teacherDaoimpl.saveteacher(tb);
	}

	public void updateteacher(TeacherBean tb) {
		// TODO Auto-generated method stub
		teacherDaoimpl.updateteacher(tb);
	}

	public List<?> findstudentBytea(String teaname) {
		// TODO Auto-generated method stub
		return teacherDaoimpl.findstudentBytea(teaname);
	}

	public TeacherBean getteacherByid(long id) {
		// TODO Auto-generated method stub
		return teacherDaoimpl.getteacherByid(id);
	}

}

