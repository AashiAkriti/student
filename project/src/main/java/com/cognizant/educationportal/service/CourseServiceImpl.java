package com.cognizant.educationportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.educationportal.dao.CourseDAO;

import com.cognizant.educationportal.model.Course;
@Service("CourseService")
public class CourseServiceImpl implements CourseService{


	@Autowired
	CourseDAO cseDAO;
	@Transactional
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return cseDAO.getCourses();
	}
	@Transactional
	public void saveCourse(Course theCourse) {
		// TODO Auto-generated method stub
		cseDAO.saveCourse(theCourse);
	}
	@Transactional
	public Course getcourse(int theId) {
		// TODO Auto-generated method stub
		return cseDAO.getcourse(theId);
	}

}
