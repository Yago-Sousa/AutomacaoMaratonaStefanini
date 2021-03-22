#language: pt
#enconding: UTF-8
Funcionalidade: Keep Notes Mobile
  
  Eu como usuário gostaria de criar notas em um app para eu possa me organizar melhor no meu dia e também fazer todas as interações tradicionais que um app faz.

  Cenario: Adicionar uma nova anotacao
    Dado que o usuario clique para adicionar uma nova anotacao
    Quando o usuario digitar sua anotacao com "Minha anotacao do dia"
    E configurar um titulo da anotacao com "Titulo da anotacao"
    Entao o app adiciona um novo lembrete de anotacao.

  Cenario: Editar uma anotacao ja criada
    Dado que o usuario clique na anotacao para editar
    Quando o usuario editar o campo anotacao com "Minha anotacao do dia Editada!"
    E editar o titulo da anotacao com "Titulo da anotacao editada!"
    Entao o app edita a anotacao.

  Cenario: Agendar uma anotacao ja criada
    Dado que o usuario clique na anotacao para agendar
    Quando o usuario clicar no botao de agendamento
    E editar o agendamento para "Tomorrow", "Daily"
    Entao o app agenda a anotacao.

  Cenario: Excluir uma anotacao ja criada
    Dado que o usuario clique na anotacao para excluir
    Quando o usuario clicar no botao configuracoes
    E clique na opcao delete
    Entao o app exclui a anotacao.
