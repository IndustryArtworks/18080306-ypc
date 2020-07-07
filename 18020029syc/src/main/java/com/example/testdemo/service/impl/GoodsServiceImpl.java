package com.example.testdemo.service.impl;

import com.example.testdemo.dao.EmployeeDAO;
import com.example.testdemo.dao.GoodsDAO;
import com.example.testdemo.entity.Goods;
import com.example.testdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDAO goodsDAO;
    @Override
    public List<Goods> getAllSell() {
        return goodsDAO.findAll();
    }
}
