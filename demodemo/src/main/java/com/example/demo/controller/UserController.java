package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Adward_Z
 * @date 2020/7/3
 */

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

 //   @Autowired
  //  private ITestService testService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

  /* @GetMapping("/user/insert")
    public String insert(@ModelAttribute("user") User user){
        userService.save(user);
        User user1 = new User();
        user1.setid("ALEX" + user.getid());
        user1.setNo("ALEX" + user.getNo());
        user1.setName(user.getName());
        user1.setdescription(user.getdescription());
        user1.setPrice("ALEX" + user.getPrice());
        user1.setNumber("ALEX" + user.getNumber());
        IUserService.save();
        return "redirect:/user/getAllUser/";
    }*/
         @GetMapping("/user/insert")
    public String insert(@ModelAttribute("user")User user){
        userService.save(user);
        return "redirect:/user/getAllUser/";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "user";
    }

    @GetMapping("/user/getAllUser")
    public String getAllStudent(Model model){
        List<User> list = userService.getAllUser();
        model.addAttribute("users",list);
        return "userList";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
        return "redirect:/user/getAllUser/";
    }

    @GetMapping("/user/update/{id}")
    public String updateUser(@PathVariable Integer id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/user/delete")
    public String deleteUserByParm(@RequestParam("id") Integer id){
        userService.deleteUserById(id);
        return "redirect:/user/getAllUser/";
    }

}
