package org.TestSpringhibernate.SpringHibernate_ZH.teamag.service;

import java.util.List;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.TeacherBean;


/**
* @author CC
* @version 创建时间：2017年8月15日 下午1:28:02
*/
public interface ITeacherBeanService {

	public void saveteacher(TeacherBean tb);
	
	public void updateteacher(TeacherBean tb);
	
	public TeacherBean getteacherByid(long id);
	
	public List<?> findstudentBytea(String teaname);
}

