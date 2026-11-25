# Job Tracker API 🚀

API REST desenvolvida em **Java com Spring Boot**, **Spring Data JPA** e **MySQL** para gerenciamento centralizado de candidaturas a vagas de emprego, empresas e perfis de usuários, com destaque para o mapeamento de **vagas afirmativas e diversidade**.

Projeto desenvolvido como entrega prática de conclusão do **Programa Transforma Futuros (Recode)**, alinhado aos **Objetivos de Desenvolvimento Sustentável (ODS) da ONU**:
* **ODS 4 (Educação de Qualidade):** Apoio à transição de carreira e inserção profissional de estudantes de tecnologia.
* **ODS 5 (Igualdade de Gênero) & ODS 10 (Redução das Desigualdades):** Identificação e rastreamento de empresas com programas de vagas afirmativas.
* **ODS 8 (Trabalho Decente e Crescimento Econômico):** Organização e acompanhamento eficiente de processos seletivos.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot** (Web, Data JPA)
* **Hibernate** (Mapeamento Objeto-Relacional)
* **MySQL 8.0**
* **Maven**

---

## 🗄️ Estrutura do Banco de Dados (`job_tracker_db`)

A aplicação utiliza três entidades principais relacionadas:
* **`usuarios`**: Armazena dados do candidato (`id`, `nome`, `email`, `area_interesse`, `senioridade`).
* **`empresas`**: Armazena informações das organizações (`id`, `nome`, `setor`, `site`, `vagas_afirmativas`).
* **`candidaturas`**: Tabela central com relacionamento `@ManyToOne` para `usuarios` e `empresas` (`id`, `usuario_id`, `empresa_id`, `cargo`, `data_candidatura`, `status_candidatura`, `link_vaga`).

---

## 🔌 Endpoints da API

### Usuários (`/usuarios`)
| Método | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/usuarios` | Lista todos os usuários cadastrados |
| `POST` | `/usuarios` | Cadastra um novo usuário |

### Empresas (`/empresas`)
| Método | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/empresas` | Lista todas as empresas cadastradas |
| `POST` | `/empresas` | Cadastra uma nova empresa (incluindo flag `vagasAfirmativas`) |

### Candidaturas (`/candidaturas`)
| Método | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/candidaturas` | Lista todas as candidaturas com dados de empresa e usuário |
| `POST` | `/candidaturas` | Cria uma nova candidatura vinculada a um usuário e empresa |
| `PUT` | `/candidaturas/{id}` | Atualiza os dados ou status de uma candidatura existente |
| `DELETE` | `/candidaturas/{id}` | Remove uma candidatura pelo ID |

---

## ▶️ Como Executar Localmente

1. **Crie o banco de dados no MySQL:**
   ```sql
   CREATE DATABASE job_tracker_db;
