package com.samiach.dockerdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDemoAppApplication {

    // Tutorial available at: https://www.youtube.com/watch?v=KZDVkkFM3gk

    @GetMapping("/get")
    public String getMessage() {
        return "Welcome! This is a simple app to demonstrate Dockerizing an Spring Boot App";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoAppApplication.class, args);
    }

}
