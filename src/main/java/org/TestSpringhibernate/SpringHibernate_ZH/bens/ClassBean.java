package org.TestSpringhibernate.SpringHibernate_ZH.bens;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

/**
* @author CC
* @version 创建时间：2017年8月14日 下午1:09:49
*/
@Entity
@Table(name="t_class")
public class ClassBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3607070694134059132L;

	@Id
	@Column(name="pk_id")
	@GenericGenerator(name="hibrnate.identity",strategy="identity")
	@GeneratedValue(generator="hibrnate.identity")
	private long id;
	
	@Column(name="f_classname")
	private String calssName;
	
	@Column(name="f_time")
	private String time;
	
	@Version
	private Long version;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cb")
	private Set<StudentBean> stu;
	public ClassBean() {
	}
	
	public ClassBean(String calssName) {
		this.calssName = calssName;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getCalssName() {
		return calssName;
	}
	public void setCalssName(String calssName) {
		this.calssName = calssName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Set<StudentBean> getStu() {
		return stu;
	}
	public void setStu(Set<StudentBean> stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "ClassBean [id=" + id + ", calssName=" + calssName + ", time=" + time + "]";
	}

}

