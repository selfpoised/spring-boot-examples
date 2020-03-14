package com.neo.controller;

import com.neo.condition.MyInterface;
import com.neo.my.HelloworldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController implements ApplicationContextAware {
    private ApplicationContext ap;

    @RequestMapping("/starter")
    public String index2() {
        Object o = ap.getBean(HelloworldService.class);
        return "Hello World";
    }

    @RequestMapping("/forConditions")
    public String index1() {
        Object o = ap.getBean(MyInterface.class);
        return "Hello World";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @Override
    public void setApplicationContext(ApplicationContext var1){
        ap = var1;
    }
}