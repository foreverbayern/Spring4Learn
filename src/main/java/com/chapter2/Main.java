package com.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:11:33
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter2/spring.xml");
        Person person1 = (Person) ac.getBean("person1");
        Person person2 = (Person) ac.getBean("person2");
        System.out.println(person1);
        System.out.println(person2);
    }
}
