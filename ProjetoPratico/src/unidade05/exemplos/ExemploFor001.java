package unidade05.exemplos;

import java.util.Scanner;

public class ExemploFor001 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantiade de vezes que deseja executar:");

        int execucoes = teclado.nextInt();

        for (int i = 1; i <= execucoes; i++) {
            System.out.println("Informe um nome com letras minusculas:");
            String nome = teclado.next();
            System.out.println("Nome em letras maíusculas: " + nome.toUpperCase());
        }

        teclado.close();

        System.out.println("Fim da aplicação");

    }

}
