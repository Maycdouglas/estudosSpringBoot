package br.com.estudos_spring_boot.ioc_di;

import org.springframework.stereotype.Service;

// Indica que essa classe é um componente gerenciado pelo Spring
@Service
public class MeuComponent {
  public String chamarMeuComponent(){
    return "Chamando meu component";
  }
}
