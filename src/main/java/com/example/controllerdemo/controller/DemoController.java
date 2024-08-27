package com.example.controllerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //user ResponseBody along with controller
@RequestMapping("demo")
public class DemoController {

    @GetMapping(value = {"/hello", "/namskar", "/bonjour"})
    public @ResponseBody String hello(){
        System.out.println("Hello Method is invoked");
        return ("hello from the demo controller");
    }

    @RequestMapping(value="/bye", method= RequestMethod.GET)
    public @ResponseBody String bye(){
        System.out.println("Bye Method is invoked");
        return ("Bye from you");
    }
}
