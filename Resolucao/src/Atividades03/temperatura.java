package Atividades03;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit2 = scanner.nextDouble();
                    double celsius2 = fahrenheitParaCelsius(fahrenheit2);
                    System.out.println("Temperatura em Celsius: " + celsius2);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
