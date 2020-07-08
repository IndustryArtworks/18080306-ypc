package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GoodsController {


    @Autowired
    private GoodsService goodsService;

    @GetMapping("/index1")
    public String index(Model model){
        model.addAttribute("goods",new Goods());
        return "index1";
    }
    @PostMapping("/goods/insert")
    public String insert(@ModelAttribute("goods")Goods goods){
        goodsService.insert(goods);
        return "redirect:/goods/getAllGoods";
    }

    @GetMapping("/goods/getAllGoods")
    public String getAllEmployee(Model model){
        model.addAttribute("goodsList",goodsService.getAllGoods());
        return "goodslist";
    }
}
