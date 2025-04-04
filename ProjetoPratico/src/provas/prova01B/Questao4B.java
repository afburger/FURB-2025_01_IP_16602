package provas.prova01B;

import java.util.Scanner;

public class Questao4B {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código da classificação do filme:");
		String codigoClassificacao = teclado.next().toUpperCase();
		
		teclado.close();

		if (codigoClassificacao.equals("L")) {
			System.out.println("Filme indicado para qualquer idade.");
		} else {
			if (codigoClassificacao.equals("10")) {
				System.out.println("Filme indicado para maiores de 10 anos.");
			} else {
				if (codigoClassificacao.equals("12")) {
					System.out.println("Filme indicado para maiores de 12 anos.");
				} else {
					if (codigoClassificacao.equals("14")) {
						System.out.println("Filme indicado para maiores de 14 anos.");
					} else {
						if (codigoClassificacao.equals("16")) {
							System.out.println("Filme indicado para maiores de 16 anos.");
						} else {
							if (codigoClassificacao.equals("18")) {
								System.out.println("Filme indicado para maiores de 18 anos.");
							} else {
								System.out.println("Entrada incorreta.");
							}
						}
					}
				}
			}
		}
	}
}
