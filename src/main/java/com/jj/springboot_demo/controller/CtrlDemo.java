package com.jj.springboot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlDemo {
    @GetMapping("/demo")
    public String test() {
        System.out.println("CtrlDemo");
        return "CtrlDemo";
    }
}
