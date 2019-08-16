package com.spring.cloud.feign.springcloudfeign.service.impl;

import com.spring.cloud.feign.springcloudfeign.service.SpringCloudClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignHystrix implements SpringCloudClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
