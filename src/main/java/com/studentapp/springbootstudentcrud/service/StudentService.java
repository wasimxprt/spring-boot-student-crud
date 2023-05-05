package com.studentapp.springbootstudentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.springbootstudentcrud.entity.Student;
import com.studentapp.springbootstudentcrud.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> saveStudents(List<Student> students) {
		return repository.saveAll(students);
	}

	public List<Student> getStudents() {
		return repository.findAll();
	}

	public Student getStudentById(Long id) {
		return repository.findById(id).orElse(null);
	}

//	public Student getStudentByName(String name) {
//		return repository.findByName(name);
//	}

	public String deleteStudent(Long id) {
		repository.deleteById(id);
		return "Student deleted successfully";
	}

	public Student updateStudent(Student student) {
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		return repository.save(existingStudent);
	}
}
