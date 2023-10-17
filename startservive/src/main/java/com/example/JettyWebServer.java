package com.example;

import org.springframework.web.context.WebApplicationContext;

public class JettyWebServer implements WebServer{
    public void start(WebApplicationContext  webApplicationContext) {
        System.out.println("启动jetty服务器");
    }
}
