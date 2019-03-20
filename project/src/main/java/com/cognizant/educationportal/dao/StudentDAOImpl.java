package com.cognizant.educationportal.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.educationportal.model.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	SessionFactory sessionFactory;
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		CriteriaBuilder cd=session.getCriteriaBuilder();
		CriteriaQuery<Student> cq=cd.createQuery(Student.class);
		Root<Student> root=cq.from(Student.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		
		return query.getResultList();
	}

	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theStudent);
	}

	public Student getStudent(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Student theStudent=currentSession.get(Student.class, theId);
		return theStudent;
	}

	public void deleteStudent(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Student book=currentSession.byId(Student.class).load(theId);
		currentSession.delete(book);
	}

}
