package Atividade03;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("A tabuada de "+num+" :");
        for(int i = 1; i <=10; i++){
            int resultado = (num * i);
            System.out.println(num + " x "+i+ " = "+resultado);
        }
    }
}
