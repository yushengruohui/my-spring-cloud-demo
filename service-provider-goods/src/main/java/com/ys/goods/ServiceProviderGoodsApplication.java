package com.ys.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 标记为eureka客户端[允许注册中心发现当前应用，并注册,使当前客户端拥有服务提供者和消费者的功能]
@EnableEurekaClient
public class ServiceProviderGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderGoodsApplication.class, args);
    }

}
