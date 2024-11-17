package com.example.CT5171_war21_335;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Ct5171War21335Application {

    public static void main(String[] args) {
//        SpringApplication.run(Ct5171War21335Application.class, args);
        SpringApplication app = new SpringApplication(Ct5171War21335Application.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8081"));
        app.run(args);
    }

}
