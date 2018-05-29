package com.chapter9;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author:lucky date:2018/5/29
 * time:22:30
 */
@Data
public class CarFactoryBean implements FactoryBean<Car> {
    private String name;



    //返回bean的对象
    @Override
    public Car getObject() throws Exception {
        return new Car(name);
    }
    //返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
    //是否是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
