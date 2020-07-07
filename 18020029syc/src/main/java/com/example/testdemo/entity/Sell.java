package com.example.testdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Sell {
    @Id
    @GeneratedValue
    private Integer id;
    private String no;
    private String name;
    private String goodname;
    private String goodnum;
    private Double price;
}
