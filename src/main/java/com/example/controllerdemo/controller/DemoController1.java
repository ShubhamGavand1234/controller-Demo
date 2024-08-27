package com.example.controllerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"english", "marathi", "hindi"})
public class DemoController1 {

    @GetMapping("/name")
    public String name(){
        System.out.println("Invoked");
        return "Shubham";
    }


}
