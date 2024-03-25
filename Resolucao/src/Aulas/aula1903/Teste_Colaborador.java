package Aulas.aula1903;

import java.util.Scanner;

public class Teste_Colaborador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome do colaborador: ");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome do colaborador: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o salário do colaborador: ");
        double salario = scanner.nextDouble();

        Colaborador colaborador1 = new Colaborador(nome, sobrenome, salario);

        System.out.println("Digite o primeiro nome do segundo colaborador: ");
        String nome2 = scanner.next();

        System.out.println("Digite o sobrenome do segundo colaborador: ");
        String sobrenome2 = scanner.next();

        System.out.println("Digite o salário do segundo colaborador: ");
        double salario2 = scanner.nextDouble();

        Colaborador colaborador2 = new Colaborador(nome2, sobrenome2, salario2);

        System.out.println("Salário anual de "+ colaborador1.getNome()+": $"+colaborador1.salarioAnual());
        System.out.println("Salário anual de "+ colaborador2.getNome()+": $"+colaborador2.salarioAnual());

        System.out.println("Digite o percentual de aumento desejado: ");
        double aumento = scanner.nextDouble();

        colaborador1.aumento(aumento);
        colaborador2.aumento(aumento);

        System.out.println("Aumento solicitado foi de "+aumento+"%");
        System.out.println("Salário Anual"+ colaborador1.getNome()+" após o aumento será de: $"+colaborador1.salarioAnual());
        System.out.println("Salário Anual"+ colaborador2.getNome()+" após o aumento será de: $"+colaborador2.salarioAnual());
    }
}
