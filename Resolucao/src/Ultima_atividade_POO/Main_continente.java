package Ultima_atividade_POO;

import java.util.Scanner;

public class Main_continente {
    public static void main(String[] args) {

        Pais portugal = new Pais("Portugal", 92090, 10295909);
        Pais espanha = new Pais("Espanha", 505990, 46733038);
        Pais franca = new Pais("França", 551695, 67059887);
        Pais alemanha = new Pais("Alemanha", 357022, 83166711);
        Pais italia = new Pais("Itália", 301340, 60483973);

        Continente europa = new Continente("Europa");

        europa.adicionarPais(portugal);
        europa.adicionarPais(espanha);
        europa.adicionarPais(franca);
        europa.adicionarPais(alemanha);
        europa.adicionarPais(italia);

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== Continente Europeu ===");
            System.out.println("1. Dimensão total do continente");
            System.out.println("2. População total do continente");
            System.out.println("3. Densidade populacional do continente");
            System.out.println("4. País com maior população");
            System.out.println("5. País com menor população");
            System.out.println("6. País com maior dimensão territorial");
            System.out.println("7. País com menor dimensão territorial");
            System.out.println("8. Razão territorial (maior país / menor país)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Dimensão total do continente: " + europa.getDimensaoTotal() + " km²");
                    break;
                case 2:
                    System.out.println("População total do continente: " + europa.getPopulacaoTotal());
                    break;
                case 3:
                    System.out.println("Densidade populacional do continente: " + europa.getDensidadePopulacional() + " hab/km²");
                    break;
                case 4:
                    Pais paisMaiorPopulacao = europa.getPaisMaiorPopulacao();
                    System.out.println("País com maior população: " + paisMaiorPopulacao.getNome() + " - População: " + paisMaiorPopulacao.getPopulacao());
                    break;
                case 5:
                    Pais paisMenorPopulacao = europa.getPaisMenorPopulacao();
                    System.out.println("País com menor população: " + paisMenorPopulacao.getNome() + " - População: " + paisMenorPopulacao.getPopulacao());
                    break;
                case 6:
                    Pais paisMaiorDimensao = europa.getPaisMaiorDimensao();
                    System.out.println("País com maior dimensão territorial: " + paisMaiorDimensao.getNome() + " - Dimensão: " + paisMaiorDimensao.getDimensao() + " km²");
                    break;
                case 7:
                    Pais paisMenorDimensao = europa.getPaisMenorDimensao();
                    System.out.println("País com menor dimensão territorial: " + paisMenorDimensao.getNome() + " - Dimensão: " + paisMenorDimensao.getDimensao() + " km²");
                    break;
                case 8:
                    System.out.println("Razão territorial (maior país / menor país): " + europa.getRazaoTerritorial());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}