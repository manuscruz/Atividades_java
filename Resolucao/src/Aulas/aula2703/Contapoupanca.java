package Aulas.aula2703;

public class Contapoupanca extends ContaBancaria {
    private double diaRendimento;

    public Contapoupanca(String cliente, int num_conta, float saldo) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = 0.10; // taxa de rendimento
    }
    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        if (getSaldo() <= 0) {
            System.out.println("Não há saldo.");
        } else {
            double novoSaldo = getSaldo() * (1 + diaRendimento);
            setSaldo((float) novoSaldo);
            System.out.println("Novo saldo após rendimento: " + novoSaldo);
        }
    }
}