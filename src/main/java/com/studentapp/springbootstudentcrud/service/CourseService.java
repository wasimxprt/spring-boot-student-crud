package com.studentapp.springbootstudentcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.springbootstudentcrud.entity.Course;
import com.studentapp.springbootstudentcrud.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	public Course addCourse(Course course) {
		return repository.save(course);
	}

	public List<Course> getAllCourses() {
		return repository.findAll();
	}

	public Course getCourseById(Long courseId) {
		return repository.findById(courseId).orElse(null);
	}

	public Course updateCourse(Course course) {
		Course existingCourse = repository.findById(course.getCourseId()).orElse(null);
		existingCourse.setCourseName(course.getCourseName());
		return existingCourse;
	}

	public String deleteCourse(Long id) {
		repository.deleteById(id);
		return "Course deleted successfully";
	}
}
