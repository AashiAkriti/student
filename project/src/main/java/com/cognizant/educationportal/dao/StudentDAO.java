package com.cognizant.educationportal.dao;

import java.util.List;

import com.cognizant.educationportal.model.Student;



public interface StudentDAO {

	public List<Student> getStudents(); 
	public void saveStudent(Student theStudent);
	public Student getStudent(int theId);
	public void deleteStudent(int theId);
}
