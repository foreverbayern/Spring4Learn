package com.chapter9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:22:37
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter9/spring.xml");
        Car car = (Car) ac.getBean("car");
        Car car2 = (Car) ac.getBean("car");
        System.out.println(car==car2);
    }
}
