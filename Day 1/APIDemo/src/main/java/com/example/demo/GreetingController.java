package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}
