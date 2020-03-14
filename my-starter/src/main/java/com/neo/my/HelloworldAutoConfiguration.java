package com.neo.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass({HelloworldService.class})
@EnableConfigurationProperties(HelloworldProperties.class)
public class HelloworldAutoConfiguration {

    @Autowired
    private HelloworldProperties hellowordProperties;

    @Bean
    @ConditionalOnProperty(prefix = "a", name = "b", havingValue = "true")
    @ConditionalOnMissingBean(HelloworldService.class)
    public HelloworldService helloworldService() {
        HelloworldService helloworldService = new HelloworldService();
        helloworldService.setWords(hellowordProperties.getWords());
        return helloworldService;
    }
}