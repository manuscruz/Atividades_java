package Aulas.aula2703;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limiteEspecial) {
        super(cliente, num_conta, saldo);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > getSaldo() + limite){
            System.out.println("Valor excede o limite disponível.");
        }else {
            float novoSaldo = getSaldo() - valor;
            System.out.println("Saque efetuado com sucesso. Saldo atual: "+novoSaldo);
        }
    }
}
