# Projeto Spring Boot com Docker e Kubernetes

Este projeto demonstra uma aplicação Spring Boot containerizada com Docker e orquestrada com Kubernetes.

## Pré-requisitos

Para executar este projeto, você precisará ter os seguintes softwares instalados:

1.  **Docker Desktop**: Para construir e gerenciar containers.
2.  **Minikube**: Para executar um cluster Kubernetes local.
3.  **kubectl**: A ferramenta de linha de comando para interagir com o Kubernetes.

## Como Executar a Aplicação

Siga os passos abaixo para implantar a aplicação no seu cluster Kubernetes local.

### 1. Inicie o Cluster Minikube

Se o seu cluster ainda não estiver rodando, inicie-o com o comando:

```bash
minikube start
```

### 2. Aplique os Manifestos do Kubernetes

Navegue até a raiz deste projeto no seu terminal e aplique os arquivos de manifesto do Deployment e do Service. O Deployment irá criar os pods para a aplicação, e o Service irá expô-los para acesso.

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

### 3. Verifique o Status da Implantação

Você pode verificar se os pods estão sendo criados e se estão no estado "Running":

```bash
# Aguarde alguns instantes para a imagem ser baixada e os containers iniciarem
kubectl get pods
```

O status dos pods deve mudar de `ContainerCreating` para `Running`.

### 4. Acesse a Aplicação

Para acessar a aplicação, o Minikube pode gerar uma URL e abri-la diretamente no seu navegador. Execute o seguinte comando:

```bash
minikube service spring-boot-service
```

Este comando abrirá uma URL no seu navegador. A página inicial mostrará um erro "Whitelabel Error Page", o que é esperado.

Para confirmar que a aplicação está funcionando, adicione `/hello` ao final da URL no seu navegador. Você deverá ver a mensagem "Hello World".

### 5. (Opcional) Limpeza do Ambiente

Para remover todos os recursos criados no Kubernetes, execute:

```bash
kubectl delete -f deployment.yaml
kubectl delete -f service.yaml
```
