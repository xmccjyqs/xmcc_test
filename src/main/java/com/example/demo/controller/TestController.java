package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @RequestMapping("hello")
    public String test(){
        log.debug("log debug ->{}","我是debug级别的日志2");
        log.info(" log   info ->{}","我是info级别的日志2");
        log.error("log error ->{}","我是error级别的日志2");

        return "hello spring boot";
    }

}
