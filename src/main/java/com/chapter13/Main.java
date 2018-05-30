package com.chapter13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/30
 * time:17:46
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter13/spring.xml");
        Animal animal = ac.getBean(Animal.class);
        animal.jump();
    }
}
