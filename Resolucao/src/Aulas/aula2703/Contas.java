package Aulas.aula2703;

import java.util.Scanner;

public class Contas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da conta:");
        System.out.println("Cliente: ");
        String cliente = scanner.nextLine();
        System.out.println("Numero da conta: ");
        int num_conta = scanner.nextInt();
        float saldo = saldo;
        float  limiteEspecial= limite;

        Contapoupanca contaPoupanca = null;
        ContaEspecial contaEspecial = null;
        ContaBancaria contaBancaria = new ContaBancaria(cliente, num_conta, saldo);

        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu =====");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Criar conta especial");
            System.out.println("4. Saldo mais rendimentos");
            System.out.println("5. Mostrar dados da conta");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a sacar: ");
                    float valorSaque = scanner.nextFloat();
                    contaBancaria.sacar(valorSaque);
                    break;
                case 2:
                    System.out.println("Informe o valor a depositar: ");
                    float valorDeposito = scanner.nextFloat();
                    contaBancaria.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Informe o limite especial que deseja: ");
                    limiteEspecial = scanner.nextFloat();
                    contaEspecial = new ContaEspecial(cliente, num_conta, saldo, limiteEspecial);
                    System.out.println("Conta especial criada com sucesso no valor de: R$" + limiteEspecial);
                    break;
                case 4:
                    if (contaPoupanca != null) {
                        contaPoupanca.calcularNovoSaldo();
                    } else {
                        System.out.println("Sem saldo!");
                    }
                    break;

                case 5:
                    if (contaEspecial != null) {
                        contaEspecial.mostrarDados();
                    } else {
                        contaBancaria.mostrarDados();
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();

    }
}
