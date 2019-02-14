package com.example.todopractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class TodopracticeApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(TodopracticeApplication.class);

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(TodopracticeApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TodopracticeApplication.class, args);
    }

}

