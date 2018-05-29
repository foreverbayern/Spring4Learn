package com.chapter7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/29
 * time:20:47
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("chapter7/spring.xml");
        Car car = ac.getBean(Car.class);
        System.out.println(car);
        ac.close();
    }
}
