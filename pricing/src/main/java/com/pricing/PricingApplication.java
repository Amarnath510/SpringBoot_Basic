package com.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.pricing")
@EnableAutoConfiguration
@SpringBootApplication
public class PricingApplication {
    public static void main(String[] args) {
        SpringApplication.run(PricingApplication.class, args);
    }
}
