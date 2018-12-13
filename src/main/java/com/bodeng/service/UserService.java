package com.bodeng.service;

import com.bodeng.model.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> getAllUsers();
    UserModel getUser(String id);
    boolean addUser(UserModel userModel);
    boolean updateUser(String id,String username);
    boolean deleteUser(String id);
}
