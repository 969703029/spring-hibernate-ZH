package org.TestSpringhibernate.SpringHibernate_ZH.teamag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.TeacherBean;
import org.TestSpringhibernate.SpringHibernate_ZH.teamag.dao.ITeacherDao;
import org.TestSpringhibernate.SpringHibernate_ZH.utils.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
* @author CC
* @version 创建时间：2017年8月15日 下午1:33:52
*/
@Repository
public class TeacherDaoImpl extends BaseDao implements ITeacherDao {

	public void saveteacher(TeacherBean tb) {
		// TODO Auto-generated method stub
		getSession().save(tb);
	}

	public void updateteacher(TeacherBean tb) {
		// TODO Auto-generated method stub
		getSession().update(tb);
	}

	public List<?> findstudentBytea(String teaname) {
		// TODO Auto-generated method stub
		String hql="from  TeacherBean as t left join fetch t.stus as s where s.stuName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, teaname);
		return query.list();
	}

	public TeacherBean getteacherByid(long id) {
		// TODO Auto-generated method stub
		return (TeacherBean) getSession().get(TeacherBean.class, id);
	}

}

