package provas.prova01B;

import java.util.Scanner;

public class Questao5B {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores:");
		
		int velocidade1 = teclado.nextInt();
		int velocidade2 = teclado.nextInt();
		int velocidade3 = teclado.nextInt();
		
		// Ordenação valores ___
		int velocidadeMenor, velocidadeMedio, velocidadeMaior;
		
		if (velocidade1 <= velocidade2 && velocidade1 <= velocidade3) {
			velocidadeMenor = velocidade1;
			if (velocidade2 <= velocidade3) {
				velocidadeMedio = velocidade2;
				velocidadeMaior = velocidade3;
			} else {
				velocidadeMedio = velocidade3;
				velocidadeMaior = velocidade2;
			}
		} else if (velocidade2 <= velocidade1 && velocidade2 <= velocidade3) {
			velocidadeMenor = velocidade2;
			if (velocidade1 <= velocidade3) {
				velocidadeMedio = velocidade1;
				velocidadeMaior = velocidade3;
			} else {
				velocidadeMedio = velocidade3;
				velocidadeMaior = velocidade1;
			}
		} else {
			velocidadeMenor = velocidade3;
			if (velocidade1 <= velocidade2) {
				velocidadeMedio = velocidade1;
				velocidadeMaior = velocidade2;
			} else {
				velocidadeMedio = velocidade2;
				velocidadeMaior = velocidade1;
			}
		}

		System.out.println("Menu:");
		System.out.println("a: Maior velocidade média registrada");
		System.out.println("b: Menor velocidade média registrada");
		System.out.println("c: Velocidades médias ordenadas do menor para o maior");
		System.out.println("d: Média geral das velocidades registradas");
		String opcao = teclado.next().toUpperCase();

		switch (opcao) {
			case "A":
				System.out.println("Maior velocidade média registrada: " + velocidadeMaior);
				break;
			case "B":
				System.out.println("Menor velocidade média registrada: " + velocidadeMenor);
				break;
			case "C":
				System.out.println("Velocidades médias ordenadas do menor para o maior");
				System.out.println("Velocidade menor: " + velocidadeMenor);	
				System.out.println("Velocidade medio: " + velocidadeMedio);
				System.out.println("Velocidade alto: " + velocidadeMaior);
				break;
			case "D":
				int media = (velocidadeMenor + velocidadeMedio + velocidadeMaior) / 3;
				System.out.println("Média geral das velocidades registradas: " + media);
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
		teclado.close();
	}
}
