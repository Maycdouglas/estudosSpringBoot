package br.com.estudos_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    
    // Ex: http://localhost:8080/primeiraController/primeiroMetodo
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo(){
      return "Primeiro método Spring Boot";
    }

    // Ex: http://localhost:8080/primeiraController/metodoComPathParams/190
    @GetMapping("/metodoComPathParams/{id}")
    public String metodoComPathParams(@PathVariable String id){
      return "No metodoComPathParams, o parametro é: " + id;
    }
    // public String segundoMetodo(@PathVariable(name="id") String identificator) -- se o nome fosse diferente da variável, teria que ser assim

    // Ex: http://localhost:8080/primeiraController/metodoComQueryParams?id=189
    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
      return "No metodoComQueryParams, o parametro é: " + id;
    }

    // Ex: http://localhost:8080/primeiraController/metodoComQueryParamsMap?id=189&nome=Maycon&estudante=True
    @GetMapping("/metodoComQueryParamsMap")
    public String metodoComQueryParamsMap(@RequestParam Map<String, String> allParams){
      return "No metodoComQueryParamsMap, o parametro é: " + allParams.entrySet();
    }
}
