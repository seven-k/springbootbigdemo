package com.ycl.springbootbigdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yin.cl
 * @since 2019/3/18 22:48
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.ycl.springbootbigdemo.aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());
    }

    @Before("execution(* com.ycl.springbootbigdemo.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法规则拦截 "+method.getName());
    }
}
