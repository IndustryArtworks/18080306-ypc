package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import java.util.List;


public interface EmployeeService {
    String insert(Employee employee);

    List<Employee> getAllEmployee();
}
