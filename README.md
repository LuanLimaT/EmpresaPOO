Projeto de Automação de Processamento de Contratos
Descrição
Este projeto visa automatizar o processamento de contratos, gerando as parcelas a serem pagas com base no número de meses desejado. Utiliza um serviço de pagamento online para calcular juros simples e taxas de pagamento. O projeto foi desenvolvido em Java e segue o diagrama de classes fornecido.

Funcionalidades
Leitura dos dados de um contrato: número, data e valor total.
-Leitura do número de meses para parcelamento.
-Cálculo das parcelas mensais incluindo juros e taxa de pagamento.
-Geração e exibição das parcelas com suas datas de vencimento e valores.
-Estrutura do Projeto
-Contrato: Classe que representa um contrato, contendo número, data, valor total e a lista de parcelas.
-Parcela: Classe que representa uma parcela do contrato, contendo data de vencimento e valor.
-OnlineServicePgto: Interface que define métodos para calcular a taxa de pagamento e os juros.
-PaypalServico: Classe que implementa a interface OnlineServicePgto, aplicando juros simples de 1% ao mês e taxa de pagamento de 2%.
-ContratoServico: Classe que processa o contrato, gerando as parcelas com base nas regras de pagamento.
-Programa: Classe principal que lê os dados do contrato, processa-o e exibe as parcelas geradas.
Exemplo de Uso
Informe os dados do contrato:

Número: 8028
Data: 25/06/2018
Valor: 600.00
Número de parcelas: 3

O programa gerará e exibirá as parcelas:

Parcelas:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12
