package Atividades03;

import java.util.Random;
import java.util.Scanner;

public class adivinhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite;

        System.out.println("Tente acertar o número escolhido");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;
            
            if (palpite == numeroSecreto){
                System.out.println("Você acertou em "+ tentativa+" tentativas!!");
                break;
            }else if(palpite < numeroSecreto){
                System.out.println("O número secreto é maior que "+palpite);

            }else {
                System.out.println("O número secreto é menor que " + palpite + ".");
            }
        }


    }

}
