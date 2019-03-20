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

import com.cognizant.educationportal.model.Course;

@Repository("courseDAO")
public class CourseDAOImpl implements CourseDAO {

	@Autowired
	SessionFactory sessionFactory1;
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		Session session1= sessionFactory1.getCurrentSession();
		CriteriaBuilder cd1=session1.getCriteriaBuilder();
		CriteriaQuery<Course> cq1=cd1.createQuery(Course.class);
		Root<Course> root1=cq1.from(Course.class);
		cq1.select(root1);
		Query query1=session1.createQuery(cq1);
		
		return query1.getResultList();
	}

	public void saveCourse(Course theCourse) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory1.getCurrentSession();
		currentSession.saveOrUpdate(theCourse);
	}

	public Course getcourse(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory1.getCurrentSession();
		Course theCourse=currentSession.get(Course.class, theId);
		return theCourse;
	}

}
