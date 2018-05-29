package com.chapter8;

/**
 * @author:lucky date:2018/5/29
 * time:21:36
 */
public class CarstaticFactory {
    public static Car getInstance(String name) {
        return new Car(name);
    }
}
