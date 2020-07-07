package com.example.testdemo.service;

import com.example.testdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
void insert (Employee employee);
List<Employee> getAllEmployee();
Employee find(Integer id);
}
