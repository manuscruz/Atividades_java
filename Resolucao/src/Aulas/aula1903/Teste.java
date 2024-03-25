package Aulas.aula1903;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //Suprimentos suprimentos1 = new Suprimentos(1, "Caderno", 28, 19.50);
        //System.out.println("Valor da sua fatura é: $" +suprimentos1.getfatura());
    //}
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do Item: ");
        int item = scanner.nextInt();

        System.out.println("Digite a descrição do produto: ");
        String descricao = scanner.next();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço do item: ");
        double precoUni = scanner.nextDouble();

        Suprimentos suprimentos1 = new Suprimentos(item, descricao, quantidade, precoUni);
        System.out.println("O valor da compra é: "+ suprimentos1.getfatura());

        scanner.close();
    }





}
