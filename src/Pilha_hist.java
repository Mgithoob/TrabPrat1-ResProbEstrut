// Implementação de um histórico de solicitações
// utilizando uma pilha dinâmica que funciona internamente com uma lista encadeada circular.

public class Pilha_hist {
    ListaEncadeada.No topo; // Sempre aponta para o espaço vazio em cima do último elemento
    ListaEncadeada dados;

    public Pilha_hist()
    {
        dados = new ListaEncadeada();
        dados.inserir(null, null, null);
        topo = dados.cabeca;
    }

    // Retorna os dados do topo.
    public Elemento olharTopo() {
        if(!vazia()) {
            ListaEncadeada.No procura = dados.cabeca;

            // Iterar a lista até chegar ao anterior do topo
            while (procura.proximo != topo) {
                procura = procura.proximo;
            }
            return procura.dados;
        }

        System.out.println("A pilha está vazia. Não é possível olhar o topo.");
        return null;
    }

    // Adicionar solicitação ao topo da pilha
    public void adicionar(String id_sol, String desc, String data_hora) {
        topo.dados = new Elemento(id_sol, desc, data_hora);
        dados.inserir(null, null, null);
        topo = topo.proximo;
    }

    // Retirar solicitação no topo da pilha
    // Deve retornar String anterior ao topo.dados
    public Elemento remover() {
        if (!vazia()){
            ListaEncadeada.No procura = dados.cabeca;
            Elemento e;

            // Caso o elemento a ser removido seja o primeiro.
            if (procura.proximo == topo){
                e = procura.dados;

                dados.remover(0);
                dados = new ListaEncadeada();
                // Usando 0 para representar vazio.
                dados.inserir(null, null, null);
                topo = dados.cabeca;

                return e;
            }
            // Caso comum. Pilha de qualquer tamanho.
            ListaEncadeada.No anterior = procura;
            int pos = 0;

            // Iterar a lista até chegar ao anterior do topo
            while (procura.proximo != topo) {
                // Guardar anterior do anterior do topo
                if (procura.proximo.proximo == topo) anterior = procura;

                procura = procura.proximo;
                pos ++;
            }

            // Procura foi finalizada
            e = procura.dados;
            this.dados.remover(pos);

            // Atualizar topo para o nó antes do nó removido.
            topo = anterior.proximo;
            return e;
        }

        System.out.println("A pilha está vazia. Não é possível retirar elementos.");
        return null;
    }

    // Verifica se pilha está vazia.
    private boolean vazia(){
        ListaEncadeada.No procura = dados.cabeca;
        // Se o topo for a primeira posição, estará vazia
        return (procura == topo);
    }

    public void imprimir(boolean debug)
    {
        if (vazia()) System.out.print("vazia |\n");
        else dados.imprimir("ID da sol.", "Desc", "Data hora");

        // Se estiver no comportamento esperado, sempre irá imprimir null.
        if (debug && (topo != null)) System.out.printf("ID do topo: %s\n\n", topo.dados.getDado1() );
    }
}
