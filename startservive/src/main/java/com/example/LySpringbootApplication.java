package com.example;


import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

//用@Target指定ElementType属性，标注注解作用位置
@Target({ElementType.TYPE})
//Retention表示元注解，RetentionPolicy有CLASS、RUNTIME、SOURCE
//4.RetentionPolicy.SOURCE：被修饰的注解只会保留在源文件，当.java文件编译成.class文件时，被修饰的注解会被遗弃
//5.RetentionPolicy.CLASS：被修饰的注解被保留到.class文件，jvm加载.class文件时候被遗弃，是默认的生命周期
//6.RetentionPolicy.RUNTIME：被修饰的注解不仅被保存到.class文件中，jvm加载class文件之后还会存在
//7.java源文件(.java文件) 、编译后的文件（.class文件) 、内存中的字节码，生命周期比较 SOURCE < CLASS < RUNTIME ，作用范围越来越大
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Import({WebServerAutoConfiguration.class})
public @interface LySpringbootApplication {
}
