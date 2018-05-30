package com.chapter12;

/**
 * @author:lucky date:2018/5/30
 * time:16:34
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个切面，需要把这个类放到ioc容器中，再声明为一个切面
 */
@Aspect
@Component
public class LogginAspect {

    /**
     * 声明该方法是一个前置通知，在目标方法开始之前执行
     */
    @Before("execution(public void com.chapter12.Animal.jump())")
    public void beforeMethod(JoinPoint point) {
        String name = point.getSignature().getName();
        System.out.println("the before method begins  :"+name);
    }
    //在后置通知中，无法访问返回的结果
    @After("execution(public void com.chapter12.Animal.jump())")
    public void afterMethod() {
        System.out.println("the after method begins");
    }

    //还有 afterreturning 、afterthrowing、around这三种通知，不详细写
}
