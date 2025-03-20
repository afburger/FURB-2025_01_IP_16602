package unidade04.exemplos;

import java.util.Scanner;

/**
 * Escreva um programa que solicite ao usuário um número de 1 a 7 
 * e exiba o dia da semana correspondente. 
 * Se o usuário inserir um número fora do intervalo, 
 * exiba uma mensagem informando que a entrada é inválida.
 */
public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número de 1 a 7 para representar um dia da semana:");
        int dia = scanner.nextInt();
        String mensagem = scanner.next();

        scanner.close();

        switch (dia) {
            case 1:
                if (mensagem != null) {
                    System.out.println("Segunda-feira" + mensagem);
                } else {
                    System.out.println("Segunda-feira");
                }
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Valor inválido, informe um número entre 1 e 7");
                break;
        }
        

        

    }
}
