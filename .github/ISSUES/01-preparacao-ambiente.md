---
title: "[SUB-TAREFA] - 1. Preparação do Ambiente de Desenvolvimento"
labels: ["sub-task", "devops", "environment"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
O objetivo desta tarefa é garantir que todo o ambiente de desenvolvimento esteja corretamente configurado para iniciar o projeto. Isso inclui a instalação e verificação das ferramentas essenciais.

### Tarefas a Serem Realizadas
- [ ] Instalar o Java JDK 17+ (Oracle ou OpenJDK).
- [ ] Configurar as variáveis de ambiente do Java (`JAVA_HOME`, `PATH`).
- [ ] Verificar a instalação do Java com `java -version`.
- [ ] Instalar o Docker Desktop.
- [ ] Verificar a instalação do Docker com `docker --version`.
- [ ] Instalar uma ferramenta de cluster Kubernetes local (ex: Minikube).
- [ ] Instalar a ferramenta de linha de comando `kubectl`.
- [ ] Verificar a configuração do Kubernetes com `kubectl version`.

### Critérios de Aceitação
- [ ] Todos os comandos de verificação (`java -version`, `docker --version`, `kubectl version`) são executados sem erros e mostram as versões corretas.
- [ ] O cluster Kubernetes local está em execução e acessível via `kubectl`.
