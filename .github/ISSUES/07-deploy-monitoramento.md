---
title: "[SUB-TAREFA] - 7. Deploy e Monitoramento da Aplicação"
labels: ["sub-task", "devops", "kubernetes"]
assignees: ""
---

### Épico Principal: #1

### Contexto da Tarefa
Com os manifestos criados, esta tarefa foca em aplicar as configurações no cluster Kubernetes, verificar o status dos recursos e acessar a aplicação.

### Tarefas a Serem Realizadas
- [ ] Aplicar o manifesto do Deployment: `kubectl apply -f deployment.yaml`.
- [ ] Aplicar o manifesto do Service: `kubectl apply -f service.yaml`.
- [ ] Verificar o status dos pods: `kubectl get pods -l app=spring-boot-demo`. Aguardar até que o status seja "Running".
- [ ] Verificar o status do Service: `kubectl get services`.
- [ ] Descrever o Deployment para obter mais detalhes: `kubectl describe deployment spring-boot-demo`.
- [ ] Acessar a aplicação:
    - **Para Minikube:** `minikube service spring-boot-service`.
    - **Para Nuvem:** Obter o IP externo do LoadBalancer e acessar `http://<IP_EXTERNO>/hello`.
- [ ] (Opcional) Testar operações de manutenção:
    - Escalar o deployment: `kubectl scale deployment spring-boot-demo --replicas=3`.
    - Visualizar logs: `kubectl logs -f -l app=spring-boot-demo`.
    - Redirecionar porta: `kubectl port-forward service/spring-boot-service 8080:80`.

### Critérios de Aceitação
- [ ] Os recursos (Deployment, Pods, Service) são criados com sucesso no cluster.
- [ ] Os pods atingem o estado "Running".
- [ ] A aplicação está acessível através do IP do Service e o endpoint `/hello` responde corretamente.
