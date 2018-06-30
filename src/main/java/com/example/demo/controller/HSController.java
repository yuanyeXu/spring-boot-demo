package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HSController {

    @RequestMapping("/hs")
    public String index() {
        return getStr();
    }

    private String getStr() {
        return "ok";
    }
}
