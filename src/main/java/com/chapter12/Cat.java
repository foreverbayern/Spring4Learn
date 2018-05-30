package com.chapter12;

import org.springframework.stereotype.Component;

/**
 * @author:lucky date:2018/5/30
 * time:16:28
 */
@Component
public class Cat implements Animal {
    @Override
    public void jump() {
        System.out.println("cat  jump");
    }
}
