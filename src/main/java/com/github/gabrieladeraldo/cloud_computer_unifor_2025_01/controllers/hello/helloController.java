package com.github.gabrieladeraldo.cloud_computer_unifor_2025_01.controllers.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/hello")
    public String hello() {return "Hello World"; }
}
