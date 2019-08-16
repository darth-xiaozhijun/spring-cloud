package com.spring.cloud.feign.springcloudfeign.service;

import com.spring.cloud.feign.springcloudfeign.service.impl.FeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-client",fallback = FeignHystrix.class)
public interface SpringCloudClient {

    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
