package unidade03.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Uma empresa tem para um funcionário os seguintes dados: 
 * o nome, o número de horas trabalhadas mensais e o número de dependentes. 
 * 
 * A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
 * e R$ 60,00 por dependente (valor para cálculo do salário família) 
 * e são feitos descontos de 8,5% sobre o salário trabalho para o INSS 
 * e de 5% sobre o salário trabalho para o imposto de renda. 
 * Descreva um programa que informe o nome, o salário bruto 
 * e o salário líquido do funcionário.
 * 
 * Exemplos de entrada								Exemplos de saída
 * 
 * Nome: João
 * Quantidade de horas trabalhadas no mês: 160
 * Número de dependentes: 2							O funcionário João possui um salário bruto de R$1720,00 e um salário líquido de R$1504,00
 * 
 * Nome: Carlos
 * Quantidade de horas trabalhadas no mês: 84	
 * Número de dependentes: 0							O funcionário Carlos possui um salário bruto de R$840,00 e um salário líquido de R$726,60
 * 
 */
public class Uni3Exe12 {

	public static void main(String[] args) {
		final double valorHoraTrabalhada = 10;
		final double valorDependente = 60;
		final double percentualINSS = 0.085;
		final double percentualIR = 0.05;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do funcionário:");
		String nome = teclado.nextLine();

		System.out.println("Informe a quantidade de horas trabalhadas:");
		int horasTrabalhadas = teclado.nextInt();

		System.out.println("Informe a quantidade de dependentes:");
		byte quantidadeDependentes = teclado.nextByte();

		teclado.close();

		double salarioTrabalho = horasTrabalhadas * valorHoraTrabalhada;

		double salarioDependente = valorDependente * quantidadeDependentes;

		double salarioBruto = salarioTrabalho + salarioDependente;

		double descontos = (salarioTrabalho * percentualINSS) 
		+ (salarioTrabalho * percentualIR);

		double salarioLiquido = (salarioTrabalho - descontos) + salarioDependente;

		DecimalFormat df = new DecimalFormat("#.000");

		System.out.println("O funcionário " + nome 
		+ " possui um salário bruto de R$" + df.format(salarioBruto)
		+ " e um salário líquido de R$" + salarioLiquido);


	}
}
