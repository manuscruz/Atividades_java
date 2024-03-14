package Atividades01;

public class Media {
    public static void main(String[] args) {
    int num1 = 8;
    int num2 = 9;
    int num3 = 7;
    double media1 = (double)(num1 + num2 + num3) / 3.0;
    System.out.println("Média dos números 8, 9 e 7: " + media1);
    int num4 = 4;
    int num5 = 5;
    int num6 = 6;
    double media2 = (double)(num4 + num5 + num6) / 3.0;
    System.out.println("Média dos números 4, 5 e 6: " + media2);
    double soma = media1 + media2;
    System.out.println("Soma das duas médias: " + soma);
    double mediaFinal = soma / 2.0;
    System.out.println("Média das médias: " + mediaFinal);
    }
}
