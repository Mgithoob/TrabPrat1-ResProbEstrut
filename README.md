
# TRABALHO PRÁTICO 1: Sistema de Gerenciamento de Atendimento ao Cliente

## Resolução de Problemas Estruturados em Computação 


### Arquivos:

- *Fila_atend.java*
- *Pilha_hist.java*
- *ListaEncadeada.java*
- *Elemento.java*
- *ListaEncadeada.java*
- *Main.java*

#### Descrição dos arquivos:
##### *Fila_atend.java*

Simula uma fila dinâmica de clientes a serem atendidos. Implementada com o uso da estrutura de uma lista encadeada circular, proveniente do arquivo *ListaEncadeada.java*. 
Contém os atributos:
- frente (_Tipo Nó. Marca o início da fila._) 
- tras (_Tipo Nó. Marca o fim da fila._)
- dados (_Tipo ListaEncadeada. Contém os dados da fila._)

Contém os métodos:
- adicionar_cliente(id, nome, motivo_atendimento) (_Não tem retorno. Recebe 3 Strings, estas sendo: Id do cliente, nome do cliente, e o motivo de atendimento. Esses parâmetros serão inseridos ao novo nó no fim da fila._)
- atender() (_Retorna um Elemento. Sem parâmetros. Irá remover o nó no começo da fila e retornar seus dados, que estão contidos em um objeto Elemento._)
- vazia() (_Retorna boolean. Sem parâmetros. Verifica se a fila está vazia e retorna o resultado._)
- imprimir(debug) (Não tem retorno. Recebe um boolean debug. Imprime a fila, se debug tiver valor verdadeiro, imprimirá os dados dentro dos atributos também.)


### Instruções:

Dentro do arquivo *Main.java*, terão testes comentados para cada questão. Descomentar, realizar teste, comentar novamente.

*Observação: Em todos os códigos, o valor 0 (int) é tratado como vazio.*
