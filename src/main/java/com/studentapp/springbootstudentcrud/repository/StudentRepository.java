package com.studentapp.springbootstudentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.springbootstudentcrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//	Student findByName(String name);

}
