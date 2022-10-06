package com.art.service;

import com.art.dao.UserDao;
import com.art.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
