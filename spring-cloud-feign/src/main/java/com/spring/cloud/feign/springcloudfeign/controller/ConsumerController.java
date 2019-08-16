package com.spring.cloud.feign.springcloudfeign.controller;

import com.spring.cloud.feign.springcloudfeign.service.SpringCloudClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    SpringCloudClient springCloudClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return springCloudClient.add(10,20);
    }
}
