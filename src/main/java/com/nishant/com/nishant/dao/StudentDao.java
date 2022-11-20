package com.nishant.com.nishant.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.nishant.com.nishant.entiies.Student;

public class StudentDao {
	private HibernateTemplate hinHibernateTemplate;
	// Function for save the Data
	public int insertStudent(Student student) {
		Integer i = (Integer) this.hinHibernateTemplate.save(student);
		return i;

	}
}
