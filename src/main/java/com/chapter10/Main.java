package com.chapter10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/30
 * time:10:45
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter10/spring.xml");
        Car car = ac.getBean(Car.class);
        car.sayName();
    }
}
