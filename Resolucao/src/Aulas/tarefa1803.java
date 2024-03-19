package Aulas;

import java.util.Scanner;

public class tarefa1803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[100];
        int tarefasTotal = 0;

        while (true) {
            menu();

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionar(tarefas, tarefasTotal);
                    tarefasTotal++;
                    break;
                case 2:
                    remover(tarefas, tarefasTotal);
                    tarefasTotal--;
                    break;
                case 3:
                    listar(tarefas, tarefasTotal);
                    break;
                case 4:
                    System.out.println("Finalizando o programa.");
                    return;
                default:
                    System.out.println("Opção invalida!");
            }
        }

    }

    public static void menu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Adicionar nova tarefa");
        System.out.println("2. Remover tarefa existente");
        System.out.println("3. Listar todas as tarefas pendentes");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

    }

    public static void adicionar(String[] tarefas, int tarefasTotal) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova tarefa: ");
        String novaTarefa = scanner.nextLine();
        tarefas[tarefasTotal] = novaTarefa;
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void remover(String[] tarefas, int tarefaTotal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefaTotal; i++) {
            System.out.println((i + 1) + ". " + tarefas[i]);
        }
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int indice = scanner.nextInt() - 1;
        if (indice >= 0 && indice < tarefaTotal) {
            System.out.println("Tarefa '" + tarefas[indice] + "' removida com sucesso!");
            for (int i = indice; i < tarefaTotal - 1; i++) {
                tarefas[i] = tarefas[i + 1];
            }
        } else {
            System.out.println("Índice inválido!");
        }


    }

    public static void listar(String[] tarefas, int totalTarefas) {
        System.out.println("\nLista de Tarefas:");
        if (totalTarefas == 0) {
            System.out.println("Nenhuma tarefa pendente.");
        } else {
            for (int i = 0; i < totalTarefas; i++) {
                System.out.println((i + 1) + ". " + tarefas[i]);

            }
        }
    }
}