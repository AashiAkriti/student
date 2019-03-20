package com.cognizant.educationportal.service;

import java.util.List;

import com.cognizant.educationportal.model.Student;



public interface StudentService {

	public List<Student> getStudents(); 
	public void saveStudent(Student theStudent);
	public Student getStudent(int theId);
	public void deleteStudent(int theId);
}
