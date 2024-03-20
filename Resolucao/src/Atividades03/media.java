package Atividades03;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int numero;

        System.out.println("Digite números inteiros positivos ou digite um número negativo para encerrar: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            quantidade++;

            numero = scanner.nextInt();
        }
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número inserido.");
        }

        scanner.close();
    }
}
