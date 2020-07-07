package com.example.testdemo.service.impl;

import com.example.testdemo.dao.EmployeeDAO;
import com.example.testdemo.dao.SellDAO;
import com.example.testdemo.entity.Sell;
import com.example.testdemo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellServiceimpl implements SellService {
    @Autowired
    private SellDAO sellDAO;

    @Override
    public void insert(Sell sell) {
        sellDAO.save(sell);
    }

    @Override
    public List<Sell> getAllSell() {
        return sellDAO.findAll();
    }
}
