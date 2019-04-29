package com.mjie.xml.beans.dependency.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependency/constructor.xml");
        ThingOne thingOne = applicationContext.getBean("thingOne", ThingOne.class);
        System.out.println(thingOne.hashCode());
    }
}
