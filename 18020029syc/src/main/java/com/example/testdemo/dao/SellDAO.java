package com.example.testdemo.dao;

import com.example.testdemo.entity.Employee;
import com.example.testdemo.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellDAO extends JpaRepository<Sell,Integer> {
}
