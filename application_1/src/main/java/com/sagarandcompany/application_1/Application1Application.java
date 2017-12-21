package com.sagarandcompany.application_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Application1Application {

    public static void main(String[] args) {
        SpringApplication.run(Application1Application.class, args);
    }
}
