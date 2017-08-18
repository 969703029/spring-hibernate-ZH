package org.TestSpringhibernate.SpringHibernate_ZH.classmag.dao.impl;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.ClassBean;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.dao.IClassBeanDao;
import org.TestSpringhibernate.SpringHibernate_ZH.utils.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
* @author CC
* @version 创建时间：2017年8月14日 下午8:17:50
*/
@Repository
public class ClassBeanDaoImpl extends BaseDao implements IClassBeanDao {

	public void saveClassBean(ClassBean cb) {
		// TODO Auto-generated method stub
		getSession().save(cb);
	}

	public ClassBean getClassBeanandStus(long id) {
		// TODO Auto-generated method stub
		return (ClassBean) getSession().get(ClassBean.class, id);
	}

	public void deleteClassBeanById(long id) {
		// TODO Auto-generated method stub
		getSession().delete(id);
	}

	public void updateClassBean(ClassBean cb) {
		// TODO Auto-generated method stub
		getSession().update(cb);
	}
}

