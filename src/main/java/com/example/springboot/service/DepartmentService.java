package com.example.springboot.service;

import com.example.springboot.entity.Department;
import com.example.springboot.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        return  departmentRepo.save(department);
    }
}
