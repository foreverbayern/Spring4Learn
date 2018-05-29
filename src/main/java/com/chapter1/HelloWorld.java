package com.chapter1;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/28
 * time:21:32
 */

@Data
@ToString
@EqualsAndHashCode
public class HelloWorld {
    private String name;

    public void hello() {
        System.out.println("hello "+name);
    }

    HelloWorld() {
        System.out.println("constructor HelloWorld");
    }

    public void setName(String name) {
        System.out.println("setName  "+name);
        this.name=name;
    }
}
