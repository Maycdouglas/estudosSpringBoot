package br.com.estudos_spring_boot.estudos_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo(){
      return "Primeiro método Spring Boot";
    }
}
