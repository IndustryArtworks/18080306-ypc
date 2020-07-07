package com.example.testdemo.dao;

import com.example.testdemo.entity.Employee;
import com.example.testdemo.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDAO extends JpaRepository<Goods,Integer> {
}
