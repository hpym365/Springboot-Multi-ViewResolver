package com.senyint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SenyintApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenyintApplication.class, args);
        System.out.println("hahaha");
    }
}
