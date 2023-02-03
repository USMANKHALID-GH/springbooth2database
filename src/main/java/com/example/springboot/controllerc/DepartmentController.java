package com.example.springboot.controllerc;

import com.example.springboot.entity.Department;
import com.example.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }
    @GetMapping("/getall")
    public List<Department> getAll(){
        return  departmentService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public  String deleteDepart(@PathVariable("id")  Long id){
        return  departmentService.deleteDepart(id);

    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id")  Long id){
        return  departmentService.findById(id);

    }


}
