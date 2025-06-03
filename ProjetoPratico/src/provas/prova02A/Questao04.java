package provas.prova02A;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a capacidade de peso da mochila:");
        int capacidadePeso = teclado.nextInt();
        int totalPeso = 0;

        System.out.println("Informe a capacidade de itens da mochila:");
        int capacidadeItens = teclado.nextInt();
        int totalItens = 0;

        int[] itensPeso = new int[capacidadeItens];
        String[] itensNomes = new String[capacidadeItens];

        int opcao;
        do {
            System.out.println("1 - Inserir um item \n" +
                               "2 - Imprimir itens da mochila \n" +
                               "3 - Listar o item mais pesado \n" +
                               "4 - Ordenar mochila (do mais pesado para o mais leve) \n" +
                               "5 - Excluir um item da mochila \n" +
                               "6 - Sair do sistema"          
            );
            System.out.println("Escolha a opção desejada:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: // Inserir um item
                    System.out.println("Informe o nome do item:");
                    String nome = teclado.next();

                    System.out.println("Informe o peso do item:");
                    int peso = teclado.nextInt();

                    if ((totalPeso + peso) > capacidadePeso || totalItens >= capacidadeItens) {
                        System.out.println("Item não pode ser adicionado pois excede a capacidade da mochila!");
                    } else {
                        totalPeso += peso;
                        itensNomes[totalItens] = nome;
                        itensPeso[totalItens] = peso;
                        totalItens++;
                        System.out.println("Item adicionado com sucesso.");
                    }

                    break;

                case 2: // Imprimir itens da mochila
                    for (int idx = totalItens - 1; idx >= 0; idx--) {
                        System.out.println("Item: " + itensNomes[idx] +
                                            " Peso: " + itensPeso[idx]);
                    }
                    break;

                case 3: // Listar o item mais pesado
                    int maiorPeso = 0;
                    int idxMaioPeso = -1;
                    for (int i = 0; i < totalItens; i++) {
                        if (itensPeso[i] > maiorPeso) {
                            maiorPeso =  itensPeso[i];
                            idxMaioPeso = i;
                        }
                    }

                    if (idxMaioPeso >= 0) {
                        System.out.println("Item: " + itensNomes[idxMaioPeso] +
                                            " Peso: " + itensPeso[idxMaioPeso]);
                    } else {
                        System.out.println("Não nenhum item com peso significativo.");
                    }
                    break;

                case 4: // Ordenar mochila (do mais pesado para o mais leve)
                     // Loop externo para controlar as passagens pelo array
                    for (int idx = 0; idx < totalItens - 1; idx++) {
                        // Loop interno para comparações e trocas
                        for (int j = 0; j < totalItens - idx - 1; j++) {
                            // Se o elemento atual for menor que o próximo elemento
                            // Se quiser em ordem descrescente compara com < (Menor)
                            // Se quiser em ordem crescente compara com > (Maior)
                            if (itensPeso[j] < itensPeso[j + 1]) {
                                // Troca os pesos
                                int tempPeso = itensPeso[j];
                                itensPeso[j] = itensPeso[j + 1];
                                itensPeso[j + 1] = tempPeso;

                                // Troca os nomes
                                String tempNome = itensNomes[j];
                                itensNomes[j] = itensNomes[j + 1];
                                itensNomes[j + 1] = tempNome;
                            }
                        }
                    }
                    break;

                case 5: // Excluir um item da mochila
                    System.out.println("Digite o nome do item que deve ser excluído:");
                    String itemExcluir = teclado.next();

                    int posicaoItemExcluido = -1;

                    for (int i = 0; i < totalItens; i++) {
                        if (itemExcluir.equals(itensNomes[i])) {
                            posicaoItemExcluido = i;
                            break;
                        }
                    }

                    if (posicaoItemExcluido < 0) {
                        System.out.println("Item não encontrado");
                    } else {
                        totalPeso -= itensPeso[posicaoItemExcluido];

                        for (int idx = posicaoItemExcluido; idx < (totalItens - 1); idx++) {
                            itensNomes[idx] = itensNomes[idx + 1];
                            itensPeso[idx] = itensPeso[idx + 1];
                        }

                        itensNomes[totalItens] = null;
                        itensPeso[totalItens] = 0;

                        totalItens--;
                        System.out.println("Item excluído com sucesso");
                    }

                    break;

                case 6: // Sair do sistema
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 6);
        teclado.close();
    }


}
