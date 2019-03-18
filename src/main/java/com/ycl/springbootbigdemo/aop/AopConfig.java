package com.ycl.springbootbigdemo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yin.cl
 * @since 2019/3/18 22:57
 */
@Configuration
@ComponentScan("com.ycl.springbootbigdemo.aop")
@EnableAspectJAutoProxy //开启spring 对AspectJ的支持
public class AopConfig {
}
