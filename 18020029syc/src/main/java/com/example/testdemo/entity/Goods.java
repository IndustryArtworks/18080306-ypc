package com.example.testdemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Goods {
    @Id
    @GeneratedValue
    private  int id;
    @Column
    private String no;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private int num;
}
