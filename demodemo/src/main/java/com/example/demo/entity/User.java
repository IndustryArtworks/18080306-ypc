package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Adward_Z
 * @date 2020/7/3
 */
@Entity
@Data
public class User {


    @Id
    @GeneratedValue
    private Integer id;
    private Integer no;
    private Double price;
    private Integer number;
    private String name;
    private String description;
}
