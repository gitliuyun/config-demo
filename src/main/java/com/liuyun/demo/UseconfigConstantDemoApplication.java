package com.liuyun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class UseconfigConstantDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseconfigConstantDemoApplication.class, args);
    }

}

