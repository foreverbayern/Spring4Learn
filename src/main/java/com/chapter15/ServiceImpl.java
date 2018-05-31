package com.chapter15;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:lucky date:2018/5/31
 * time:11:36
 */
@Service
public class ServiceImpl {
    /**
     * propagation是设定事务传播
     * isolation是设置隔离级别
     * 默认情况下spring的声明式事务对所有的运行时异常进行回滚，也可以通过对应的属性进行设置。
     * noRollbackFor，对于RuntimeException的异常不会进行回滚.
     * readOnly指定事务是否为只读.
     * timeout，指定强制回滚之前，事务可以占用的时间
     */
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,
    noRollbackFor = RuntimeException.class,readOnly = false,timeout = 1)
    public void add() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter15/spring.xml");
        JdbcTemplate template = ac.getBean(JdbcTemplate.class);
        String sql = "insert into tb_user(username,password,email,created,updated) values(?,?,?,?,?)";
        template.update(sql,"test6","123","test6@qq.com",new DateTime().toString("yyyy-MM-dd HH:mm:ss"),new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
    }

}
