// Implementação de uam fila de clientes implementada
// utilizando estrutura de dados de uma fila dinâmica implementada com lista encadeada circular.

// A última posição da fila estará sempre vazia.
public class Fila_atend {
    ListaEncadeada.No frente;
    ListaEncadeada.No tras;

    ListaEncadeada dados;

    public Fila_atend() {
        dados = new ListaEncadeada();
        dados.inserir(null, null, null);
        frente = dados.cabeca;
        tras = frente;
        frente.proximo = tras;
        tras.proximo = frente;
    }

    // Adiciona um cliente ao fim da fila
    public void adicionar_cliente(String id, String nome, String motivo_atendimento){

        // Se a fila estiver vazia
        if (vazia()){
            dados = new ListaEncadeada();
            dados.inserir(null, null, null);
            frente = dados.cabeca;
            tras = frente;
            frente.proximo = tras;
            tras.proximo = frente;

            // Inserir dados no único nó
            frente.dados = new Elemento(id, nome, motivo_atendimento);
            // Novo nó é criado e atribuído a trás
            tras = dados.inserir(null, null, null);

            // Atualizar pointers
            tras.proximo = frente;
            frente.proximo = tras;

        } else {
            // Caso genérico. A fila não está vazia.

            // Inserir dados no final
            tras.dados = new Elemento(id, nome, motivo_atendimento);
            // Novo nó é criado e colocado no fim da fila.
            tras.proximo = dados.inserir(null, null, null);
            tras = tras.proximo;

            // Atualizar pointers
            tras.proximo = frente;
        }
    }

    // Retira o cliente do começo da fila.
    public Elemento atender(){
        // Se a fila estiver vazia...
        if (vazia()) {
            System.out.println("Não é possível atender! Todos os clientes já foram atendidos!");
            return null;
        }
        else {
            // Se tiver apenas um cliente na fila...
            if (frente.proximo == tras) {
                ListaEncadeada.No apagar = tras;
                Elemento e = frente.dados;

                // Atualizar pointers
                frente = tras;
                frente.proximo = tras;
                tras.proximo = frente;

                apagar.proximo = null;
                apagar = null;

                return e;
            } else {
                ListaEncadeada.No apagar = frente;
                Elemento e = frente.dados;

                // Atualizar pointers
                frente = frente.proximo;
                tras.proximo = frente;

                apagar.proximo = null;
                apagar = null;

                return e;
            }
        }
    }

    // Verifica se a fila está vazia
    public boolean vazia() {
        return (frente == tras);
    }

    public void imprimir(boolean debug)
    {
        // Caso fila vazia
        if (vazia()) System.out.print("vazio |");
        else
        {
            // Se a fila não estiver vazia. Caso comum.
            ListaEncadeada.No iterador = frente;

            if (iterador != null)
            {
                while(iterador.proximo != frente && iterador != null)
                {

                    if(iterador.dados == null) System.out.print(" |");
                    else System.out.printf("ID: %s, Nome: %s, Motivo de atendimento: %s | "
                            , iterador.dados.getDado1()
                            , iterador.dados.getDado2()
                            , iterador.dados.getDado3());
                    iterador = iterador.proximo;
                }
            } else {
                System.out.print("vazia |");
            }
        }

        System.out.println();

        if (debug){
            if (frente.dados != null) System.out.printf("ID primeiro cliente: %s", frente.dados.getDado1());
            else System.out.print("ID primeiro cliente: null");

            // Se estiver no comportamento esperado, sempre irá imprimir null.
            if (tras.dados != null) System.out.printf(", ID último cliente: %s\n\n", tras.dados.getDado2());
            else System.out.print(", ID último cliente: null\n\n");
        }
    }
}
