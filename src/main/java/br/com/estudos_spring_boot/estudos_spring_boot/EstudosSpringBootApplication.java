package br.com.estudos_spring_boot.estudos_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.estudos_spring_boot") // Faz com que a aplicação reconheça os controllers fora do pacote principal
public class EstudosSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringBootApplication.class, args);
	}

}
