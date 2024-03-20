package Atividades03;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true; // Inicializa a variável para continuar operando
        while (continuar) { // Loop para continuar operando até que o usuário decida sair
            System.out.println("Digite um inteiro positivo: ");
            double numero = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("\n===== Calculadora =====");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int operacao = scanner.nextInt();

            double resultado;

            switch (operacao) {
                case 1:
                    resultado = numero + numero2;
                    System.out.println("A soma dos dois números é: " + resultado);
                    break;
                case 2:
                    resultado = numero - numero2;
                    System.out.println("A subtração dos dois números é: " + resultado);
                    break;
                case 3:
                    resultado = numero * numero2;
                    System.out.println("A multiplicação dos dois números é: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero / numero2;
                        System.out.println("A divisão entre os dois números é: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5:
                    continuar = false; // Define a variável continuar como false para sair do loop
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

            if (continuar) {
                System.out.println("Deseja continuar? (S/N)");
                //Para ler uma entrada do usuário como uma string, converter para minúsculas e, em seguida, obter o primeiro caractere. Isso permite que o usuário insira "S" ou "s" para continuar e "N" ou "n" para sair.
                char resposta = scanner.next().toLowerCase().charAt(0);
                continuar = (resposta == 's');
            }

        }
        System.out.println("Encerrando a calculadora.");
    }
}