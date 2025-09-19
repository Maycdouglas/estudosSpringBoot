# ESTUDOS SPRING BOOT

## Spring Initializr

O [Spring Initializr](https://start.spring.io/) é uma ferramenta web que gera gera a estrutura básica de um projeto Spring Boot.

No VSCode, existe a extensão de mesmo nome, que realiza a mesma tarefa.

---

### Project

Este campo define qual ferramenta de automação de build e gerenciamento de dependência o projeto utilizará.

- **Maven:** É a opção mais tradicional e amplamente utilizada no ecossistema Java. Utiliza um arquivo `pom.xml` para declarar as dependências e configurar o processo de build. É conhecido por sua robustez e vasta documentação. **Recomendado para iniciantes.**
- **Gradle:** É uma ferramenta de build mais moderna e flexível. Utiliza scripts em Groovy ou Kotlin (`build.gradle` ou `build.gradle.kts`), que são geralmente mais concisos que o XML do Maven. Costuma ter um desempenho de build mais rápido, especialmente em projetos multi-módulos.

**Escolha:** Para a maioria dos casos de estudo, **Maven** é uma escolha segura e simples. Se tem experiência ou precisa de scripts de build mais customizados, **Gradle** é uma excelente alternativa.

### Language

Define a linguagem de programação principal do projeto.

- **Java:** A linguagem padrão e mais comum para desenvolvimento com Spring. Possui o maior ecossistema e a maior comunidade.
- **Kotlin:** Uma linguagem moderna da JetBrains, 100% interoperável com Java. Oferece uma sintaxe mais concisa, segurança contra nulos (null-safety) e funcionalidades de programação funcional. É uma escolha cada vez mais popular para backend.
- **Groovy:** Uma linguagem dinâmica para a JVM. É frequentemente usada para scripts e testes (como no framework Spock), mas menos comum para a escrita da aplicação principal hoje em dia.

**Escolha:** Se está começando, **Java** é o caminho natural. Se busca modernidade e produtividade, **Kotlin** é uma opção fantástica.

### Spring Boot Version

Define a versão do Spring Boot que será utilizada. As versões seguem um padrão:

- `(SNAPSHOT)`: Versão em desenvolvimento ativo. Instável e não recomendada para projetos sérios.
- `(M#)`: Milestone (Marco). Uma versão de pré-lançamento para obter feedback da comunidade.
- `(RC#)`: Release Candidate. Uma versão candidata ao lançamento final, geralmente estável.
- **Versão Estável (sem sufixo):** A versão final e recomendada para uso.

**Escolha:** Opte sempre pela **última versão estável disponível**. Ela conterá as funcionalidades mais recentes e correções de segurança.

### Project Metadata

Estes campos definem a identidade do seu projeto, seguindo as convenções do Maven/Gradle.

- **Group:** Identificador do grupo ou organização que detém o projeto. A convenção é usar um domínio reverso. Ex: `br.com.seunome`, `com.github.seuusuario`.
- **Artifact:** O nome do projeto/módulo. Será o nome do arquivo `.jar` ou `.war` gerado. Ex: `api-blog`, `sistema-vendas`.
- **Name:** Um nome legível para o projeto. Geralmente é o mesmo que o `Artifact`.
- **Description:** Uma breve descrição do que o projeto faz.
- **Package name:** O pacote raiz do seu código-fonte. É gerado automaticamente a partir do `Group` e `Artifact` (ex: `br.com.seunome.apiblog`). É crucial, pois o Spring Boot usará este pacote como base para escanear componentes (`@Component`, `@Service`, etc.).

### Packaging

Define o formato do artefato final que será gerado pelo processo de build.

- **Jar (Java Archive):** O padrão e a forma recomendada para a maioria das aplicações Spring Boot. O projeto é empacotado como um arquivo `.jar` executável, que já contém um servidor web embutido (como Tomcat, Jetty ou Undertow). É ideal para microserviços e deployments em nuvem. Para rodar, basta o comando: `java -jar nome-do-arquivo.jar`.
- **War (Web Application Archive):** O formato tradicional para aplicações web Java. Gera um arquivo `.war` que precisa ser implantado em um servidor de aplicação externo (como uma instância separada do Tomcat, JBoss, etc.). Use esta opção apenas se o seu ambiente de produção exigir.

**Escolha:** Para 99% dos novos projetos, **Jar** é a escolha correta.

### Java

Define qual versão da JDK (Java Development Kit) o projeto será compilado para usar.

- As opções listadas são as versões LTS (Long-Term Support) como 17 e 21, e as mais recentes. Versões LTS são recomendadas por terem suporte e atualizações de segurança por um longo período.

**Escolha:** Utilize a **versão LTS mais recente** que o Spring Boot suporta (atualmente, 17 ou 21 são excelentes escolhas). Isso garante estabilidade e acesso a recursos modernos da linguagem.

## 7. Dependencies (Dependências)

Define os "Starters" do Spring Boot. Um **Starter** é um conjunto de dependências pré-configuradas que adicionam uma funcionalidade específica ao seu projeto com o mínimo de esforço.

Exemplos de dependências comuns:

- **Spring Web:** Essencial para criar APIs REST e aplicações web MVC. Inclui o servidor Tomcat embutido por padrão.
- **Spring Data JPA:** Facilita o acesso a bancos de dados relacionais usando o padrão JPA (Java Persistence API) com um provedor como o Hibernate.
- **Spring Security:** Adiciona uma camada de autenticação e autorização para proteger sua aplicação.
- **Lombok:** Uma biblioteca que reduz código repetitivo (boilerplate) como getters, setters, construtores, etc., através de anotações. É quase um item obrigatório para aumentar a produtividade.
- **Spring Boot DevTools:** Fornece ferramentas úteis em tempo de desenvolvimento, como reinicialização automática da aplicação após alterações no código (live reload).
- **H2 Database / PostgreSQL Driver / MySQL Driver:** Adiciona o driver JDBC necessário para conectar sua aplicação a um banco de dados específico.
