package com.example;


import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Map;

public class LySpringbootApplicationStart {


    public static void run(Class classz) {
        /**
         * 创建springboot启动上下文对象
         */
        AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
        //把启动类注入到上下文对象中
        applicationContext.register(classz);
        //刷新上下文对象会自动启动
        applicationContext.refresh();

        //启动tomcat容器
        WebServer webServer=getWebServer(applicationContext);
        webServer.start(applicationContext);

       // startTomcat(applicationContext);

    }

    private static WebServer getWebServer(WebApplicationContext webApplicationContext) {

        //key为beanName,value为bean对象
        Map<String,WebServer> webServerMap=webApplicationContext.getBeansOfType(WebServer.class);
        if(webServerMap.isEmpty()){
            throw new NullPointerException();
        }
        if(webServerMap.size()>1){
            throw new IllegalStateException();
        }
        return webServerMap.values().stream().findFirst().get();
    }

    private static void startTomcat(WebApplicationContext applicationContext) {

    }
}
