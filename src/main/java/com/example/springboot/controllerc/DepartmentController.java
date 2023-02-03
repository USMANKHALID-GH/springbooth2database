package com.example.springboot.controllerc;

import com.example.springboot.entity.Department;
import com.example.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save/")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }
}
