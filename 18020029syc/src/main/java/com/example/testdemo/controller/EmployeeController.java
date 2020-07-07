package com.example.testdemo.controller;

import com.example.testdemo.entity.Employee;
import com.example.testdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String insert(@ModelAttribute("employee") Employee employee){
        employeeService.insert(employee);
        return"redirect:/employee/getAll";
    }

    @GetMapping("/employee/getAll")
    public String getAll(Model model){
        model.addAttribute("employeeList",employeeService.getAllEmployee());
        return "employeelist";
    }

    @GetMapping("/employee/find")
    public String find(@ModelAttribute("employee") Employee employee){
        Employee e = employeeService.find(employee.getId());
        if(e.getNo().equalsIgnoreCase(employee.getNo()) && e.getPassword().equalsIgnoreCase(employee.getPassword())){
            //return "redirect:/sell/getAll";
            if(e.getPosition().equalsIgnoreCase("salesperson"))return "redirect:/sell/getAll";
            if(e.getPosition().equalsIgnoreCase("manager"))return "redirect:/goods/getAll";
        }
        return "redirect:/index";
    }


}
