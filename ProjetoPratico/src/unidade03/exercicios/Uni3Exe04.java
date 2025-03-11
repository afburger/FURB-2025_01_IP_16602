package unidade03.exercicios;

import java.util.Scanner;

/**
 * Faça um programa para ler três notas de um aluno em uma disciplina 
 * e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
 *
 *	Exemplos de entrada			Exemplos de saída
 * 	9 6 8						7.90
 *	4 8 6						5.60
 */
public class Uni3Exe04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final float pesoNota1 = 0.5f;
		final float pesoNota2 = 0.3f;
		final float pesoNota3 = 0.2f;

		System.out.println("Digite a primeira nota:");
		float nota1 = teclado.nextFloat();

		System.out.println("Digite a segunda nota:");
		float nota2 = teclado.nextFloat();

		System.out.println("Digite a terceira nota:");
		float nota3 = teclado.nextFloat();

		teclado.close();

		float nota1Ponderada = nota1 * pesoNota1;
		float nota2Ponderada = nota2 * pesoNota2;
		float nota3Ponderada = nota3 * pesoNota3;

		float media = nota1Ponderada + nota2Ponderada + nota3Ponderada;

		System.out.println("A média final do aluno é: " + media);
	}
}
