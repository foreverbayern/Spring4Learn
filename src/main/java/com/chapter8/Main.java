package com.chapter8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:21:45
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter8/spring.xml");
        Car car1 = (Car) ac.getBean("car1");
        Car car2 = (Car) ac.getBean("car2");
        System.out.println(car1);
        System.out.println(car2);
    }
}
