package com.mjie.client;

import com.mjie.beans.MyTestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopClient1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
        myTestBean.test();
    }
}
