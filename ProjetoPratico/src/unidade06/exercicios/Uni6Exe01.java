package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros 
 * e os coloque em um vetor de 10 posições do tipo inteiro. 
 * Escreva na ordem inversa em que foram lidos. 
 * Faça um método para ler e outro para escrever. 
 * OBSERVAÇÃO: Não utilize o Arrays.sort
 */
public class Uni6Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
            vetor[i] = teclado.nextInt();
        }

        // Escrever vetor
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }

        teclado.close();
    }

}
