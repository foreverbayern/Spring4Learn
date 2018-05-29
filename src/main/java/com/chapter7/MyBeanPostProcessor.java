package com.chapter7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author:lucky date:2018/5/29
 * time:21:08
 */

/**
 * 这个接口是对于bean的init方法前后进行处理
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBefore,"+o+","+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfter,"+o+","+s);
        return o;
    }
}
