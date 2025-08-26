# Sistema de Criação de Conta

Esta Atividade é um exemplo em **Java** que aplica o **Princípio da Responsabilidade Única** do SOLID para a materia de POO II.  
O código foi dividido em classes específicas, onde cada uma tem apenas uma responsabilidade.

---

## 📌 Estrutura do Projeto

- **Main.java**  
  Classe principal. Responsável apenas por orquestrar o fluxo:
    1. Ler os dados do usuário (nome e e-mail).
    2. Chamar os serviços de criação de conta, log e envio de e-mail.

- **AccountService.java**  
  Responsável pela **criação de conta**.

- **AccountLogger.java**  
  Responsável por **registrar/logar a criação de uma conta**.

- **EmailService.java**  
  Responsável por **enviar a confirmação de e-mail**.

---

## 🔄 Fluxo do Programa

1. O usuário informa **nome** e **e-mail**.
2. O sistema cria a conta (`AccountService`).
3. O sistema registra a criação (`AccountLogger`).
4. O sistema envia um e-mail de confirmação (`EmailService`).