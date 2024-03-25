package Aulas.aula1903;

public class Colaborador {
    private String nome;
    private String sobrenome;
    private double salario;

    public Colaborador(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = (salario > 0.0)? salario: 0.0;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = (salario > 0.0)? salario: 0.0;
    }

    public void aumento(double percentual){
        salario*= (1+percentual/100);
    }

    public double salarioAnual(){
        return salario * 12;
    }
}
