package com.spring.cloud.ribbon.springcloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){

        return restTemplate.getForEntity("http://SPRING-CLOUD-CLIENT/add?a=10&b=20",String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }
}
