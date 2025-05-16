package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe10.java - Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, 
 * faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
OBSERVAÇÃO: Não utilize o Arrays.sort

Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
Para a opção "6 - Ordenar valores" se pode usar o "método bolha" 
 */
public class Uni6Exe10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[50];
        int posFim = 0; // posição no topo do vetor
        System.out.println("\033[H\033[2J"); // limpa console
        int opcao;
        do {
            System.out.println(" ________ MENU ________");
            System.out.println("  1 - Incluir valor");
            System.out.println("  2 - Pesquisar valor");
            System.out.println("  3 - Alterar valor");
            System.out.println("  4 - Excluir valor");
            System.out.println("  5 - Mostrar valores");
            System.out.println("  6 - Ordenar valores");
            System.out.println("  7 - Inverter valores");
            System.out.println("  8 - Sair do sistema");
            System.out.print(" Opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: // Incluir valor
                    if (posFim < vet.length) {
                        System.out.print(" valor: ");
                        vet[posFim] = teclado.nextInt();
                        System.out.println("_ incluído em vet[" + posFim + "].");
                        posFim++;
                    } else {
                        System.out.println(" .. não incluído - vetor cheio .. ");
                    }
                    break;

                case 2: // Pesquisar valor
                    System.out.print(" valor pesquisa: ");
                    int valorPesquisa = teclado.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < posFim; i++) {
                        if (valorPesquisa == vet[i]) {
                            System.out.println("_ encontrado vet[" + i + "]");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("_ Não encontrado.");
                    }
                    break;

                case 3: // Alterar valor
                    System.out.print(" valor pesquisa: ");
                    int valorPesquisaAlterar = teclado.nextInt();
                    boolean encontradoAlterar = false;
                    int posicaoEncontradaAlterar = -1;

                    for (int i = 0; i < posFim; i++) {
                        if (valorPesquisaAlterar == vet[i]) {
                            System.out.println("_ encontrado vet[" + i + "]");
                            encontradoAlterar = true;
                            posicaoEncontradaAlterar = i;
                            break;
                        }
                    }

                    if (!encontradoAlterar) {
                        System.out.println("_ Não encontrado.");
                    } else {
                        System.out.print(" valor troca: ");
                        vet[posicaoEncontradaAlterar] = teclado.nextInt();
                        System.out.println("_ valor troca vet[" + posicaoEncontradaAlterar + "]: "
                                + vet[posicaoEncontradaAlterar]);
                    }
                    break;

                case 4: // Excluir valor
                    System.out.print(" valor pesquisa: ");
                    int valorPesquisaExcluir = teclado.nextInt();
                    boolean encontradoExcluir = false;
                    int posicaoEncontradaExcluir = -1;

                    for (int i = 0; i < posFim; i++) {
                        if (valorPesquisaExcluir == vet[i]) {
                            System.out.println("_ encontrado vet[" + i + "]");
                            encontradoExcluir = true;
                            posicaoEncontradaExcluir = i;
                            break;
                        }
                    }

                    if (!encontradoExcluir) {
                        System.out.println("_ Não encontrado.");
                    } else {
                        for (int i = posicaoEncontradaExcluir; i < (posFim - 1); i++) {
                            vet[i] = vet[i + 1];
                        }
                        posFim--;
                        System.out.println("_ valor excluído.");
                    }
                    break;

                case 5: // Mostrar valores
                    System.out.println(" ** vetor valores ** ");
                    for (int i = 0; i < posFim; i++) {
                        System.out.println("vet[" + i + "] " + vet[i]);
                    }
                    break;

                case 6: // Ordenar valores
                    int bolha;
                    for (int i = 0; i < posFim - 1; i++) {
                        if (vet[i] > vet[i + 1]) {
                            bolha = vet[i];
                            vet[i] = vet[i + 1];
                            vet[i + 1] = bolha;
                            i = -1;
                        }
                    }
                    System.out.println("_ valores ordenados.");
                    break;

                case 7: // Inverter valores
                    int temp = 0;
                    for (int i = 0; i < posFim; i++) {
                        for (int x = 0; x < i; x++) {
                            temp = vet[i];
                            vet[i] = vet[x];
                            vet[x] = temp;
                        }
                    }
                    System.out.println("_ valores invertidos.");
                    break;

                case 8:
                    System.out.println(" ** FIM ** ");
                    break;

                default:
                    System.out.println(" .. opção inválida .. ");
                    break;
            }
        } while (opcao != 8);

        teclado.close();
    }
}