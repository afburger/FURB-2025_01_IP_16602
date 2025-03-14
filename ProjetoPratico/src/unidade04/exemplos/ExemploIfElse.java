package unidade04.exemplos;

import java.util.Scanner;

public class ExemploIfElse {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa:");

        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Já pode tirar a CNH");
        } else {
            System.out.println("Precisa pedir um uber ou pegar o busão!");
        }

        System.out.println("Fim da aplicação!");

    }

}
