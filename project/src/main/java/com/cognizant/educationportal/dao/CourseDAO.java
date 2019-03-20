package com.cognizant.educationportal.dao;

import java.util.List;

import com.cognizant.educationportal.model.Course;



public interface CourseDAO {

	public List<Course> getCourses(); 
	public void saveCourse(Course theCourse);
	public Course getcourse(int theId);
}
