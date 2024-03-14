package Atividades02;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorFinal;
        if (valorCompra > 200) {
            valorFinal = valorCompra * 0.9;
            System.out.println("Desconto de 10% aplicado.");
        } else if (valorCompra >= 100 && valorCompra <= 200) {
            valorFinal = valorCompra * 0.95;
            System.out.println("Desconto de 5% aplicado.");
        } else {
            valorFinal = valorCompra;
            System.out.println("Sem desconto aplicado.");
        }
        System.out.println("Valor final a ser pago: R$ " + valorFinal);

        scanner.close();
    }
}
