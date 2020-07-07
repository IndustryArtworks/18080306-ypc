package com.example.testdemo.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String no;
    @Column
    private String name;
    @Column
    private String position;
    @Column
    private String password;
}
