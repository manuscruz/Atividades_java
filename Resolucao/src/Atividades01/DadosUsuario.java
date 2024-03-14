package Atividades01;
import java.util.Scanner;
public class DadosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite seu Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("\nDados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        scanner.close();
    }
}
