package com.woremo.sfgdi.controllers;

import com.woremo.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController conteoller;

    @BeforeEach
    void setUp() {

        conteoller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(conteoller.getGreeting());
    }
}