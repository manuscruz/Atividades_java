package Atividades01;
import java.util.Scanner;
public class CadastroUsuário {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o mês do seu nascimento (1 a 12): ");
        int mesNascimento = scanner.nextInt();
        int anoAtual = 2024;
        int mesAtual = 3;
        int anoNascimento = anoAtual - idade;
        if (mesNascimento > mesAtual) {
            --anoNascimento;
        }

        System.out.println(nome + " nasceu no ano de " + anoNascimento);
        scanner.close();
    }
}
