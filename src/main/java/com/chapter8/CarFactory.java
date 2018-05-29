package com.chapter8;

/**
 * @author:lucky date:2018/5/29
 * time:21:47
 */
public class CarFactory {
    public Car getInstance(String name) {
        return new Car(name);
    }
}
