package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe03.java - Descreva um algoritmo que leia 12 valores reais 
 * e os coloque em um vetor de 12 posições do tipo real. 
 * Em seguida, modifique o vetor de modo que 
 * os valores das posições ímpares sejam aumentados em 5% 
 * e os das posições pares sejam aumentados em 2%. 
 * Imprima o vetor resultante. Faça um método para ler os valores, 
 * outro para ajustar os valores dentro do vetor 
 * e outro para escrever os valores atualizados do vetor.
 */
public class Uni6Exe03 {

    public static void main(String[] args) {
        double vetor[] = new double[12];

        // Faz a leitura dos dados e preenchimento do vetor.
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();

        // Ajusta os valores
        for (int i = 1; i < vetor.length; i += 2) { // posições ímpares 1,3,5,..,9,11
            vetor[i] += vetor[i] * 0.05;
        }
        for (int i = 0; i < vetor.length; i += 2) { // posições pares 0,2,4,..,10,12
            vetor[i] += vetor[i] * 0.02;
        }

        // Imprime o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" vetor[" + i + "]: " + vetor[i]);
        }
    }
}
