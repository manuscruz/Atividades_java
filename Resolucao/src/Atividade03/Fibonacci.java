package Atividade03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anterior = 0;
        int atual = 1;

        System.out.println("Segue os primeiros 20 números da sequência de Fibonacci:");
        System.out.println(anterior +" "+ atual+ " ");

        for(int i =2;i < 20; i++){
            int proximo = anterior + atual;
            System.out.println(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
    }
}
