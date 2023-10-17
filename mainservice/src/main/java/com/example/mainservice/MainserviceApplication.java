package com.example.mainservice;

import com.example.LySpringbootApplication;
import com.example.LySpringbootApplicationStart;
import com.example.TomcatWebServer;
import com.example.WebServerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 参照哔哔哩哩周瑜老师写的手写springboot启动流程
 */
@LySpringbootApplication
public class MainserviceApplication {

    public static void main(String[] args) {
        LySpringbootApplicationStart.run(MainserviceApplication.class);
    }

}
