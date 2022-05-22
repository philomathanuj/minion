package com.philomath.k8.minion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeepAliveController {

    @GetMapping("/keepalive")
    public String getKeepAliveStatus(){
        return "OK";
    }
}
