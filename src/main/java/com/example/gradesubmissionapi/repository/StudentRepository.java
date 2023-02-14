package com.example.gradesubmissionapi.repository;

import com.example.gradesubmissionapi.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
