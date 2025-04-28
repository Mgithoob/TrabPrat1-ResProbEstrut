// Estrutura auxiliar genérica. Contém três Strings: dado1, dado2, dado3.
public class Elemento {
    private String dado1;
    private String dado2;
    private String dado3;

    public Elemento(String dado1, String dado2, String dado3) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.dado3 = dado3;
    }

    public String getDado1() {
        return dado1;
    }

    public void setDado1(String dado1) {
        this.dado1 = dado1;
    }

    public String getDado2() {
        return dado2;
    }

    public void setDado2(String dado2) {
        this.dado2 = dado2;
    }

    public String getDado3() {
        return dado3;
    }

    public void setDado3(String dado3) {
        this.dado3 = dado3;
    }
}
