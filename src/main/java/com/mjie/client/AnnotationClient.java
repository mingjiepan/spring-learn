package com.mjie.client;

import com.mjie.beans.MyTestBean;
import com.mjie.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        MyTestBean acBean = ac.getBean(MyTestBean.class);
        acBean.test();
    }
}
