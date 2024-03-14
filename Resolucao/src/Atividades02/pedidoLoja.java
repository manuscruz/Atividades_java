package Atividades02;

import java.util.Scanner;

public class pedidoLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor total da sua compra: ");
        double valorCompra = scanner.nextDouble();

        // Aplicar descontos com base no valor da compra
        double valorFinal;
        if (valorCompra > 200) {
            // Aplicar desconto de 10%
            valorFinal = valorCompra * 0.9;
            System.out.println("Desconto de 10% aplicado.");
        } else if (valorCompra >= 100 && valorCompra <= 200) {
            // Aplicar desconto de 5%
            valorFinal = valorCompra * 0.95;
            System.out.println("Desconto de 5% aplicado.");
        } else {
            // Não aplicar desconto
            valorFinal = valorCompra;
            System.out.println("Sem desconto aplicado.");
        }

        // Exibir o valor final a ser pago
        System.out.println("Valor final a ser pago: R$ " + valorFinal);

        // Menu para escolher o método de pagamento
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Cartão de crédito");
        System.out.println("2. Boleto bancário");
        System.out.println("3. Transferência bancária");
        System.out.print("Opção: ");
        int opcaoPagamento = scanner.nextInt();

        // Processar a escolha do usuário
        switch (opcaoPagamento) {
            case 1:
                System.out.println("Pagamento efetuado com cartão de crédito.");
                break;
            case 2:
                System.out.println("Pagamento efetuado com boleto bancário.");
                break;
            case 3:
                System.out.println("Pagamento efetuado com transferência bancária.");
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }

        scanner.close();
    }
}
