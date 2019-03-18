package com.ycl.springbootbigdemo.aop;

import org.springframework.stereotype.Service;

/**
 * @author yin.cl
 * @since 2019/3/18 22:45
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
    }
}
