package com.chapter5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:19:47
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter5/spring.xml");
        Person person = ac.getBean(Person.class);
        System.out.println(person);
    }
}
