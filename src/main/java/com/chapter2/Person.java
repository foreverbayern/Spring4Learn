package com.chapter2;

/**
 * @author:lucky date:2018/5/28
 * time:23:38
 */

import lombok.Setter;
import lombok.ToString;

import java.security.PublicKey;

/**
 * 注入方式
 * 1.属性注入，通过setter
 * 2.构造器注入
 * 3.工厂注入(通常不用)
 */
@ToString
public class Person {
    @Setter
    private String name;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
}
