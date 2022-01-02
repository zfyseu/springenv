package com.ryan.env.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @RequestMapping("hello")
    @ResponseBody()
    public String hello(@RequestParam(value = "isEnabled", required = false) Integer isEnabled) {
        return "hello ryan";
    }
}
