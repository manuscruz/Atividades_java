package Atividades03;

import java.util.ArrayList;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaDeCompras = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o item que deseja adicionar à lista de compras (ou 'sair' para encerrar): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("sair")) {
                continuar = false;
                exibirListaDeCompras(listaDeCompras);
                System.out.println("Encerrando o programa...");
            } else {
                listaDeCompras.add(item);
                System.out.println("Item adicionado à lista de compras: " + item);
                exibirListaDeCompras(listaDeCompras);
            }
        }


    }
    // Método para exibir a lista de compras atualizada
    public static void exibirListaDeCompras(ArrayList<String> lista) {
        System.out.println("Lista de compras:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
        System.out.println();
    }

}
