package unidade05.exemplos;

import java.util.Scanner;

public class ExemploWhile002 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String mensagem1 = "Informe a quantidade de vezes que deseja somar:";
        System.out.println(mensagem1);

        int qtdOperacoes = teclado.nextInt();
        int contador = 1;

        while (contador <= qtdOperacoes) {
            System.out.println("Informar o numero 1");
            int numero1 = teclado.nextInt();
            
            System.out.println("Informar o numero 2");
            int numero2 = teclado.nextInt();
            
            System.out.println("Resultado da soma:" + (numero1 + numero2));
            contador++;
        }

        teclado.close();
    }

}
