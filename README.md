# spring-aws-sns
# README

## Descrição da Aplicação

Este é um projeto em Java utilizando Spring Boot que realiza a integração com o AWS Simple Notification Service (SNS). O objetivo da aplicação é permitir o envio de notificações através do SNS. A aplicação implementa uma notificação em em determinado tópico SNS.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Cloud AWS
- Maven

## Pré-requisitos

Antes de começar, verifique se você possui os seguintes itens instalados na sua máquina:

- Java 21 ou superior
- Maven
- Uma conta AWS com permissões para SNS ou LocalStack configurado para realizar integração

## Configuração do Ambiente

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/lluuccaassfm/spring-aws-sns.git
   cd spring-aws-sns
   ```

2. **Configuração da AWS**:

    - Crie um Tópico no AWS SNS e anote o ARM do tópico.
    - Configure o método sqsAsyncClient() em SqsConfig.java com a URL e região AWS


## Como Executar

1. **Construir o projeto**:

   ```bash
   mvn clean package
   ```

2. **Executar a aplicação**:

   ```bash
   mvn spring-boot:run
   ```

   A aplicação estará rodando no `http://localhost:8080`.

## Endpoint

### POST /sns/send-message

Esse endpoint permite que você envie uma mensagem para o tópico SNS.

**Requisição**

- **URL**: `http://localhost:8080/sns/send-message`
- **Método**: POST
- **Headers**:
    - Content-Type: application/json
- **Corpo da Requisição**:

```json
{
  "content": "Sua mensagem aqui"
}
```

**Exemplo de cURL**:

```bash
curl -X POST http://localhost:8080/sns/send-message -H "Content-Type: application/json" -d '{"content":"Olá, SNS!"}'
```


## Contribuição

Sinta-se à vontade para contribuir! Faça um fork do repositório, faça suas alterações e envie um pull request.
