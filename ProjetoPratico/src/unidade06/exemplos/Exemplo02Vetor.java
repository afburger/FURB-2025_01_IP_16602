package unidade06.exemplos;

import java.util.Scanner;

public class Exemplo02Vetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantos nomes você deseja informar");
        int qtdNomes = teclado.nextInt();

        String[] nomes = new String[qtdNomes];

        for (int idx = 0; idx < nomes.length; idx++) {
            System.out.println("Informe um nome para a posição[" + idx + "]:");
            String nome = teclado.next();
            nomes[idx] = nome;
        }

        System.out.println("----- separador 1 -----");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("----- separador 2 -----");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
