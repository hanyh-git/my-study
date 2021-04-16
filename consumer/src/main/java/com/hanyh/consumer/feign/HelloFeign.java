package com.hanyh.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product")
public interface HelloFeign {
    @RequestMapping( "/product")
    public String helloFeign(@RequestParam("name") String name);

}
