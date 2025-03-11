package unidade03.exercicios;

import java.util.Scanner;

/**
 * Uma granja possui um controle automatizado de cada frango da sua produção. 
 * No pé direito do frango há um anel com um chip de identificação; 
 * No pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
 * Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50.
 * Faça um programa para calcular o gasto total da granja para marcar 
 * todos os seus frangos.
 * 
 * Exemplos de entrada			Exemplos de saída
 * 625							O gasto total para marcar 625 é R$ 6875.0
 * 84							O gasto total para marcar 84 é R$ 924.0
 */
public class Uni3Exe05 {

	public static void main(String[] args) {
		final int anelChip = 1;
		final int anelAlimento = 2;
		final double valorAnelChip = 4.0;
		final double valorAnelAlimento = 3.5;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de frangos:");
		int quantidadeFrangos = teclado.nextInt();

		teclado.close();

		double gastoChipPorFrango = anelChip * valorAnelChip;
		double gastoAnelAlimentoPorFrango = anelAlimento * valorAnelAlimento;

		double totalGastoChip = gastoChipPorFrango * quantidadeFrangos;
		double totalGastoAlimento = gastoAnelAlimentoPorFrango * quantidadeFrangos;

		double total = totalGastoChip + totalGastoAlimento;

		System.out.println("O gasto total para marcar " 
		+ quantidadeFrangos + " é R$ " + total);

	}
}
