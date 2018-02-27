package com.searchservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class HelloController {

	@RequestMapping("/hello")
    @GetMapping
    public String sayHello() {
        return "Microservice + Spring Boot + Tomcat";
    }

	@RequestMapping("/another")
    @GetMapping
    public String sayAnotherHello() {
        return "Again - Microservice + Spring Boot + Tomcat";
    }    
}