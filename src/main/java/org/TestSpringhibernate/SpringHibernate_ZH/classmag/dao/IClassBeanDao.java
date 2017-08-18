package org.TestSpringhibernate.SpringHibernate_ZH.classmag.dao;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.ClassBean;

/**
* @author CC
* @version 创建时间：2017年8月14日 下午8:09:51
*/
public interface IClassBeanDao {

	public void saveClassBean(ClassBean cb);
	
	public ClassBean getClassBeanandStus(long id);
	
	public void deleteClassBeanById(long id);
	
	public void updateClassBean(ClassBean cb);
}

