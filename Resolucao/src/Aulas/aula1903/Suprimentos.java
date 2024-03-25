package Aulas.aula1903;

public class Suprimentos {
    private int item;
    private String descricao;
    private int quantidade;
    private double precoUni;

    //construtor
    public Suprimentos(int item, String caderno, int quantidade, double precoUni){

        this.item = item;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0)? quantidade : 0;
        this.precoUni = (precoUni > 0.0)? precoUni : 0;

    }

    public int getItem(){
        return item;
    }
    public  void setItem(int item){
        this.item = item;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = (quantidade > 0)? quantidade : 0;
    }

    public double getPrecoUni(){
        return precoUni;
    }
    public void setPrecoUni(double precoUni){
        this.precoUni = (precoUni > 0.0)? precoUni : 0;
    }

    public double getfatura(){
        return quantidade * precoUni;
    }
}


