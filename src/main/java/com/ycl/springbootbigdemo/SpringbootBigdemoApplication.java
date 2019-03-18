package com.ycl.springbootbigdemo;

import com.ycl.springbootbigdemo.aop.AopConfig;
import com.ycl.springbootbigdemo.aop.DemoAnnotationService;
import com.ycl.springbootbigdemo.aop.DemoMethodService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbootBigdemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootBigdemoApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }

}
