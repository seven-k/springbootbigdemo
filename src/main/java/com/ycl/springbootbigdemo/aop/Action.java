package com.ycl.springbootbigdemo.aop;

import java.lang.annotation.*;

/**
 * @author yin.cl
 * @since 2019/3/18 22:43
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
