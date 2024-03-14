package Aulas;

import java.util.Random;
import java.util.Scanner;
public class treino {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0,chances = 5, numerodasorte = random.nextInt(10)+1;
        System.out.println("Vamos iniciar o jogo");
        System.out.println("Você deve acertar o numero que o robo está pensando. Você tem 5 chances.");

        while(chances > 0){
            System.out.println("Digite um numero, vamos ver se voce acerta.");
            palpite = leitura.nextInt();

            if(palpite == numerodasorte){
                System.out.println("Parabéns você acertou.");
                break;
            }else{
                System.out.println("Tente novamente!");
                chances--;
            }if(chances > 0){
                System.out.println("Errou, Você ainda tem " +chances +" chances");
                if(palpite > numerodasorte){
                    System.out.println("Tente um número menor");
                }else {
                    System.out.println("Tente um número maior");
                }
            }else {
                System.out.println("Acabou suas chances");
            }
        }
    }
}