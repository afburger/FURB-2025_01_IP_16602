package unidade03.exercicios;

import java.util.Scanner;

/**
 * Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
 * Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
 * e imprima o valor a pagar. 
 * O peso do prato é de 750 gramas.
 * 
 * Exemplos de entrada				Exemplos de saída
 * 2.42								O valor do prato do cliente é R$41,75
 * 1.77								O valor do prato do cliente é R$25,50
 */
public class Uni3Exe06 {

	public static void main(String[] args) {
		final double valorKg = 25.0;
		final double tara = 0.750;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o peso do prato:");
		double pesoPrato = teclado.nextDouble();

		teclado.close();

		double valorPrato = (pesoPrato - tara) * valorKg;

		System.out.println("O valor do prato do cliente é R$ " + valorPrato);
	}
}
