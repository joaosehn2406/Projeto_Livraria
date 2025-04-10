# 📚 Sistema de Gerenciamento de Livraria

Este é um projeto simples desenvolvido em **Java**, com foco em **gerenciamento de pedidos** e **cadastro de usuários e trabalhadores**. O sistema é operado via **terminal**, oferecendo uma interface interativa onde você pode realizar ações de **gerenciamento de trabalhadores**, **realizar pedidos de livros** e **validar dados de clientes e trabalhadores**.

## 🚀 Funcionalidades

- **Gerenciamento de trabalhadores**:
  - Cadastro de trabalhadores (Gerentes e Assistentes de Vendas).
  - Validação de CPF e dados de nascimento.
  - Atribuição de horas trabalhadas e valor por hora.
  
- **Cadastro de clientes**:
  - Cadastro de novos clientes com validação de CPF e data de nascimento.
  
- **Pedidos de livros**:
  - Possibilidade de registrar pedidos de livros para os clientes, incluindo nome, preço, autor, gênero e quantidade de itens.
  - Cálculo do subtotal do pedido.

- **Exibição de trabalhadores e livros**:
  - Exibição de todos os trabalhadores cadastrados.
  - Exibição de livros disponíveis no sistema.

## 💻 Tecnologias Utilizadas

- **Java** – Linguagem de programação utilizada para desenvolver a aplicação.
- **Terminal** – O sistema funciona inteiramente via terminal, com interação através de entradas de texto.

## ⚙️ Como Rodar

### Pré-requisitos:

1. **Java JDK 11 ou superior**: Baixe e instale o [Java JDK](https://www.oracle.com/java/technologies/downloads/).
2. **IDE para Java**: Abra o projeto em uma IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/).

### Rodando o Projeto:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/joaosehn2406/projeto-livraria.git
   cd projeto-livraria
   ```

2. **Compile e execute**:
   - Se estiver utilizando uma IDE, compile e execute a classe `Program` como uma aplicação Java normal.
   - Caso esteja usando o terminal, execute o seguinte comando:
     ```bash
     javac application/Program.java
     java application.Program
     ```

### Interação com o Sistema:

Ao executar o sistema, o terminal exibirá as opções para você escolher entre as funções de **Gerente** ou **Cliente**. Dependendo da escolha, o sistema permitirá realizar operações como contratar trabalhadores, exibir os trabalhadores cadastrados, ou realizar pedidos de livros.

## 💡 Exemplo de Execução

Ao iniciar o sistema, você verá as seguintes opções:

```bash
==== WELCOME to the System ====
Choose and option: 
1. Manager 
2. Client
```

### Caso escolha **Manager**:
O sistema permitirá que você contrate trabalhadores, exiba a lista de trabalhadores e feche o sistema.

### Caso escolha **Client**:
O sistema permitirá que você cadastre um novo cliente, compre livros e veja os livros disponíveis.

## 📝 Observações

- O projeto utiliza **validação de CPF** no formato `XXX.XXX.XXX-XX` para garantir que os dados inseridos sejam válidos.
- Para cada pedido, o sistema calcula automaticamente o **subtotal** dos livros no pedido.

## 🤝 Como Contribuir

1. Faça um **fork** do repositório.
2. Crie uma nova branch para a sua feature: 
   ```bash
   git checkout -b minha-feature
   ```
3. Realize as alterações e faça commit:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **pull request**.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT). Consulte o arquivo `LICENSE` para mais informações.

---
