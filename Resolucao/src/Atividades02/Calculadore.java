package Atividades02;
import java.util.Scanner;
public class Calculadore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Divisão: " + (num1 / num2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}

