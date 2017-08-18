package org.TestSpringhibernate.SpringHibernate_ZH.classmag.service.impl;

import javax.annotation.Resource;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.ClassBean;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.dao.IClassBeanDao;
import org.TestSpringhibernate.SpringHibernate_ZH.classmag.service.IClassBeanService;
import org.springframework.stereotype.Service;

/**
* @author CC
* @version 创建时间：2017年8月14日 下午8:16:52
*/
@Service
public class ClassBeanServiceImpl implements IClassBeanService {

	@Resource
	private IClassBeanDao classBeanDaoImpl;
	
	public void saveClassBean(ClassBean cb) {
		// TODO Auto-generated method stub
		classBeanDaoImpl.saveClassBean(cb);
	}

	public ClassBean getClassBeanandStus(long id) {
		// TODO Auto-generated method stub
		return classBeanDaoImpl.getClassBeanandStus(id);
	}

	public void deleteClassBeanById(long id) {
		// TODO Auto-generated method stub
		classBeanDaoImpl.deleteClassBeanById(id);
	}

	public void updateClassBean(ClassBean cb) {
		// TODO Auto-generated method stub
		classBeanDaoImpl.updateClassBean(cb);
	}

}

