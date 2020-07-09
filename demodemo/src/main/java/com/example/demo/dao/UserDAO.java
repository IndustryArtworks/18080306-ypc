package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adward_Z
 * @date 2020/7/3
 */
public interface UserDAO extends JpaRepository<User, Integer> {
}
