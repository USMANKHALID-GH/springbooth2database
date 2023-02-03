package com.example.springboot.service;

import com.example.springboot.entity.Department;
import com.example.springboot.error.DepartmentException;
import com.example.springboot.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
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

    public  Department findById(Long id) throws DepartmentException {
        Optional<Department> department=departmentRepo.findById(id);
        if(!department.isPresent()){
            throw new DepartmentException("Department id not found");
        }

        return  department.get();
    }

    public Department update(Long id, Department department) {
        Department dp=departmentRepo.findById(id).get();
        if(Objects.nonNull(department.getDepartmentName())
                && !"".equalsIgnoreCase(department.getDepartmentName())){
              dp.setDepartmentName(department.getDepartmentName());
            System.out.println(department.getDepartmentName());
            System.out.println(dp.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())
                && !"".equalsIgnoreCase(department.getDepartmentCode())){
            dp.setDepartmentCode(department.getDepartmentCode());
            System.out.println(department.getDepartmentCode());
            System.out.println(dp.getDepartmentCode());
        }
        departmentRepo.save(dp);
        return dp;
    }
}
