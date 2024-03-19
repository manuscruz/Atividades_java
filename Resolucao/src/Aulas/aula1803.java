package Aulas;
import java.util.ArrayList;
import java.util.Scanner;
public class aula1803 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Declarando o array
        ArrayList<String> listadenomes = new ArrayList<>();


        //Adicionando valores para o array  (elementos)
        listadenomes.add("Rafael");
        listadenomes.add("Jéssica");
        listadenomes.add("Érica");


        //Mostrar os valores do Array (Elementos)
        System.out.println("Lista de nomes " + listadenomes);


        //Acessando o elemento por indice
        String nome1 = listadenomes.get(0);
        System.out.println("Primeiro Elemento "+ nome1);


        //Mostrando array inteiro
        System.out.println("Mostrando todos os elementos");
        for (String nome : listadenomes){
            System.out.println(nome);
        }


        //Remover um elemtno
        listadenomes.remove(2);


        //Mostrando novamente
        System.out.println("Mostrando com elementro excluido");
        for (String nome : listadenomes){
            System.out.println(nome);
        }
    }
}

