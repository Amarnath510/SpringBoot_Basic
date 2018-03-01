package com.pricing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PricingController.PATH)
public class PricingController {
    public static final String PATH = "/pricing";

    @RequestMapping("/hello")
    @GetMapping
    public String sayHello() {
        return "Hello from Pricing!!!";
    }
}
