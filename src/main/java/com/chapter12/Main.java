package com.chapter12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/30
 * time:16:29
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter12/spring.xml");
        Animal cat = ac.getBean(Animal.class);
        System.out.println(cat.getClass());
        cat.jump();
    }
}
