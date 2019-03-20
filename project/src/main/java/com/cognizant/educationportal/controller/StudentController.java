package com.cognizant.educationportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.educationportal.model.Student;
import com.cognizant.educationportal.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	/*
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
	
		System.out.println("in line");
		List<Student> theStudents=studentService.getStudents();
		theModel.addAttribute("students", theStudents);
		return "list-students";
		
	}
	*/
	@GetMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student theStudent=new Student();
		theModel.addAttribute("student_reg", theStudent);
		return "student-info";
	}
	
	@GetMapping("/addStudent")
	public String showFormForAdd(Model theModel) {
		
		Student theStudent=new Student();
		theModel.addAttribute("student_add", theStudent);
		return "add-student";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student_reg") Student theStudent)
	{
		studentService.saveStudent(theStudent);
		return "redirect:/student/addStudent";
	}
	

	@PostMapping("/add_Student")
	public String saveOrAddStudent(@ModelAttribute("student_add") Student theStudent)
	{
		studentService.saveStudent(theStudent);
		return "redirect:/student/showForm";
	}
	
	
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("studentId") int theId , Model theModel)
	{
		Student theStudent=studentService.getStudent(theId);
		theModel.addAttribute("student", theStudent);
		return "student-info";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int theId)
	{
		studentService.deleteStudent(theId);
		return "redirect:/student/showForm";
	}
	
	
}
