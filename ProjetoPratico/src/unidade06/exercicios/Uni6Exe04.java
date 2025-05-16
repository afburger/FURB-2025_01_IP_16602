package unidade06.exercicios;

import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {
        final int tamanho = 10;
        int vetor1[] = new int[tamanho];
        int vetor2[] = new int[tamanho];
        int vetorSoma[] = new int[tamanho];

        // Faz a leitura/preenchimento dos vetores
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe vetor1[" + i + "]: ");
            vetor1[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe vetor2[" + i + "]: ");
            vetor2[i] = teclado.nextInt();
        }
        teclado.close();

        // Executa as somas
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        // Escreve os 3 vetores
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("vetor1[" + i + "]: " + vetor1[i]);
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("vetor2[" + i + "]: " + vetor2[i]);
        }
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("vetorSoma[" + i + "]: " + vetorSoma[i]);
        }

    }
}
