package com.chapter4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:18:29
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter4/spring.xml");
        Car car = ac.getBean(Car.class);
        Car car1 = ac.getBean(Car.class);
        Taxi taxi = ac.getBean(Taxi.class);
        Taxi taxi1 = ac.getBean(Taxi.class);
        System.out.println(car==car1);
        System.out.println(taxi==taxi1);
    }
}
