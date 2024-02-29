package com.example.StudentManagementAPI.Service.Impl;

import com.example.StudentManagementAPI.Controller.Request.DepartmentRequest;
import com.example.StudentManagementAPI.Controller.Response.DepartmentResponse;
import com.example.StudentManagementAPI.Model.Department;
import com.example.StudentManagementAPI.Repository.DepartmentRepo;
import com.example.StudentManagementAPI.Service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Override
    public Department addDepartment(DepartmentRequest request) {
        return null;
    }

    @Override
    public DepartmentResponse viewDepartment(Long did) {
        return null;
    }

    @Override
    public List<DepartmentResponse> allDepartment() {
        return null;
    }

    @Override
    public void deleteDepartment(Long did) {

    }

    @Override
    public DepartmentRequest updateDepartment(DepartmentRequest request, Long did) {
        return null;
    }
}
