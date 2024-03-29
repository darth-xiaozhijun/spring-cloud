package com.spring.cloud.ribbon.springcloudribbon.controller;

import com.spring.cloud.ribbon.springcloudribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    /*@Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return restTemplate.getForEntity("http://SPRING-CLOUD-CLIENT/add?a=10&b=20",String.class).getBody();
    }*/

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return ribbonService.addService();
    }
}
