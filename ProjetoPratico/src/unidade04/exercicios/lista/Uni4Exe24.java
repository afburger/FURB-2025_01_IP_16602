package unidade04.exercicios.lista;

import java.util.Scanner;

public class Uni4Exe24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores:");
		
		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();
		int valor3 = teclado.nextInt();
		
		// Ordenação valores ___
		int valorMenor, valorMedio, valorMaior;
		
		if (valor1 <= valor2 && valor1 <= valor3) {
			valorMenor = valor1;
			if (valor2 <= valor3) {
				valorMedio = valor2;
				valorMaior = valor3;
			} else {
				valorMedio = valor3;
				valorMaior = valor2;
			}
		} else if (valor2 <= valor1 && valor2 <= valor3) {
			valorMenor = valor2;
			if (valor1 <= valor3) {
				valorMedio = valor1;
				valorMaior = valor3;
			} else {
				valorMedio = valor3;
				valorMaior = valor1;
			}
		} else {
			valorMenor = valor3;
			if (valor1 <= valor2) {
				valorMedio = valor1;
				valorMaior = valor2;
			} else {
				valorMedio = valor2;
				valorMaior = valor1;
			}
		}

		System.out.println("Menu:");
		System.out.println("1: Ordem crescente");
		System.out.println("2: Ordem decrescente");
		System.out.println("3: Maior ao meio");
		int opcao = teclado.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("Valor menor: " + valorMenor);
				System.out.println("Valor medio: " + valorMedio);
				System.out.println("Valor alto: " + valorMaior);
				break;
			case 2:
				System.out.println("Valor alto: " + valorMaior);
				System.out.println("Valor medio: " + valorMedio);
				System.out.println("Valor menor: " + valorMenor);
				break;
			case 3:
			System.out.println("Valor medio: " + valorMedio);
			System.out.println("Valor alto: " + valorMaior);
			System.out.println("Valor menor: " + valorMenor);
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
		teclado.close();
	}
}
