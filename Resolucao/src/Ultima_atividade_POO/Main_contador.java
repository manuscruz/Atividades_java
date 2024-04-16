package Ultima_atividade_POO;

import java.util.Scanner;

public class Main_contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();

        int opcao;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Incrementar");
            System.out.println("2. Retornar valor atual");
            System.out.println("3. Zerar contador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contador.incremantar();
                    System.out.println("Contador incrementado. Novo valor: " + contador.retornar());
                    break;
                case 2:
                    System.out.println("Valor atual do contador: " + contador.retornar());
                    break;
                case 3:
                    contador.zerar();
                    System.out.println("Contador zerado.");
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    return; // Sai do método main e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
