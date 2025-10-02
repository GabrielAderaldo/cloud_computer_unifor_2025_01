---
title: "[SUB-TAREFA] - 3. Desenvolvimento do Primeiro Endpoint"
labels: ["sub-task", "backend", "feature"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
O objetivo é criar um Controller simples na aplicação Spring Boot para verificar seu funcionamento. Serão criados dois endpoints: `/hello` e `/health`.

### Tarefas a Serem Realizadas
- [X] Criar a classe `HelloController` no pacote `com.example.demo`.
- [X] Anotar a classe com `@RestController`.
- [X] Criar um método `hello()` mapeado para `@GetMapping("/hello")` que retorna a string "Olá, mundo! Spring Boot rodando.".
- [X] Criar um método `health()` mapeado para `@GetMapping("/health")` que retorna a string "Aplicação funcionando perfeitamente!".
- [X] Executar a aplicação localmente com o comando `./mvnw spring-boot:run`.
- [X] Acessar o endpoint `http://localhost:8080/hello` para verificar a resposta.
- [X] Acessar o endpoint `http://localhost:8080/health` para verificar a resposta.

### Critérios de Aceitação
- [ ] A aplicação sobe localmente sem erros na porta 8080.
- [ ] O endpoint `/hello` retorna a mensagem de boas-vindas corretamente.
- [ ] O endpoint `/health` retorna a mensagem de status corretamente.
