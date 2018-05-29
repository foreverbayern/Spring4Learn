package com.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lucky date:2018/5/28
 * time:21:51
 */
public class Main {
    public static void main(String[] args) {
        //1创建Spring的IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("chapter1/spring.xml");
        //2从IOC容器中获取Bean实例
        HelloWorld bean = (HelloWorld) ac.getBean("helloworld");
        //3.调用hello方法
        bean.hello();
    }
}
