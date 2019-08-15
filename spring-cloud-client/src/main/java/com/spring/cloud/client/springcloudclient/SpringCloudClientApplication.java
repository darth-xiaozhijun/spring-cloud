package com.spring.cloud.client.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudClientApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(SpringCloudClientApplication.class).web(true).run(args);
    }

}
