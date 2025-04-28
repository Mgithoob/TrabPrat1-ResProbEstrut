// Lista encadeada circular

public class ListaEncadeada {
    No cabeca = null;

    class No {
        Elemento dados;
        No proximo;

        public No() {
            this.dados = null;
            this.proximo = null;
        }
    }

    public ListaEncadeada(){
    }

    // Insire um elemento no final da lista.
    // Retorna o nó novo
    public No inserir(String dado1, String dado2, String dado3)
    {
        No novoNo = new No();
        novoNo.dados = new Elemento(dado1, dado2, dado3);

        // Caso lista vazia
        if (cabeca == null)
        {
            cabeca = novoNo;
            cabeca.dados = novoNo.dados;
            cabeca.proximo = cabeca; // Aponta para ele mesmo

            // Caso geral
        } else {
            No atual = cabeca;

            // Chegar na cauda
            while (atual.proximo != cabeca) {
                atual = atual.proximo;
                if (atual == null) break;
            }

            // Chegando na cauda:
            atual.proximo = novoNo;
            novoNo.proximo = cabeca;

        }
        return novoNo;
    }

    // Remove um elemento da lista
    public void remover(int pos)
    {
        // Caso a lista não exista por algum motivo.
        if (cabeca == null)
        {
            System.out.println("Não é possível remover nós de uma lista vazia!");
        }
        // Nó a ser removido é o primeiro
        else if (pos == 0)
        {
            // Lista com um elemento
            if (cabeca.proximo == cabeca)
            {
                cabeca.proximo = null;
                cabeca = null;
                return;
            }
            else
            {
                // Achar cauda
                No atual = cabeca;
                while( atual.proximo != cabeca) {
                    atual = atual.proximo;
                }

                atual.proximo = cabeca.proximo;
                cabeca = atual.proximo;
                return;
            }
        }
        // Caso geral, percorre lista.
        No atual = cabeca;
        No anterior = null;
        int contador = 0;

        while ((contador <= pos) && (atual.proximo != null))
        {
            // Guardar nó anterior para apagar referência
            if (contador == (pos - 1))
            {
                anterior = atual;
            }
            // Posição desejada
            if (contador == pos)
            {
                anterior.proximo = atual.proximo;
                return;
            }

            atual = atual.proximo;
            contador++;
        }

        System.out.println("Não foi possível encontrar o elemento a ser removido!");
    }

    /*
    Imprime a lista.
    Parâmetros devem ser os nomes (String) dos dados encontrado em elemento.
     */
    public void imprimir(String nome1, String nome2, String nome3)
    {
        if (cabeca == null) {
            System.out.print("Lista vazia. Sem dados para impressão.");
            return;
        }

        No atual = cabeca;

        while ((atual != null) && (atual.proximo != cabeca))
        {
            if (cabeca == null) break;

            if(atual.dados == null) System.out.print(" |");
            else System.out.printf("%s: %s, %s: %s, %s: %s | "
                    , nome1, atual.dados.getDado1()
                    , nome2, atual.dados.getDado2()
                    , nome3, atual.dados.getDado3());
            atual = atual.proximo;

        }

        System.out.println();
    }
}