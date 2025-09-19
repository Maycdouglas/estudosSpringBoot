package br.com.estudos_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

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

    // Ex: localhost:8080/primeiraController/metodoComBodyParams
    // No Postman
    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
      return "No metodoComBodyParams, o verbo HTTP usado foi POST: " + usuario.username();
    }

    // Ex: localhost:8080/primeiraController/metodoComHeaderParam
    // No Postman
    @PostMapping("/metodoComHeaderParam")
    public String metodoComHeaderParam(@RequestHeader String name){
      return "No metodoComHeaderParam: " + name;
    }

    // Ex: localhost:8080/primeiraController/metodoComHeadersParams
    // No Postman
    @PostMapping("/metodoComHeadersParams")
    public String metodoComHeadersParams(@RequestHeader Map<String, String> headers){
      return "No metodoComHeadersParams: " + headers.entrySet();
    }

    // Ex: localhost:8080/primeiraController/metodoResponseEntity/6
    // usamos Object pq pode retornar tanto o objeto usuario quanto a String de erro
    // No Postman
    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodResponseEntity(@PathVariable int id){
      
      var usuario = new Usuario("Maycon Douglas");

      if (id > 5) {
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
      }
      
      return ResponseEntity.badRequest().body("Id inválido, pois é menor que 5.");
    }

    //criação de classe simplificada
    record Usuario(String username) {}
}
