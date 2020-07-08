package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public String insert(Employee employee) {
        employeeDAO.save(employee);
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.findAll();
    }


}
