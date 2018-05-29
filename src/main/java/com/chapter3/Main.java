package com.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:17:15
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter3/spring.xml");
        Parent parent = ac.getBean(Parent.class);
        Child child = ac.getBean(Child.class);
        System.out.println(parent);
        System.out.println(child);

    }
}
