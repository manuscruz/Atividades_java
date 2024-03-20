package Atividades03;

import java.util.Scanner;

public class numPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é primo.");
        } else {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }

        }
    }
