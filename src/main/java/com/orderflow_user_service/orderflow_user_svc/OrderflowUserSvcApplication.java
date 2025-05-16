package com.orderflow_user_service.orderflow_user_svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderflowUserSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderflowUserSvcApplication.class, args);
    }
}
