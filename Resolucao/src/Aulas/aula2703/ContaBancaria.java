package Aulas.aula2703;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private double saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return (float) saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (valor < 0) {
            System.out.println("Valor de deposito invalido.");
        } else {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + ", saldo atual R$" + saldo);
        }
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + num_conta);
        System.out.println("Saldo: " + saldo);
    }


}
