package com.github.gabrieladeraldo.cloud_computer_unifor_2025_01.controllers.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthController /* POR QUE EU NÃO POSSO DEIXAR O METODO COM MAIUSCULO EU NÃO SEI */ {
        
    @GetMapping("/health")
    public String health() { return "PONG"; }
}
