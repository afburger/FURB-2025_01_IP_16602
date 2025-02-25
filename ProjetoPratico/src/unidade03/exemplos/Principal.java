package unidade03.exemplos;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        int idade = 17;
        final int maiorIdade = 18;
        //System.out.println("Informe sua idade!");
        idade = 18;

        // char letra;
        // char caractere;

        char letra, caractere;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = teclado.next();

        System.out.println(nome);

    }

}
