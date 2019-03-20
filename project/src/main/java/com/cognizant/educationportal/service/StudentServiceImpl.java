package com.cognizant.educationportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.educationportal.dao.StudentDAO;
import com.cognizant.educationportal.model.Student;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studDAO;
	@Transactional
	
	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub
		studDAO.saveStudent(theStudent);
	}

	@Transactional
	public Student getStudent(int theId) {
		// TODO Auto-generated method stub
		return studDAO.getStudent(theId);
	}

	@Transactional
	public void deleteStudent(int theId) {
		// TODO Auto-generated method stub
		studDAO.deleteStudent(theId);
	}

	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studDAO.getStudents();
	}

	
}
