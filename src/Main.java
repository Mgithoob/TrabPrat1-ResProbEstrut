public class Main {
    public static void main(String[] args) {

        // Testes para a fila de atendimento.
        System.out.println("---- TESTES: Fila de atendimento:\n");
        Fila_atend f = new Fila_atend();

        System.out.println("Adicionando clientes...");
        f.adicionar_cliente("CLI001", "Maria Silva", "Dúvida sobre produto");
        f.imprimir(true);
        f.adicionar_cliente("CLI002", "João Souza", "Reclamação de serviço");
        f.imprimir(true);
        f.adicionar_cliente("CLI003", "Ana Costa", "Solicitação de reembolso");
        f.imprimir(true);

        // ------------------------------------------------------------------------------
        System.out.println("Atendendo clientes...");
        Elemento e; String nome;

        e = f.atender();
        if (e == null) nome = "Não houve atendimento.";
        else nome = e.getDado2();

        System.out.printf("Nome do cliente atendido: %s\n", nome);
        System.out.println("Estado da fila: ");
        f.imprimir(true);

        e = f.atender();
        if (e == null) nome = "Não houve atendimento.";
        else nome = e.getDado2();

        System.out.printf("Nome do cliente atendido: %s\n", nome);
        System.out.println("Estado da fila: ");
        f.imprimir(true);

        e = f.atender();
        if (e == null) nome = "Não houve atendimento.";
        else nome = e.getDado2();

        System.out.printf("Nome do cliente atendido: %s\n", nome);
        System.out.println("Estado da fila: ");
        f.imprimir(true);

        e = f.atender();
        if (e == null) nome = "Não houve atendimento.";
        else nome = e.getDado2();

        System.out.printf("Nome do cliente atendido: %s\n", nome);
        System.out.println("Estado da fila: ");
        f.imprimir(true);

        // ------------------------------------------------------------------------------
        System.out.println("Adicionando os clientes restantes...");

        f.adicionar_cliente("CLI004", "Pedro Alves", "Informações de entrega");
        f.imprimir(true);
        f.adicionar_cliente("CLI005", "Carla Dias", "Agendamento de visita");
        f.imprimir(true);
        f.adicionar_cliente("CLI006", "Lucas Martins", "Alteração de pedido");
        f.imprimir(true);
        f.adicionar_cliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato");
        f.imprimir(true);
        f.adicionar_cliente("CLI008", "Rafael Lima", "Renovação de assinatura");
        f.imprimir(true);
        f.adicionar_cliente("CLI009", "Fernanda Gomes", "Suporte para instalação");
        f.imprimir(true);
        f.adicionar_cliente("CLI010", "Carlos Eduardo", "Pedido de orçamento");
        f.imprimir(true);

        // ------------------------------------------------------------------------------
        // Testes para a pilha histórico de solicitações
        System.out.println("---- TESTES: Pilha de histórico:\n");
        Pilha_hist p = new Pilha_hist();

        System.out.println("Adicionando solicitações...");
        p.adicionar("REQ001", "Instalação de software", "2024-08-20 10:30");
        p.imprimir(false);
        p.adicionar("REQ002", "Manutenção preventiva", "2024-08-20 11:00");
        p.imprimir(false);
        p.adicionar("REQ003", "Atualização de sistema", "2024-08-20 11:30");
        p.imprimir(false);

        // ------------------------------------------------------------------------------
        System.out.println("\nRemovendo solicitações...");

        e = p.remover();
        if (e == null) nome = "Não houve remoção.";
        else nome = e.getDado2();

        System.out.printf("Descrição da solicitação removida: %s\n", nome);
        System.out.println("Estado da pilha: ");
        p.imprimir(true);

        e = p.remover();
        if (e == null) nome = "Não houve remoção.";
        else nome = e.getDado2();

        System.out.printf("Descrição da solicitação removida: %s\n", nome);
        System.out.println("Estado da pilha: ");
        p.imprimir(true);

        e = p.remover();
        if (e == null) nome = "Não houve remoção.";
        else nome = e.getDado2();

        System.out.printf("Descrição da solicitação removida: %s\n", nome);
        System.out.println("Estado da pilha: ");
        p.imprimir(true);

        e = p.remover();
        if (e == null) nome = "Não houve remoção.";
        else nome = e.getDado2();

        System.out.printf("Descrição da solicitação removida: %s\n", nome);
        System.out.println("Estado da pilha: ");
        p.imprimir(true);

        // ------------------------------------------------------------------------------
        System.out.println("Adicionando as solicitações restantes...");
        p.adicionar("REQ004", "Suporte técnico", "2024-08-20 12:00");
        p.imprimir(false);
        p.adicionar("REQ005", "Troca de equipamento", "2024-08-20 12:30");
        p.imprimir(false);
        p.adicionar("REQ006", "Consulta de garantia", "2024-08-20 13:00");
        p.imprimir(false);
        p.adicionar("REQ007", "Reparo de impressora", "2024-08-20 13:30");
        p.imprimir(false);
        p.adicionar("REQ008", "Configuração de rede", "2024-08-20 14:00");
        p.imprimir(false);
        p.adicionar("REQ009", "Restauração de dados", "2024-08-20 14:30");
        p.imprimir(false);
        p.adicionar("REQ010", "Consulta técnica", "2024-08-20 15:00");
        p.imprimir(false);


        /*
        Elemento[] historico = new Elemento[] {

        new Elemento(),
        new Elemento(),
        new Elemento(),
        new Elemento(),
        new Elemento(),
        new Elemento()
};

         */
    }
}
