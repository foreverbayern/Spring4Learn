package com.chapter14;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:lucky date:2018/5/30
 * time:20:48
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter14/spring.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");
        //执行语句
        //update(jdbcTemplate);
        //批量更新
        //batchUpdate(jdbcTemplate);
        //从数据库获取一条记录，实际得到对应的对象
        select(jdbcTemplate);
    }

    public static void update(JdbcTemplate jdbcTemplate) {
        String sql = "update tb_user set email=? where id=?";
        jdbcTemplate.update(sql,"87878798@qq.com",7);
    }

    public static void batchUpdate(JdbcTemplate jdbcTemplate) {
        String sql = "insert into tb_user(username,password,email,created,updated) values(?,?,?,?,?)";
        ArrayList<Object[]> list = new ArrayList<>(10);

        list.add(new Object[]{"test3","123","test3@qq.com",new DateTime().toString("yyyy-MM-dd HH:mm:ss"),new DateTime().toString("yyyy-MM-dd HH:mm:ss")});
        list.add(new Object[]{"test4","123","test4@qq.com",new DateTime().toString("yyyy-MM-dd HH:mm:ss"),new DateTime().toString("yyyy-MM-dd HH:mm:ss")});
        list.add(new Object[]{"test5","123","test5@qq.com",new DateTime().toString("yyyy-MM-dd HH:mm:ss"),new DateTime().toString("yyyy-MM-dd HH:mm:ss")});
        jdbcTemplate.batchUpdate(sql, list);
    }

    public static void select(JdbcTemplate jdbcTemplate) {
        String sql = "select username,password,email from tb_user where id = ?";
        //注意不是queryForObject这个方法
        //不支持级联属性，因为这个只是一个小工具，而不是ORM框架
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        User user = jdbcTemplate.queryForObject(sql, rowMapper, 7);
        System.out.println(user);
    }
}
