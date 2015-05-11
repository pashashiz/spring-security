package com.ps.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Index {

    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "/home";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "/hello";
    }

}
