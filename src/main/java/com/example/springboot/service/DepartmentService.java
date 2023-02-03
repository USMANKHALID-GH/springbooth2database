package com.example.springboot.service;

import com.example.springboot.entity.Department;
import com.example.springboot.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        return  departmentRepo.save(department);
    }

    public List<Department> getAll() {
        return  departmentRepo.findAll();
    }

    public String deleteDepart(Long id) {
        departmentRepo.deleteById(id);
        return "deleted";

    }

    public  Department findById(Long id){
        return  departmentRepo.findById(id).get();
    }
}
