Fluxo de Dados
O formulário é dividido em duas seções principais que geralmente se traduzem em tabelas distintas (ou objetos relacionados) no banco de dados:

A. Cadastro de Mercadoria (Entidade: Produto/Item)
Nesta etapa, o usuário insere os dados técnicos do que será transportado:

Identificação: Nome para controle de estoque.

Logística: Peso (essencial para calcular o frete ou escolher o veículo) e Valor Declarado (importante para seguros e notas fiscais).

B. Cadastro de Endereço (Entidade: Destinatário/Endereço)
Aqui é definida a rota da entrega:

CEP: Gatilho comum para sistemas de busca automática (API de ViaCEP, por exemplo).

Geolocalização: Rua, número, cidade e estado compõem o destino final.

C. Ação Final (O Botão "Salvar e Vincular")
Vincular o sistema não apenas salva os dados, mas cria um relacionamento (foreign key) entre a mercadoria e o endereço, gerando um registro único na tabela de Entregas.
