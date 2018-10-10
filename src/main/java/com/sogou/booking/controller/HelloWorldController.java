package com.sogou.booking.controller;

import com.sogou.booking.pojo.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "World";
    }

    @RequestMapping("/world")
    public String world() {
        return "Hello";
    }

    @RequestMapping("/helloworld")
    public CommonResult helloworld() {
        CommonResult result = new CommonResult();
        result.setCode(1999);
        result.setMessage("you need login!");
        return result;
    }

    @RequestMapping("/")
    public String index() {
        return "ok";
    }

}