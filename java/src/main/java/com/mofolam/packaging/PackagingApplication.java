package com.mofolam.packaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PackagingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PackagingApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Software Packaging Project!";
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\":\"healthy\",\"application\":\"Java Packaging App\"}";
    }
}
