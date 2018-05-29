package com.chapter8;

import lombok.Data;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/29
 * time:21:34
 */
@Data
@ToString
public class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }
}
