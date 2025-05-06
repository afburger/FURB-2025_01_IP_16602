package provas.prova01A;

import java.util.Scanner;

public class Questao5A {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código do semáforo:");
		teclado.close();

		String codigoSemaforo = teclado.next().toUpperCase();
	
		if (codigoSemaforo.equals("V")) {
			System.out.println("Verde (siga)");
		} else {
			if (codigoSemaforo.equals("A")) {
				System.out.println("Amarelo (atenção)");
			} else {
				if (codigoSemaforo.equals("R")) {
					System.out.println("Vermelho (pare)");
				} else {
					System.out.println("Entrada incorreta");
				}
			}
		}
	}
}
