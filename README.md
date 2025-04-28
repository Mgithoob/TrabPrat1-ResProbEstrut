
# TRABALHO PRÁTICO 1: Sistema de Gerenciamento de Atendimento ao Cliente
# Resolução de Problemas Estruturados em Computação 

_Obs: Apesar deste ser a documentação deste trabalho, recomendo ler os comentários no código ao procurar maior compreensão do funcionamento do mesmo._

## Arquivos:

- *Fila_atend.java*
- *Pilha_hist.java*
- *ListaEncadeada.java*
- *Elemento.java*
- *ListaEncadeada.java*
- *Main.java*

### Descrição dos arquivos:


#### *Fila_atend.java*

Simula uma fila dinâmica de clientes a serem atendidos. Implementada com o uso da estrutura de uma lista encadeada circular, proveniente da classe *ListaEncadeada*. 
Contém os atributos:
- frente (_Tipo Nó. Marca o início da fila._) 
- tras (_Tipo Nó. Marca o fim da fila._)
- dados (_Tipo ListaEncadeada. Contém os dados da fila._)

Contém os métodos:
- adicionar_cliente(id, nome, motivo_atendimento) (_Não tem retorno. Recebe 3 Strings, estas sendo: Id do cliente, nome do cliente, e o motivo de atendimento. Esses parâmetros serão inseridos ao novo nó no fim da fila._)
- atender() (_Retorna um Elemento. Sem parâmetros. Irá remover o nó no começo da fila e retornar seus dados, que estão contidos em um objeto Elemento._)
- vazia() (_Retorna boolean. Sem parâmetros. Verifica se a fila está vazia e retorna o resultado._)
- imprimir(debug) (Não tem retorno. Recebe um boolean debug. Imprime a fila, se debug tiver valor verdadeiro, imprimirá os dados dentro dos atributos também.)


#### *Pilha_hist.java*

Simula um histórico de solicitações com uso de uma pilha dinâmica. Implementada com o uso da estrutura de uma lista encadeada circular, proveniente da classe *ListaEncadeada*. 
Contém os atributos:
- topo (_Tipo Nó. Marca o topo da pilha._) 
- dados (_Tipo ListaEncadeada. Contém os dados da pilha._)

Contém os métodos:
- adicionar(id_sol, desc, data_hora) (_Não tem retorno. Recebe 3 Strings, estas sendo: Id da solicitação, descrição da solicitação, e um timestamp. Esses parâmetros serão inseridos a um novo nó no topo da pilha._)
- remover() (_Retorna um Elemento. Sem parâmetros. Irá remover o nó no topo da pilha e retornar seus dados, que estão contidos em um objeto Elemento._)
- vazia() (_Retorna boolean. Sem parâmetros. Verifica se a pilha está vazia e retorna o resultado._)
- imprimir(debug) (Não tem retorno. Recebe um boolean debug. Imprime a pilha, se debug tiver valor verdadeiro, imprimirá os dados dentro dos atributos também.)


#### *ListaEncadeada.java*

A lista encadeada simples circular que provém o funcionamento das classes _Pilha_hist_ e _Fila_atend_ por debaixo do capô. Genérica, compatível com as duas.
Ela contém uma classe interna _No_. Essa tem os atributos:
- dados (_Tipo Elemento. Contém os dados do nó_)
- proximo (_Tipo No. Aponta para o próximo nó na lista._)

O funcionamento da lista é baseada nessa classe interna.

Agora, se referindo à classe _ListaEncadeada_ em si...
Contém o atributo:
- cabeca (_Tipo Nó. Marca a cabeça da fila._)

Contém os métodos:
- inserir(dado1, dado2, dado3) (_Não tem retorno. Recebe 3 Strings, estas sendo os 3 dados que o Elemento dentro de um No carrega. Esses parâmetros serão inseridos a um novo nó no final da lista._)
- remover(pos) (_Sem retorno. Recebe um parâmetro int que indica a posição do nó a ser removido. Irá remover o nó na posição escolhida._)
- imprimir(nome1, nome2, nome3) (_Não tem retorno. Recebe 3 Strings, que serão os nomes dos dados a serem impridos. Imprime a lista._)

#### *Elemento.java*

Estrutura auxiliar. Seu único objetivo é conter 3 Strings. Utilizado no atributo _dados_ da classe _No_.

Contém os atributos:
- dado1 (_Tipo String. Contém dados em uma String._)
- dado2 (_Tipo String. Contém dados em uma String._)
- dado3 (_Tipo String. Contém dados em uma String._)

Contém métodos getters e setters.

#### *Main.java*

Classe que contém o main. Os testes das classes serão realizados aqui.

## Instruções:

Dentro do arquivo *Main.java*, há testes para as duas implementações. Tem suficientes comentários e impressões tal que basta rodar ele e observar a output no terminal.
