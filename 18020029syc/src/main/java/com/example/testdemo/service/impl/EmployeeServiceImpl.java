package com.example.testdemo.service.impl;

import com.example.testdemo.dao.EmployeeDAO;
import com.example.testdemo.entity.Employee;
import com.example.testdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee find(Integer id) {
        return employeeDAO.findById(id).orElse(null);
    }

    @Override
    public void insert(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.findAll();
    }
}
