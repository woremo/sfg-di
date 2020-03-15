package com.woremo.sfgdi.controllers;

import com.woremo.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.lang.management.GarbageCollectorMXBean;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){


        return greetingService.sayGreeting();
    }



}
