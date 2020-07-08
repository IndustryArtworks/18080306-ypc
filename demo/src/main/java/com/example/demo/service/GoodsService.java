package com.example.demo.service;


import com.example.demo.entity.Employee;
import com.example.demo.entity.Goods;

import java.util.List;

public interface GoodsService {
    String insert(Goods goods);
    List<Goods> getAllGoods();
}
