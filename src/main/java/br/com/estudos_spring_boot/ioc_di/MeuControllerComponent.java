package br.com.estudos_spring_boot.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

  // Significa que o Spring vai cuidar da criação do objeto
  // e injetar ele aqui quando necessário
  @Autowired
  MeuComponent meuComponent;

  @GetMapping("/")
  public String chamandoComponent(){
    var resultado = meuComponent.chamarMeuComponent();
    return resultado;
  }

  // Outra forma de fazer, mas sem injeção de dependência
  // @GetMapping("/)")
  // public String chamandoComponent(){
  //   var meuComponent = new MeuComponent();
  //   var resultado = meuComponent.chamarMeuComponent();
  //   return resultado;
  // }

}
