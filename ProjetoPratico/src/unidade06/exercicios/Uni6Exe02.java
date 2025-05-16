package unidade06.exercicios;

import java.util.Scanner;

public class Uni6Exe02 {

    public static void main(String[] args) {
        double vetor[] = new double[12];

        // Faz o preenchimento do vetor (Leitura).
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();

        // Faz o cálculo da média
        double vetorSoma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetorSoma += vetor[i];
        }
        double media = vetorSoma / vetor.length;
        System.out.println("Média: " + media);
        // Escreve os valores maiores que a média.
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Vetor[" + i + "]: " + vetor[i]);
            }
        }
    }
}
