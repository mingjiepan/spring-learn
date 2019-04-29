package com.mjie.xml.beans.name;

import com.mjie.xml.beans.name.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("name/services.xml", "name/daos.xml");
        UserServiceImpl userService = applicationContext.getBean("userService",UserServiceImpl.class);
        userService.sayHello("zhangsan");
    }
}
