package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe04.java - Faça um programa para ler os valores de 
 * dois vetores de inteiros, 
 * cada um contendo 10 elementos. 
 * Crie um terceiro vetor em que cada elemento é a soma dos valores contidos 
 * nas posições respectivas dos vetores originais. 
 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. 
 * Exiba, ao final, os três vetores na tela. 
 * Faça três métodos: um método para ler valores dos vetores, 
 * outro para somar e outro para escrever os vetores.
 */
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
