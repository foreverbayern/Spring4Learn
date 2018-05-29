package com.chapter6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:20:32
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter6/spring.xml");
        Car car = ac.getBean(Car.class);
        System.out.println(car);
    }
}
