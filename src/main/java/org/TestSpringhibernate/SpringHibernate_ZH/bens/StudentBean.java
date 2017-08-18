package org.TestSpringhibernate.SpringHibernate_ZH.bens;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:28:12
*/
@Entity
@Table(name="t_student")
public class StudentBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1386395180094545251L;
	
	@Id
	@Column(name="pk_stuId")
	@GenericGenerator(name="hibrnate.identity",strategy="identity")
	@GeneratedValue(generator="hibrnate.identity")
	private Long id;
	
	@Column(name="f_stuname")
	private String stuName;
	
	@Column(name="f_gender")
	private String gender;
	
	@Column(name="f_birthday")
	private String birthday;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pk_class_id")
	private ClassBean cb;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="t_stu_ter",joinColumns=@JoinColumn(name="pk_stu_id")
	,inverseJoinColumns=@JoinColumn(name="pk_ter_id"))
	private Set<TeacherBean> teas;
	
	
	public StudentBean() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public ClassBean getCb() {
		return cb;
	}
	public void setCb(ClassBean cb) {
		this.cb = cb;
	}
	
	
	public Set<TeacherBean> getTeas() {
		return teas;
	}
	public void setTeas(Set<TeacherBean> teas) {
		this.teas = teas;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", stuName=" + stuName + ", gender=" + gender + ", birthday=" + birthday
				+ ", cb=" + cb + "]";
	}
}

