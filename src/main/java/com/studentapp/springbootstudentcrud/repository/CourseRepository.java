package com.studentapp.springbootstudentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapp.springbootstudentcrud.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
