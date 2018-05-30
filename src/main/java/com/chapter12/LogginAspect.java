package com.chapter12;

/**
 * @author:lucky date:2018/5/30
 * time:16:34
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个切面，需要把这个类放到ioc容器中，再声明为一个切面
 * 使用order，指定切面的优先级，值越小，优先级越高
 */
@Order(1)
@Aspect
@Component
public class LogginAspect {

    /**
     * 定义一个方法，用于声明切入点表达式，一般的，该方法中不再填入其他的代码
     * 切点表达式的重用
     * 使用PointCut来声明切入点表达式
     * 后面的其他通知直接使用方法名来引用当前的切入点表达式
     */
    @Pointcut("execution(public void com.chapter12.Animal.*(..))")
    public void declareJointPointExpression() {

    }



    /**
     * 声明该方法是一个前置通知，在目标方法开始之前执行
     */
    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint point) {
        String name = point.getSignature().getName();
        System.out.println("the before method begins  :"+name);
    }
    //在后置通知中，无法访问返回的结果
    @After("declareJointPointExpression()")
    public void afterMethod() {
        System.out.println("the after method begins");
    }

    //还有 afterreturning 、afterthrowing、around这三种通知，不详细写
}
