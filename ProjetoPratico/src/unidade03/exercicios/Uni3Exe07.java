package unidade03.exercicios;

import java.util.Scanner;

/**
 * Uma fábrica de refrigerantes vende seu produto em três formatos: 
 * lata de 350 ml, 
 * garrafa de 600 ml e 
 * garrafa de 2 litros. 
 * Se um comerciante compra uma determinada quantidade de cada formato, 
 * faça um programa para calcular quantos litros de refrigerante ele comprou.
 * 
 * Exemplo de entrada			Exemplo de saída
 * Quantidade de 350ml: 40	
 * Quantidade de 600ml: 34
 * Quantidade de 2L: 120		O cliente comprou ao total 274,40 litros.
 * 
 */
public class Uni3Exe07 {

	public static void main(String[] args) {
		final double conteudoLata = 350;
		final double conteudoGarrafa = 600;
		final double conteudoPet = 2000;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de latas de 350ml:");
		int quantidadeLata = teclado.nextInt();

		System.out.println("Informe a quantidade de garrafas de 600ml:");
		int quantidadeGarrafa = teclado.nextInt();

		System.out.println("Informe a quantidade de garrafas de 2L:");
		int quantidadePet = teclado.nextInt();

		teclado.close();

		double totalLata = quantidadeLata * conteudoLata;
		double totalGarrafa = quantidadeGarrafa * conteudoGarrafa;
		double totalPet = quantidadePet * conteudoPet;

		double totalLitros = (totalLata + totalGarrafa + totalPet) / 1000;

		System.out.println("O cliente comprou ao total " 
		+ totalLitros + " litros.");
	}
}
