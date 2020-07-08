package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/employee/insert")
    public String insert(@ModelAttribute("employee")Employee employee){
        employeeService.insert(employee);
        return "redirect:/employee/getAllEmployee";
    }

    @GetMapping("/employee/getAllEmployee")
    public String getAllEmployee(Model model){
        model.addAttribute("employeeList",employeeService.getAllEmployee());
        return "employeelist";
    }
}
