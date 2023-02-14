package com.example.gradesubmissionapi.repository;

import com.example.gradesubmissionapi.entity.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {

}
