package com.example;

import org.springframework.web.context.WebApplicationContext;

/**
 * 提供实现webServer启动类接口
 */
public interface WebServer {

    void start(WebApplicationContext webApplicationContext);
}
