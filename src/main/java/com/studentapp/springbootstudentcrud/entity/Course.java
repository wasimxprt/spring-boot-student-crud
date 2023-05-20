package com.studentapp.springbootstudentcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_course")
public class Course {

	@Id
	@GeneratedValue
	private Long courseId;
	private String courseName;
	private Double price;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long courseId, String courseName, Double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
	
}
