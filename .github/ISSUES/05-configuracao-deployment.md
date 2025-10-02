---
title: "[SUB-TAREFA] - 5. Configuração do Deployment no Kubernetes"
labels: ["sub-task", "devops", "kubernetes"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
O objetivo desta tarefa é criar o arquivo de manifesto `deployment.yaml` para instruir o Kubernetes sobre como criar e gerenciar os pods da nossa aplicação.

### Tarefas a Serem Realizadas
- [ ] Criar um arquivo chamado `deployment.yaml`.
- [ ] Definir a `apiVersion`, `kind` e `metadata` para o Deployment.
- [ ] No `spec`, configurar os seguintes campos:
    - `replicas`: 2
    - `selector`: Definir `matchLabels` para `app: spring-boot-demo`.
    - `template`:
        - `metadata`: Adicionar a label `app: spring-boot-demo`.
        - `spec`:
            - `containers`:
                - `name`: app
                - `image`: meu-spring-boot-app:latest (ou a imagem do seu registry)
                - `ports`: `containerPort: 8080`
                - `resources`: Definir `requests` e `limits` para CPU e memória.
                - `livenessProbe`: Configurar um `httpGet` para o path `/health` na porta 8080.

### Critérios de Aceitação
- [ ] O arquivo `deployment.yaml` é criado com a estrutura e os valores corretos.
- [ ] A sintaxe do YAML é válida.
- [ ] O manifesto especifica corretamente a imagem Docker, o número de réplicas, os recursos e o health check.
