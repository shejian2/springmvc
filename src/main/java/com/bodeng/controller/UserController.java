package com.bodeng.controller;

import com.bodeng.model.UserModel;
import com.bodeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List<UserModel> getAllUsers(){
        List<UserModel> userModels=userService.getAllUsers();
        return userModels;
    }

    @RequestMapping(value = "/getUser/{id}")
    @ResponseBody
    public UserModel getUser(@PathVariable("id") int id){
        return userService.getUser(String.valueOf(id));
    }

}
