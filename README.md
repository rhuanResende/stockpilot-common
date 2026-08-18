# StockPilot Common

Biblioteca compartilhada contendo componentes reutilizáveis utilizados pelos microsserviços do ecossistema **StockPilot**.

O objetivo deste projeto é centralizar recursos comuns, reduzindo duplicação de código e garantindo padronização entre os serviços.

## Tecnologias

* Java 21
* Spring Boot 3.x
* Maven
* Lombok

---

# Estrutura do Projeto

```text
src/main/java
└── com.desenvolvimento.logica.stockpilot.stockpilot_common
    ├── constants
    ├── dto
    ├── entity
    ├── enums
    ├── exception
    ├── service
    └── util
```

## Pacotes

### constants

Contém constantes compartilhadas entre os microsserviços.

Exemplos:

* Mensagens padrão
* Nomes de headers
* Claims JWT
* Códigos internos

---

### dto

Objetos de transferência de dados utilizados em comunicação interna entre serviços.

Exemplos:

* ApiResponse

---

### entity

Entidades comuns utilizadas por múltiplos módulos.

Exemplos:

* BaseEntity
* AuditEntity

---

### enums

Enumerações compartilhadas pela plataforma.

Exemplos:

* MessageCode

---

### exception

Exceções customizadas utilizadas pelos serviços.

Exemplos:

* BusinessException
* UnauthorizedException
* InvalidTokenException

---

### service

Serviços utilitários compartilhados.

Exemplos:

* MessageService

---

### util

Classes auxiliares reutilizáveis.

Exemplos:

* DateUtils

---

# Internacionalização

As mensagens da aplicação são centralizadas no arquivo:

```text
src/main/resources/messages.properties
```

Exemplo:

```properties
access.denied=Acesso negado.
```

---

# Dependência Maven

Para utilizar a biblioteca em outros microsserviços:

```xml
<dependency>
    <groupId>com.desenvolvimento.logica.stockpilot</groupId>
    <artifactId>stockpilot-common</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

# Objetivos da Biblioteca

* Centralizar código reutilizável
* Padronizar respostas da API
* Padronizar tratamento de exceções
* Compartilhar DTOs comuns
* Compartilhar utilitários
* Reduzir duplicação de código
* Facilitar manutenção dos microsserviços

---

# Boas Práticas

* Evite adicionar regras de negócio específicas.
* Mantenha apenas componentes reutilizáveis.
* Não adicionar dependências de módulos específicos.
* Priorize baixo acoplamento.
* Sempre que possível, mantenha compatibilidade retroativa.

---

# Versionamento

Seguir versionamento semântico:

```text
MAJOR.MINOR.PATCH

1.0.0
```

Exemplos:

```text
1.0.0 -> Primeira versão estável
1.1.0 -> Novas funcionalidades compatíveis
1.1.1 -> Correções de bugs
2.0.0 -> Alterações incompatíveis
```

---

# Autor

Lógica Desenvolvimento

Projeto StockPilot © 2026
