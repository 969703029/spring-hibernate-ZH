package org.TestSpringhibernate.SpringHibernate_ZH.bens;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
* @author CC
* @version 创建时间：2017年8月15日 下午1:12:26
*/
@Entity
@Table(name="t_teacher")
public class TeacherBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7869055381767666520L;

	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private long id;
	
	@Column(name="teachername")
	private String terName;
	@ManyToMany(fetch=FetchType.EAGER,mappedBy="teas")
	private Set<StudentBean> stus;

	public TeacherBean() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTerName() {
		return terName;
	}
	public void setTerName(String terName) {
		this.terName = terName;
	}
	public Set<StudentBean> getStus() {
		return stus;
	}
	public void setStus(Set<StudentBean> stus) {
		this.stus = stus;
	}
	@Override
	public String toString() {
		return "TeacherBean [id=" + id + ", terName=" + terName + ", stus=" + stus + "]";
	}

}

