# 🔐 E2P.java – Sistema de Controle de Acesso com Validação

> Segundo exercício da Etapa 1 do Roadmap Back-End em Java de Daniel Esteban (@daniestebanvr)  
> Nível: Iniciante Avançado | Foco: Validação, Loops, Menu Interativo, Boas Práticas

---

## 📘 Descrição

Este projeto implementa um **sistema de controle de acesso simples via console**, que simula o processo de login com validação de tentativas, exibição de menu e alteração dinâmica de senha.

O exercício tem como objetivo consolidar o uso de estruturas de controle (`if`, `do-while`, `switch`), entrada de dados (`Scanner`), tratamento de exceções e aplicação de boas práticas como a modularização por métodos e encapsulamento via classes.

---

## 🎯 Funcionalidades

- Validação de **usuário e senha padrão**
- **Bloqueio após 3 tentativas de login** incorretas
- **Menu persistente** com as opções:
  1. Ver perfil do usuário
  2. Alterar senha em tempo real
  3. Encerrar sessão
- Atualização do objeto `admin` com nova senha
- Tratamento de entrada inválida via `try/catch`

---

## 🧠 Conceitos Praticados

| Conceito               | Aplicação no projeto                   |
|------------------------|----------------------------------------|
| `Scanner`              | Captura de entrada do usuário          |
| `do-while`             | Laços para login e menu persistente    |
| `if/else`              | Validação de autenticação              |
| `switch`               | Controle de fluxo no menu              |
| `try/catch`            | Tratamento de exceções de entrada      |
| Orientação a Objetos   | Classe `Usuario` e encapsulamento      |
| Métodos                | Separação da lógica por responsabilidade|
