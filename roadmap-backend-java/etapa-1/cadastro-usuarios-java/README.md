# 🧑‍💻 E1P.java - Cadastro e Gerenciamento de Usuários

> Primeiro exercício do roadmap back-end Java de Daniel Esteban (@daniestebanvr)  
> Nível: Iniciante | Foco: Lógica + Estrutura + Boas Práticas

---

## 📘 Descrição

Este projeto consiste em uma aplicação de console em Java que permite o **cadastro e gerenciamento básico de usuários**. É o primeiro passo prático do roadmap para se tornar um desenvolvedor back-end profissional.

---

## ✅ Funcionalidades

- [x] Cadastrar até **5 usuários**, com:
  - Nome (String)
  - E-mail (String)
  - Idade (int)
- [x] **Listar** todos os usuários cadastrados
- [x] **Buscar** um usuário pelo nome
- [x] **Atualizar** a idade de um usuário existente
- [x] **Excluir** um usuário pelo nome
- [x] Menu interativo com loop contínuo

---

## 📌 Regras de negócio

- O sistema deve impedir cadastro com nome ou e-mail vazio.
- Idade não pode ser negativa.
- As operações de busca, atualização e exclusão devem localizar o usuário pelo **nome**.
- Exibir mensagens claras para todas as ações.

---

## 🧠 Conceitos abordados

| Conceito                    | Descrição                                               |
|----------------------------|----------------------------------------------------------|
| Tipos de dados             | String, int, boolean                                     |
| Estruturas de controle     | if, else, switch, while, for                             |
| Armazenamento em memória   | Vetores ou Listas (Array ou ArrayList)                  |
| Modularização              | Separação das funcionalidades em métodos                |
| Validação de dados         | Entradas obrigatórias e tratamento de erros             |
| Estrutura de menu          | Navegação por opções no terminal                        |

---

## 🗃️ Estrutura do Projeto

cadastro-usuarios-java/
├── README.md
├── docs/
│   └── explicacao.pdf (opcional)
├── sql/                      # Pasta reservada para scripts SQL (vazia neste projeto)
├── src/
│   └── Main.java             # Código-fonte principal
├── tests/
│   └── TestesManuais.txt     # Roteiro de testes manuais
├── .gitignore                # Arquivos a serem ignorados pelo Git
├── Dockerfile (opcional)    # Configuração para container Docker
├── docker-compose.yml (opcional)
├── LICENSE                   # Licença do projeto (MIT)
└── CONTRIBUTING.md (opcional) # Diretrizes de contribuição
