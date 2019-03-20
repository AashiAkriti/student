package com.cognizant.educationportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.educationportal.model.Course;
import com.cognizant.educationportal.model.Stream;
import com.cognizant.educationportal.service.CourseService;
import com.cognizant.educationportal.service.StreamService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService courseService1;
	StreamService streamService;
	/*
	@GetMapping("/listCourse")
	public String listCourse(Model theModel)
	{
	
		System.out.println("in line");
		List<Course> theCourses=courseService.getCourses();
		theModel.addAttribute("courses", theCourses);
		return "list-courses";
		
	}
	*/
	@GetMapping("/showCourse")
	public String showCourse(Model theModel1) {
		
		Course theCourse=new Course();
		theModel1.addAttribute("course_reg", theCourse);
		return "course-info";
	}
	
	@GetMapping("/addCourse")
	public String showAddCourse(Model theModel1) {
		
		Course theCourse=new Course();
		theModel1.addAttribute("course_add", theCourse);
		return "add-course";
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(@ModelAttribute("course_reg") Course theCourse)
	{
		courseService1.saveCourse(theCourse);
		return "redirect:/course/addCourse";
	}
	

	@PostMapping("/add_Course")
	public String addCourse(@ModelAttribute("course_add") Course theCourse)
	{
		courseService1.saveCourse(theCourse);
		return "redirect:/course/showCourse";
	}
	@GetMapping("/showStream")
	public String showStream(Model theModel1) {
		
		Stream theStream=new Stream();
		theModel1.addAttribute("stream_reg", theStream);
		return "stream-info";
	}
	@PostMapping("/saveStream")
	public String saveStream(@ModelAttribute("stream_reg") Stream theStream)
	{
		streamService.saveStream(theStream);
		return "redirect:/course/showStream";
	}
}
