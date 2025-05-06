package provas.prova01A;

import java.util.Scanner;

public class Questao6A {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores:");
		
		int producaoMes1 = teclado.nextInt();
		int producaoMes2 = teclado.nextInt();
		int producaoMes3 = teclado.nextInt();
		
		// Ordenação valores
		int producaoMenor, producaoMedia, producaoMaior;
		
		if (producaoMes1 <= producaoMes2 && producaoMes1 <= producaoMes3) {
			producaoMenor = producaoMes1;
			if (producaoMes2 <= producaoMes3) {
				producaoMedia = producaoMes2;
				producaoMaior = producaoMes3;
			} else {
				producaoMedia = producaoMes3;
				producaoMaior = producaoMes2;
			}
		} else if (producaoMes2 <= producaoMes1 && producaoMes2 <= producaoMes3) {
			producaoMenor = producaoMes2;
			if (producaoMes1 <= producaoMes3) {
				producaoMedia = producaoMes1;
				producaoMaior = producaoMes3;
			} else {
				producaoMedia = producaoMes3;
				producaoMaior = producaoMes1;
			}
		} else {
			producaoMenor = producaoMes3;
			if (producaoMes1 <= producaoMes2) {
				producaoMedia = producaoMes1;
				producaoMaior = producaoMes2;
			} else {
				producaoMedia = producaoMes2;
				producaoMaior = producaoMes1;
			}
		}

		System.out.println("Menu:");
		System.out.println("a: Maior quantidade de itens produzidos");
		System.out.println("b: Menor quantidade de itens produzidos");
		System.out.println("c: Quantidades ordenadas do menor para o maior");
		System.out.println("d: Média da produção nos três meses");
		String opcao = teclado.next().toUpperCase();

		switch (opcao) {
			case "A":
				System.out.println("Maior quantidade de itens produzidos: " + producaoMaior);
				break;
			case "B":
				System.out.println("Menor quantidade de itens produzidos: " + producaoMenor);
				break;
			case "C":
				System.out.println("Quantidades ordenadas do menor para o maior");
				System.out.println("Valor menor: " + producaoMenor);	
				System.out.println("Valor medio: " + producaoMedia);
				System.out.println("Valor alto: " + producaoMaior);
				break;
			case "D":
				int media = (producaoMenor + producaoMedia + producaoMaior) / 3;
				System.out.println("Média da produção nos três meses: " + media);
				break;
			default:
				System.out.println("Menu inválido");
				break;
		}
		teclado.close();
	}
}
