package com.mjie.xml.beans.name.service;

import com.mjie.xml.beans.name.dao.UserDao;

public class UserServiceImpl {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHello(String name) {
        userDao.helloUser(name);
    }
}
