package com.mjie.xml.beans.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassesClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory/factory.xml");
        HomeService homeService = applicationContext.getBean("homeService", HomeService.class);
        homeService.home();
        System.out.println("--------------");

        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
        accountService.sayHello();
        clientService.hello();
    }
}
