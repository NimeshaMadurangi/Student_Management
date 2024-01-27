package com.example.StudentManagementAPI.Repository;

import com.example.StudentManagementAPI.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
