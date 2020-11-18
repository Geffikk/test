package com.frontbackend.thymeleaf.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("test1");
        System.out.println("test2");
        SpringApplication.run(Application.class, args);
    }
}
