package com.example.demo.dao;

import com.example.demo.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDAO extends JpaRepository<Goods, Integer> {
}
