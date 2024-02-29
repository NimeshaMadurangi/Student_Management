package com.example.StudentManagementAPI.Service.Impl;

import com.example.StudentManagementAPI.Controller.Request.DepartmentRequest;
import com.example.StudentManagementAPI.Controller.Response.DepartmentResponse;
import com.example.StudentManagementAPI.Model.Department;
import com.example.StudentManagementAPI.Repository.DepartmentRepo;
import com.example.StudentManagementAPI.Service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepo repo;
    @Override
    public Department addDepartment(DepartmentRequest request) {

        Department department = new Department();

        department.setDid(request.getDid());
        department.setDname(request.getDname());

        repo.save(department);

        return null;
    }

    @Override
    public DepartmentResponse viewDepartment(Long did) {

        Optional<Department> departmentOptional = repo.findById (did);

        if (departmentOptional.isPresent()) {

            Department department = departmentOptional.get();

            return new DepartmentResponse(department.getDid(),department.getDname());
        }

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
