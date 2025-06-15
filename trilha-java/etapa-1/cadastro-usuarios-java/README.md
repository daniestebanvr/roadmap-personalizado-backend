# 🧑‍💻 E1P.java - Cadastro e Gerenciamento de Usuários

> Primeiro exercício do roadmap back-end Java de Daniel Esteban (@daniestebanvr)  
> Nível: Iniciante | Foco: Lógica + Estrutura + Boas Práticas

---

## 📘 Descrição

Este projeto consiste em uma aplicação de console em Java que permite o **cadastro e gerenciamento básico de usuários**. É o primeiro passo prático do roadmap para se tornar um desenvolvedor back-end profissional.

---

## ✅ Funcionalidades

- [x] Cadastrar Usuários, com:
  - Nome (String)
  - E-mail (String)
  - Idade (int)
- [x] **Listar** todos os usuários cadastrados
- [x] **Buscar** um usuário pelo nome
- [x] **Atualizar** a idade de um usuário existente
- [x] **Excluir** um usuário pelo nome
- [x] **Encerrar** o programa com opção de sair (6)
- [x] Menu interativo com loop contínuo

---

## 📌 Regras de negócio

- O sistema deve impedir cadastro com nome ou e-mail vazio.
- O e-mail deve estar em formato válido (ex: usuario@email.com).
- A idade do usuário deve estar entre **1 e 100 anos**.
- As operações de busca, atualização e exclusão devem localizar o usuário pelo **nome**.
- Exibir mensagens claras e amigáveis para todas as ações.

---

## 🧠 Conceitos abordados

| Conceito                    | Descrição                                               |
|----------------------------|----------------------------------------------------------|
| Tipos de dados             | String, int, boolean                                     |
| Estruturas de controle     | if, else, switch, while, for                             |
| Armazenamento em memória   | Listas (`ArrayList`)                                     |
| Modularização              | Separação das funcionalidades em métodos                |
| Validação de dados         | Entradas obrigatórias e tratamento de erros             |
| Regex                      | Validação de e-mail com expressões regulares            |
| Estrutura de menu          | Navegação por opções no terminal                        |
