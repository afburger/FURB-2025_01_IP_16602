package unidade03.exercicios;

import java.util.Scanner;

/**
 * Um motorista deseja abastecer seu tanque de combustível. 
 * Escreva um programa para ler o preço do litro da gasolina e 
 * o valor do pagamento e 
 * exibir quantos litros ele conseguiu colocar no tanque.
 * 
 * Exemplos de entrada						Exemplos de saída
 * Preço do litro de gasolina: 5.75	
 * Valor do pagamento: 150					O motorista conseguiu colocar: 26.09 litros.
 */
public class Uni3Exe03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor da gasolina:");
		double precoCombustivel = teclado.nextDouble();

		System.out.println("Informe o valor total do abastecimento:");
		double valorPago = teclado.nextDouble();

		teclado.close();

		double litros = valorPago / precoCombustivel;

		System.out.println("Você conseguiu abastecer " + litros + "L de combustível.");
	}
}
