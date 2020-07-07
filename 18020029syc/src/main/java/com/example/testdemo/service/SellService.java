package com.example.testdemo.service;

import com.example.testdemo.entity.Employee;
import com.example.testdemo.entity.Sell;

import java.util.List;

public interface SellService {
    void insert (Sell sell);
    List<Sell> getAllSell();
}
