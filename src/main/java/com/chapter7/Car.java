package com.chapter7;

import lombok.Data;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/29
 * time:20:44
 */
@Data
@ToString
public class Car {

    private String brand;

    public Car() {
        System.out.println("cars constructor...");
    }

    public void setBrand(String brand) {
        System.out.println("setBrand .........");
        this.brand = brand;
    }

    public void init() {
        System.out.println("init .......");
    }

    public void destroy() {
        System.out.println("destroy .....");
    }

}
