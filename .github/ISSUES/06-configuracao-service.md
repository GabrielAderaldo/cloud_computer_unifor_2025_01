---
title: "[SUB-TAREFA] - 6. Configuração do Service no Kubernetes"
labels: ["sub-task", "devops", "kubernetes"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
Esta tarefa consiste em criar o arquivo `service.yaml` para expor o Deployment da aplicação à rede, permitindo o acesso externo através de um ponto de acesso estável.

### Tarefas a Serem Realizadas
- [ ] Criar um arquivo chamado `service.yaml`.
- [ ] Definir a `apiVersion`, `kind` e `metadata` para o Service.
- [ ] No `spec`, configurar os seguintes campos:
    - `selector`: Apontar para `app: spring-boot-demo` para conectar o Service aos pods do Deployment.
    - `type`: `LoadBalancer` (para ambientes de nuvem) ou `NodePort` (para testes locais).
    - `ports`:
        - `protocol`: TCP
        - `port`: 80 (porta externa)
        - `targetPort`: 8080 (porta do container)

### Critérios de Aceitação
- [ ] O arquivo `service.yaml` é criado com a estrutura correta.
- [ ] A sintaxe do YAML é válida.
- [ ] O `selector` do Service corresponde às `labels` dos pods no Deployment.
- [ ] O mapeamento de portas está configurado corretamente.
