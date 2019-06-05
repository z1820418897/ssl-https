package com.zhc.sslhttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

    @GetMapping("/https")
    public String https(){

        return "Https:这个世界其实真的很公平，可是人心却是不公平的";
    }
}
