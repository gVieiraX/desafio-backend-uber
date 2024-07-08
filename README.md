# Microsserviços

Este projeto é uma API usando Java, Spring Boot e AWS Simple Email Service

## Instalação

1. Clone o repositório:


```bash
git clone https://github.com/gVieiraX/desafio-backend-uber
```

2. Instale as dependências com Maven

## Uso

1. Inicie a aplicação com Maven

2. A API estará acessível em: http://localhost:8080

3. Atualize o seu application.propertie com as suas credencias da AWS
```markdonw
aws.region=us-east-2
aws.accessKeyId=XXXXX
aws.secretKey=XXXXX
```


## API Endpoints
A API fornece os seguintes endpoints:


**GET EMAIL**
```markdown
post/api/email/send - Envia um email para o seu remetente.
```
Obs.: A API só ira funcionar com emails verificados pela AWS

```json
{
  "to": "gabriel_silvarosa12@hotmail.com",
  "subject": "teste",
  "body": "teste"
}
```

