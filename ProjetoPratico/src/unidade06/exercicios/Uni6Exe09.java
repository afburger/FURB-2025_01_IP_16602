package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe09.java - Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
 * Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
 * uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.
 */

public class Uni6Exe09 {

    public static void main(String[] args) {
        int qtdClientes = 3; // 30 clientes [30][ ]
        int qtdRespostas = 3; // 3 respostas [ ][3] -> sexo, nota e idade
        int dados[][] = new int[qtdClientes][qtdRespostas];

        // Faz a leitura dos dados.
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < qtdClientes; i++) {
            System.out.println(" _ Informe os dados para o cliente [" + (i + 1) + "]");
            System.out.println("sexo (1=feminino 2=masculino): ");
            dados[i][0] = teclado.nextInt();
            System.out.println("nota para o cinema (zero até dez): ");
            dados[i][1] = teclado.nextInt();
            System.out.println("idade: ");
            dados[i][2] = teclado.nextInt();
        }

        teclado.close();

        // Faz os cálculos e apresentação das informações necessárias.
        int clientesSomaNota = 0;
        int homemSomaNota = 0;
        int homemQtd = 0;
        int mulherJovemId = -1;
        int mulherJovemIdade = 999;

        for (int cliente = 0; cliente < qtdClientes; cliente++) {
            clientesSomaNota += dados[cliente][1];
            if (dados[cliente][0] == 2) { // homem
                homemSomaNota += dados[cliente][1];
                homemQtd++;
            }
            if (dados[cliente][0] == 1) { // mulher
                if (dados[cliente][2] < mulherJovemIdade) {
                    mulherJovemIdade = dados[cliente][2];
                    mulherJovemId = cliente;
                }
            }
        }

        double notaMedia = (double) clientesSomaNota / qtdClientes;
        System.out.println("Nota média recebida pelo cinema: " + notaMedia);
        double notaMediaHomem = (double) homemSomaNota / homemQtd;
        System.out.println("Nota média atribuída pelos homens: " + notaMediaHomem);
        System.out.println("Nota atribuída pela mulher mais jovem: " + dados[mulherJovemId][1]);

        int qtdMulherMedia = 0;
        for (int cliente = 0; cliente < qtdClientes; cliente++) {
            if (dados[cliente][2] > 50) { // mulher, idade > 50
                if (dados[cliente][1] > notaMedia) {
                    qtdMulherMedia++;
                }
            }
        }
        System.out.println("Quantidade de mulheres com mais de 50 anos deram nota superior a média: " + qtdMulherMedia);
    }
}
