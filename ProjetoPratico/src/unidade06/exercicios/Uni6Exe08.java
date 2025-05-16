package unidade06.exercicios;

import java.util.Scanner;

public class Uni6Exe08 {

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
                case 1:
                    if (posFim < vet.length) {
                        System.out.print(" digite o valor para incluir: ");
                        vet[posFim] = teclado.nextInt();
                        System.out.println("_ incluído em vetor[" + posFim + "].");
                        posFim++;
                    } else {
                        System.out.println(" .. não incluído - vetor cheio .. ");
                    }
                    break;
                case 2:
                    System.out.print(" digite o valor para ser pesquisado: ");
                    int valor = teclado.nextInt();
                    for (int i = 0; i < posFim; i++) {
                        if (valor == vet[i]) {
                            System.out.println("_ encontrado vetor[" + i + "]");
                        }
                    }
                    System.out.println("_ não encontrado.");
                    break;
                case 3:
                    int idxAlterar = -1;
                    System.out.print(" digite o valor que deseja alterar: ");
                    int valorAlterar = teclado.nextInt();
                    for (int i = 0; i < posFim; i++) {
                        if (valorAlterar == vet[i]) {
                            idxAlterar = i;
                            break;
                        }
                    }
                    if (idxAlterar < 0) {
                        System.out.println("_ valor não encontrado.");
                    } else {
                        System.out.print(" digite o novo valor: ");
                        vet[idxAlterar] = teclado.nextInt();
                        System.out.println("_ valor troca vetor[" + idxAlterar + "]: " + vet[idxAlterar]);
                    }
                    break;
                case 4:
                    int idxExcluir = -1;
                    System.out.print(" digite o valor que deseja excluir: ");
                    int valorExcluir = teclado.nextInt();
                    for (int i = 0; i < posFim; i++) {
                        if (valorExcluir == vet[i]) {
                            idxExcluir = i;
                            break;
                        }
                    }
                    if (idxExcluir < 0) {
                        System.out.println("_ valor não encontrado.");
                    } else {
                        for (int i = idxExcluir; i < (posFim - 1); i++) {
                            vet[i] = vet[i + 1];
                        }
                        posFim--;
                        System.out.println("_ valor excluído.");
                    }
                    break;
                case 5:
                    System.out.println(" __ vetor valores __ ");
                    for (int i = 0; i < posFim; i++) {
                        System.out.println("vet[" + i + "] " + vet[i]);
                    }
                    break;
                case 6:
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
                case 7:
                    int temp = 0;
                    for (int i = 0; i < posFim; i++) {
                        for (int x = 0; x < i; x++) {
                            temp = vet[i];
                            vet[i] = vet[x];
                            vet[x] = temp;
                        }
                    }
                    break;
                case 8:
                    System.out.println(" __ FIM __ ");
                    break;
                default:
                    System.out.println(" .. opção inválida .. ");
                    break;
            }
        } while (opcao != 8);
        teclado.close();
    }
}
