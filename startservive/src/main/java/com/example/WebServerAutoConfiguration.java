package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServerAutoConfiguration {

    @Bean
    //@Conditional判断tomcat是否可以启动
    @Conditional(TomcatConditional.class)
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }

    @Bean
    @Conditional(JettyConditional.class)
    public JettyWebServer jettyWebServer(){
        return new JettyWebServer();
    }
}
