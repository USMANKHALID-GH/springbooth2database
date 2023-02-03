package com.example.springboot.repository;

import com.example.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo  extends JpaRepository<Department,Long> {
}
