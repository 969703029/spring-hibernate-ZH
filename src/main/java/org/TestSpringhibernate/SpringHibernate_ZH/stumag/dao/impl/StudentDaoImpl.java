package org.TestSpringhibernate.SpringHibernate_ZH.stumag.dao.impl;

import java.util.List;

import org.TestSpringhibernate.SpringHibernate_ZH.bens.Pages;
import org.TestSpringhibernate.SpringHibernate_ZH.bens.StudentBean;
import org.TestSpringhibernate.SpringHibernate_ZH.stumag.dao.IStudentDao;
import org.TestSpringhibernate.SpringHibernate_ZH.utils.BaseDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:48:50
*/
@Repository
public class StudentDaoImpl extends BaseDao implements IStudentDao {
	
	public void saveStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		getSession().save(student);
	}

	public void deleteStuudentBean2Id(StudentBean student) {
		// TODO Auto-generated method stub
		getSession().delete(student);
	}

	public void updateStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		getSession().update(student);
	}

	public StudentBean getStuudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return (StudentBean) getSession().get(StudentBean.class, id);
	}

	public Pages findUserListByObjectToPager(Pages page, String stuname) {
		// TODO Auto-generated method stub
		String hql = "select count(s.id) from StudentBean as s where s.stuName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, stuname);
		Long total = (Long) query.uniqueResult();
		page.setTotal(total);
		hql = "from StudentBean as s left join fetch s.cb where s.stuName like CONCAT(?,'%')";
		query = getSession().createQuery(hql);
		query.setString(0, stuname);
		query.setFirstResult(page.getPage());
		query.setMaxResults(page.getRows());
		List<?> datas = query.list();
		page.setDatas(datas);
		
//		String sql = "select u.* from t_student as u where u.f_stuname like CONCAT(?,'%')";
//		SQLQuery query = session.createSQLQuery(sql);
//		query.setString(0, "张");//给预编译后的HQL语句设值
//		query.addEntity(StudentBean.class);//将返回的SQL结果集转换到UserBean的对象中
//		List<?> datas = query.list();
//		page.setDatas(datas);
		return page;
	}

	public List<StudentBean> findStuClassbyclassId(Long id) {
		// TODO Auto-generated method stub
		String hql = "from StudentBean as s left join fetch  s.cb as c where c.id=?";
		Query query = getSession().createQuery(hql);
		query.setLong(0, id);
		
		return query.list();
	}

	public List<?> findClassBeanByStuname(String name) {
		// TODO Auto-generated method stub
		String hql = "select new map(s.cb.calssName) from  StudentBean as s where s.stuName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, name);
		return query.list();
	}
}

