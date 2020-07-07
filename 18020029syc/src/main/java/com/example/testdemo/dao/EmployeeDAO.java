package com.example.testdemo.dao;

import com.example.testdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {
}
