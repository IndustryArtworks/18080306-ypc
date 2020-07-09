package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Adward_Z
 * @date 2020/7/3
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String save(User user){
        if (user == null){
            return "fail";
        }
        userDAO.save(user);
        return "success";
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.findAll();
    }

    @Override
    public String deleteUserById(Integer id) {
        if (getUserById(id) == null){
            return "fail";
        }
        userDAO.deleteById(id);
        return "success";
    }

}
