/*
 * Copyright (C) 2018 Weibo, Inc. All Rights Reserved.
 */
package com.neo.condition;

import com.neo.controller.HelloWorldController;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

//    @ConditionalOnBean(value = HelloWorldController.class)
//    @Bean
//    MyInterface myInterface() {
//        return new MyInterfaceImpl();
//    }

    //@ConditionalOnClass(name = "org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration")
//    @ConditionalOnClass(name = "com.neo.controller.HelloWorldController")
//    @Bean
//    MyInterface myInterface() {
//        return new MyInterfaceImpl();
//    }

//    @ConditionalOnProperty(prefix = "a", name = "b", havingValue = "true")
//    @Bean
//    MyInterface myInterface() {
//        return new MyInterfaceImpl();
//    }

//    @ConditionalOnResource(resources = { "xxx.properties" })
//    @Bean
//    MyInterface myInterface() {
//        return new MyInterfaceImpl();
//    }

    @ConditionalOnExpression("'${mq.comsumer}'.equals('kafka')")
    @Bean
    MyInterface myInterface() {
        return new MyInterfaceImpl();
    }
}