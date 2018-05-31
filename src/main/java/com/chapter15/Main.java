package com.chapter15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author:lucky date:2018/5/31
 * time:17:51
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter15/spring.xml");
        JdbcTemplate template = ac.getBean(JdbcTemplate.class);
        System.out.println(template.getClass());
    }
}
