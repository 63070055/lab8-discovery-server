package com.example.lab8discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Lab8DiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab8DiscoveryServerApplication.class, args);
    }

}
