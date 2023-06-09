package com.wipro.course.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.course.access.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	Course findByName(String courseName);

}
