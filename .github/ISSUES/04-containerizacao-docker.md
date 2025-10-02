---
title: "[SUB-TAREFA] - 4. Containerização com Docker"
labels: ["sub-task", "devops", "docker"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
Esta tarefa foca em criar um `Dockerfile` otimizado utilizando a estratégia multi-stage para gerar uma imagem Docker leve e segura da aplicação Spring Boot.

### Tarefas a Serem Realizadas
- [ ] Criar um arquivo chamado `Dockerfile` na raiz do projeto.
- [ ] Implementar a **Etapa 1 (Build)** no Dockerfile:
    - Usar a imagem `maven:3.8.6-openjdk-17` como base.
    - Copiar o código-fonte para o container.
    - Executar `mvn clean package -DskipTests` para gerar o arquivo JAR.
- [ ] Implementar a **Etapa 2 (Runtime)** no Dockerfile:
    - Usar a imagem `openjdk:17-jdk-slim` como base.
    - Copiar o arquivo JAR gerado na etapa anterior.
    - Expor a porta `8080`.
    - Definir o `ENTRYPOINT` para executar a aplicação (`java -jar app.jar`).
- [ ] Construir a imagem Docker com o comando `docker build -t meu-spring-boot-app:latest .`.
- [ ] Testar a imagem localmente com `docker run -p 8080:8080 meu-spring-boot-app:latest`.
- [ ] Acessar `http://localhost:8080/hello` para confirmar que o container está funcionando.
- [ ] (Opcional) Fazer push da imagem para um registry (Docker Hub, etc.) com `docker push seuusuario/meu-spring-boot-app:latest`.

### Critérios de Aceitação
- [ ] O `Dockerfile` é criado com as duas etapas (build e runtime).
- [ ] A imagem Docker é construída com sucesso e sem erros.
- [ ] O container sobe corretamente e a aplicação responde no endpoint `/hello`.
