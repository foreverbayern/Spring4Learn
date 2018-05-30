package com.chapter11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/30
 * time:11:31
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter11/spring.xml");
        UserService service = ac.getBean(UserService.class);
        service.add();
    }
}
