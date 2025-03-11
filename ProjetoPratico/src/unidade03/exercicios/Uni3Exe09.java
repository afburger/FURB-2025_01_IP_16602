package unidade03.exercicios;

import java.util.Scanner;

/**
 * Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
 * 
 * Exemplos de entrada					Exemplos de saída
 * Raio: 6
 * Altura: 10							O volume da lata de óleo é: 1130,97
 * 
 * Raio: 12
 * Altura: 12							O volume da lata de óleo é: 5428,67
 * 
 */
public class Uni3Exe09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o raio da lata em cm:");
		double raio = teclado.nextDouble();

		System.out.println("Informe a altura da lata em cm:");
		double altura = teclado.nextDouble();

		teclado.close();

		double volume = Math.PI * Math.pow(raio, 2) * altura; 

		System.out.println("O volume da lata de óleo é: " + volume);
	}
}
