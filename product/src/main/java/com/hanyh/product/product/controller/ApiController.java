package com.hanyh.product.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/test")
    public String test() {
        return "一个springboot";
    }


    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public String helloFeign(@RequestParam("name") String name) {
        return name;
    }
}
