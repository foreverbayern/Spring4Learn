package com.chapter10;

import org.springframework.stereotype.Component;

/**
 * @author:lucky date:2018/5/30
 * time:10:43
 */

/**
 * 一般是Component/Repository/Service/Controller
 *
 * 对于属性的注入，一般是Autowired、Resource、Inject,主要是通过AutoWiredAnnontationBeanPostProcessor实例来自动装配的
 * Autowired(requuired=false)这样没装配上不会报错，只是null
 *
 * @Autowired
 * @Qualifier("userFirstImpl") 这两个注释表示当多个User类型的被管理，则注入userFirstImpl这个bean，就不会导致混乱
 *
 */
@Component
public class CarImpl implements Car{
    @Override
    public void sayName() {
        System.out.println("宝马来也");
    }
}
