package com.example.testdemo.controller;

import com.example.testdemo.entity.Employee;
import com.example.testdemo.entity.Sell;
import com.example.testdemo.service.EmployeeService;
import com.example.testdemo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SellController {

    @Autowired
    private SellService sellService ;

    @GetMapping("/sellindex")
    public String index(Model model){
        model.addAttribute("sell",new Sell());
        return "sellindex";
    }

    @PostMapping("/sell/insert")
    public String insert(@ModelAttribute("sell") Sell sell){
        sellService.insert(sell);
        return"redirect:/sell/getAll";
    }

    @GetMapping("/sell/getAll")
    public String getAll(Model model){
        model.addAttribute("sellList",sellService.getAllSell());
        return "selllist";
    }
}
