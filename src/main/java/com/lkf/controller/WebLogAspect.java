package com.lkf.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by likaifeng on 2017/8/17.
 */
@Aspect//定义为切面类
@Component//spring标识的bean
@Order(1)//先执行，数字越小执行越早
public class WebLogAspect {

    @Pointcut("execution(* com.lkf.controller.*.*(..))")//切入点
    public void webLog(){

    }

    @Before("webLog()")
    public void beFore(){
        System.out.println("执行之前执行。");
    }
}
