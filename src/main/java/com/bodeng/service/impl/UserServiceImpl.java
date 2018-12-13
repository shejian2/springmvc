package com.bodeng.service.impl;

import com.bodeng.dao.UserDao;
import com.bodeng.model.UserModel;
import com.bodeng.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserModel> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public UserModel getUser(String id) {
        return userDao.getUser(id);
    }

    @Override
    public int addUser(UserModel userModel) {
        return userDao.addUser(userModel);
    }

    @Override
    public boolean updateUser(String id, String username) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }
}
