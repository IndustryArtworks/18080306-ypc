package com.example.demo.service.impl;

import com.example.demo.dao.GoodsDAO;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDAO goodsDAO;

    public String insert(Goods goods) {
        goodsDAO.save(goods);
        return null;
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsDAO.findAll();
    }
}
