package com.studentapp.springbootstudentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.springbootstudentcrud.entity.Course;
import com.studentapp.springbootstudentcrud.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}

	@DeleteMapping("/course")
	public String deleteCourse(@PathVariable Long id) {
		return courseService.deleteCourse(id);
	}
}
