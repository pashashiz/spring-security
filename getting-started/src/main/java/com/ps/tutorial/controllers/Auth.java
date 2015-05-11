package com.ps.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Auth {

    @RequestMapping("/login" )
    public String login(@RequestParam Map<String, String> params) {
        System.out.println(params);
        return "/login";
    }

}
