package com.ys.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启用注册中心的功能
@EnableEurekaServer
public class RegisterCenterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterDemoApplication.class, args);
    }

}
