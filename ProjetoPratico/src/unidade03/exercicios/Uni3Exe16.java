package unidade03.exercicios;

import java.util.Scanner;

/**
 * Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
 * Considerando que alguém está pagando uma compra, 
 * faça um programa que determine e escreva o número mínimo de notas que 
 * o caixa deve fornecer como troco. 
 * Escreva também o número de cada tipo de nota a ser fornecido como troco. 
 * Suponha que o sistema monetário não utilize centavos.
 * 
 * Exemplo de entrada								Exemplo de saída
 * Valor total da compra: 1258
 * Valor total dado pelo cliente: 1300				O número mínimo de notas de troco é: 6
 * 													Quantidade de notas de 100 necessárias é: 0
 *                                    				Quantidade de notas de 10 necessárias é: 4
 *                                   				Quantidade de notas de 1 necessárias é: 2
 */
public class Uni3Exe16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int notaCem = 100;
		final int notaDez = 10;
		final int notaUm = 1;

		System.out.println("Informe o valor da compra:");
		int valorCompra = teclado.nextInt();

		System.out.println("Informe o valor pago:");
		int valorPago = teclado.nextInt();

		teclado.close();
		
		int valorTroco = valorPago - valorCompra;

		int notas100 = valorTroco / notaCem;
		valorTroco = valorTroco - (notas100 * notaCem);

		int notas10 = valorTroco / notaDez;
		valorTroco = valorTroco - (notas10 * notaDez);

		int notas1 = valorTroco / notaUm;
		valorTroco = valorTroco - (notas1 * notaUm);

		int totalNotas = notas1 + notas10 + notas100;

		System.out.println("O número mínimo de notas de troco é: " + totalNotas);
		System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
		System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
		System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);

	}
}
