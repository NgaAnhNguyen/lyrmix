package com.example.spring_boot_react_demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GreetingController {

    @GetMapping("/api/greeting")
    public String greet() {
        return "Hello ";
    }
}
