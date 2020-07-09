package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author Adward_Z
 * @date 2020/7/3
 */
public interface IUserService {

    String save(User user);

    User getUserById(Integer id);

    List<User> getAllUser();

    String deleteUserById(Integer id);

}
