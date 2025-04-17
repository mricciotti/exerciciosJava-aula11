# Desafios Orientados a Objetos com Interface

Este repositório reúne três desafios desenvolvidos em Java, com foco na aplicação de conceitos de **Programação Orientada a Objetos**, uso de **interfaces**, **herança**, **encapsulamento**, e **testes com JUnit**.

## 🗂 Estrutura

Cada desafio está separado por pacotes dentro do namespace `org.example`, mantendo uma arquitetura modular e limpa.

---

##  Desafio 1 – Campeonato de Futebol Feminino

**Objetivo:**  
Criar um sistema para gerenciar times, jogadoras, partidas e a classificação de um campeonato.

**Tecnologias e conceitos aplicados:**
- Interface `Campeonato` definindo as operações do sistema.
- Classes `Time`, `Jogadora` e `Partida` modelando os elementos principais.
- Classe `CampeonatoImpl` para gerenciar os jogos e calcular a pontuação.
- Uso de **polimorfismo** e **encapsulamento**.
- Testes unitários com JUnit validando o cadastro, lógica de pontuação e inclusão de jogadoras.

---

##  Desafio 2 – Acompanhamento de Pessoas com Necessidades Especiais

**Objetivo:**  
Desenvolver um sistema para cadastrar pessoas com deficiência, registrar atendimentos e gerar relatórios por tipo de deficiência e grau.

**Tecnologias e conceitos aplicados:**
- Interface `SistemaAtendimento` para definir filtros e relatórios.
- Classe `Pessoa` com atributos e lista de `Atendimento`s.
- Classe `Atendimento` com data, tipo e profissional responsável.
- Implementação `SistemaAtendimentoImpl` com uso de `stream()` e `filter()`.
- Testes com JUnit cobrindo cadastro, filtragem e histórico de atendimentos.

---

##  Desafio 3 – Controle de Pedágios no Estado de São Paulo

**Objetivo:**  
Simular o controle de veículos passando por praças de pedágio, com tarifas específicas por tipo de veículo.

**Tecnologias e conceitos aplicados:**
- Interface `Calculavel` para definir o cálculo de pedágio.
- Hierarquia de classes `Veiculo`, `Carro`, `Moto`, `Caminhao` usando **herança e especialização de comportamento**.
- Classe `PracaPedagio` responsável por registrar veículos e acumular valor arrecadado.
- Classe `ControlePedagio` centraliza o gerenciamento e gera relatórios por praça.
- Testes unitários validando o cálculo e o fluxo de registros.

---

##  Tecnologias Utilizadas
- Java 
- JUnit 
- Programação Orientada a Objetos 
- IntelliJ IDEA / VS Code (recomendado)



 
