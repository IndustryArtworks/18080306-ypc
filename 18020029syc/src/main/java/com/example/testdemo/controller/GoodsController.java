package com.example.testdemo.controller;

import com.example.testdemo.service.GoodsService;
import com.example.testdemo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/getAll")
    public String getAll(Model model){
        model.addAttribute("goodsList",goodsService.getAllSell());
        return "goodslist";
    }
}
