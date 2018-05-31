package com.chapter16;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author:lucky date:2018/5/31
 * time:21:55
 */
public class UserServiceImpl {
    public void add() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter15/spring.xml");
        JdbcTemplate template = ac.getBean(JdbcTemplate.class);
        String sql = "insert into tb_user(username,password,email,created,updated) values(?,?,?,?,?)";
        template.update(sql,"test6","123","test6@qq.com",new DateTime().toString("yyyy-MM-dd HH:mm:ss"),new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
    }
}
