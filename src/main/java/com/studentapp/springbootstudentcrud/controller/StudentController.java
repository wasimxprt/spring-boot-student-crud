package com.studentapp.springbootstudentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.springbootstudentcrud.entity.Student;
import com.studentapp.springbootstudentcrud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String getHome() {
		return "Student api working";
	}

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PostMapping("/students")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		return studentService.saveStudents(students);
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

//	@GetMapping("/students/{name}")
//	public Student getStudentByName(@PathVariable String name) {
//		return studentService.getStudentByName(name);
//	}

	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping("student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return studentService.deleteStudent(id);
	}
}
