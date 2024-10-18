# Sistema de Gerenciamento de Pedidos

Este projeto é um Sistema de Gerenciamento de Pedidos em Java que permite o registro de mesas, adição de pedidos, cálculo de totais e finalização de pedidos. Ele foi desenvolvido utilizando conceitos de Programação Orientada a Objetos (POO).
Grupo: Ana Pellegrino, Artur Uchôa, André Mota, Isabel Lugon e João Magalhães.

## Funcionalidades

- Gerenciar Mesas: Permite criar novas mesas e verificar se estão disponíveis.
- Registrar Pedidos: Os pedidos podem ser adicionados a mesas específicas com itens detalhados.
- Fechar Pedidos: Permite finalizar pedidos e calcular o total a ser pago.
- Gerar Relatórios de Vendas: Relatórios de vendas são gerados com detalhes dos pedidos e total de vendas.

## Estrutura do Projeto

### 1. Main.java
- Arquivo principal que gerencia o fluxo do sistema.
- Apresenta um menu interativo para escolher opções como:
  - Registro de mesas.
  - Adição de pedidos.
  - Fechamento de pedidos.
  - Geração de relatórios de vendas.
- Usa as classes Mesa, Pedido e ItemDoPedido para operar sobre as mesas e pedidos.

### 2. Mesa.java
- Classe que representa uma mesa no restaurante.
- Armazena o número da mesa e sua disponibilidade.
- Principais métodos:
  - Verificar Disponibilidade: Retorna se a mesa está disponível.
  - Definir Disponibilidade: Define se a mesa está disponível ou não.

### 3. Pedido.java
- Classe que representa um pedido associado a uma mesa.
- Armazena a lista de itens do pedido e informações sobre a mesa.
- Principais métodos:
  - Adicionar Itens: Adiciona itens ao pedido.
  - Calcular Total: Calcula o total do pedido com base nos itens adicionados.
  - Fechar Pedido: Finaliza o pedido e torna a mesa disponível novamente.
  - Gerar Relatório: Gera um relatório detalhado do pedido.

### 4. ItemDoPedido.java
- Representa um item individual em um pedido.
- Armazena o nome do item, quantidade e preço unitário.
- Principais métodos:
  - Calcular Total: Calcula o total para o item com base na quantidade e preço unitário.

# Quais são os itens de menu mais populares entre os clientes?
- Identificar os itens mais pedidos ajuda na otimização do estoque, na criação de promoções e na personalização do cardápio para atender melhor os clientes.

# Quais horários do dia têm o maior número de pedidos?
- Saber quais períodos têm mais pedidos ajuda na alocação de recursos, como número de funcionários, e pode influenciar decisões sobre promoções e ofertas em horários de baixa demanda.

# Qual é o valor médio dos pedidos feitos pelos clientes?
- Analisar o valor médio dos pedidos ajuda a criar estratégias de marketing, como combos e promoções, para aumentar o ticket médio do restaurante.

# Quais mesas têm maior rotatividade ou realizam mais pedidos?
-Identificar as mesas com maior rotatividade ou pedidos pode orientar a alocação de garçons e melhorar a eficiência do atendimento, evitando demoras e garantindo uma experiência positiva.

# Qual é o tempo médio para a conclusão de um pedido desde o registro até o fechamento?
- Monitorar o tempo médio de atendimento ajuda a identificar gargalos no processo de preparação e entrega, permitindo ajustes para melhorar a eficiência e a satisfação dos clientes.
