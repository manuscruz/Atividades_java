package Ultima_atividade_POO;

public class Contador {
    private int valor;

    //construtor
    public Contador() {
        this.valor = 0;
    }

    // Método Zerar
    public void zerar() {
        this.valor = 0;
    }

    //Metodo incrementar
    public void incremantar() {
        this.valor++;
    }

    // Método retornar
    public int retornar() {
        return this.valor;
    }


}
