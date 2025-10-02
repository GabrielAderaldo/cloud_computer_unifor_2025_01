package com.github.gabrieladeraldo.cloud_computer_unifor_2025_01.lab.AV2_LABORATORIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;






@SpringBootApplication
@ComponentScan(basePackages = {"com.github.gabrieladeraldo.cloud_computer_unifor_2025_01.controllers.hello",
"com.github.gabrieladeraldo.cloud_computer_unifor_2025_01.controllers.health"})
public class ProjetosDosLaboratoriosDaAv2Application {
	public static void main(String[] args) {
		SpringApplication.run(ProjetosDosLaboratoriosDaAv2Application.class, args);
	}
}
