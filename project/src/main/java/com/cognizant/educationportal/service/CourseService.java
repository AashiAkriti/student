package com.cognizant.educationportal.service;

import java.util.List;

import com.cognizant.educationportal.model.Course;

public interface CourseService {

	public List<Course> getCourses(); 
	public void saveCourse(Course theCourse);
	public Course getcourse(int theId);
}
