package com.chapter9;

import lombok.Data;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/29
 * time:22:30
 */
@Data
@ToString
public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
}
