# Estágio 1: Build da aplicação com Maven
FROM maven:3-eclipse-temurin-21 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o pom.xml e baixa as dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o código fonte e compila a aplicação
COPY src ./src
RUN mvn clean install -DskipTests

# Estágio 2: Cria a imagem final com o JRE
FROM eclipse-temurin:21-jre

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR da aplicação do estágio de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Define o comando para iniciar a aplicação
ENTRYPOINT ["java","-jar","app.jar"]