package com.example.StudentManagementAPI.Service;

import com.example.StudentManagementAPI.Controller.Request.DepartmentRequest;
import com.example.StudentManagementAPI.Controller.Request.StudentRequest;
import com.example.StudentManagementAPI.Controller.Response.DepartmentResponse;
import com.example.StudentManagementAPI.Model.Department;
import com.example.StudentManagementAPI.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    Department addDepartment(DepartmentRequest request);

    DepartmentResponse viewDepartment(Long did);

    List<DepartmentResponse> allDepartment();

    void deleteDepartment(Long did);

    DepartmentRequest updateDepartment(DepartmentRequest request, Long did);

}
