package com.example.StudentManagementAPI.Repository;

import com.example.StudentManagementAPI.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
