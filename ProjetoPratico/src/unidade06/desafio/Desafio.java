package unidade06.desafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        int capacidade = 20;
        int matriculas[] = new int[capacidade];
        double notas[] = new double[capacidade];
        int frequencias[] = new int[capacidade];

        int qtdAlunos = 0;

        Scanner teclado = new Scanner(System.in);

        int opcaoMenu;

        do {
            System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Exibir dados de todos os alunos");
            System.out.println("3. Calcular estatísticas da turma");
            System.out.println("4. Verificar situação de um aluno específico");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: _");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {
                case 1: // Cadastro de aluno.
                    if (qtdAlunos < matriculas.length) {
                        System.out.println("Informe o código de matricula");
                        int matricula = teclado.nextInt();
                        double nota = 0;
                        int frequencia = 0;

                        boolean matValida = false;
                        boolean notaValida = false;
                        boolean freqValida = false;

                        boolean matriculaDuplica = false;
                        for (int idx = 0; idx < qtdAlunos; idx++) {
                            if (matriculas[idx] == matricula) {
                                matriculaDuplica = true;
                            }
                        }

                        if (matriculaDuplica) {
                            System.out.println("Matrícula já existe!");
                        } else {
                            matValida = true;
                            System.out.println("Informe a nota");
                            nota = teclado.nextDouble();

                            if (nota >= 0.0 && nota <= 10.0) {
                                notaValida = true;

                                System.out.println("Informe a frequência do aluno:");
                                frequencia = teclado.nextInt();

                                if (frequencia >= 0 && frequencia <= 20) {
                                    freqValida = true;
                                } else {
                                    System.out.println("Franquência inválida!");
                                }

                            } else {
                                System.out.println("Nota inválida");
                            }
                        }

                        if (matValida && notaValida && freqValida) {
                            matriculas[qtdAlunos] = matricula;
                            notas[qtdAlunos] = nota;
                            frequencias[qtdAlunos] = frequencia;

                            qtdAlunos++;
                        }

                    } else {
                        System.out.println("Matrículas esgotadas");
                    }

                    break;

                case 2:
                    for (int idx = 0; idx < qtdAlunos; idx++) {
                        int matricula = matriculas[idx];
                        double nota = notas[idx];
                        int frequencia = frequencias[idx];
                        String situacao = "";

                        if (nota >= 7.0 && frequencia >= 15) {
                            situacao = "Aprovado";
                        } else {
                            if (nota >= 5.0 && nota < 7.0 && frequencia >= 15) {
                                situacao = "Recuperação";
                            } else {
                                if (nota < 5.0 && frequencia >= 15) {
                                    situacao = "Reprovado por nota";
                                } else {
                                    if (frequencia < 15) {
                                        situacao = "Reprovado por frequência";
                                    }
                                }
                            }
                        }

                        System.out.println("Matrícula: " + matricula
                                + " nota: " + nota
                                + " frequencia: " + frequencia
                                + " situação: " + situacao);
                    }
                    break;
                case 3:
                    double maiorNota = 0.0;
                    double menorNota = 10.0;
                    double somaMedia = 0;
                    double qtdAprovados = 0.0;
                    double qtdRecuperacao = 0.0;
                    double qtdReprovados = 0.0;

                    for (int idx = 0; idx < qtdAlunos; idx++) {
                        double notaAux = notas[idx];
                        int freqAux = frequencias[idx];

                        somaMedia += notaAux;

                        if (notaAux > maiorNota) {
                            maiorNota = notaAux;
                        }

                        if (notaAux < menorNota) {
                            menorNota = notaAux;
                        }

                        if (notaAux >= 7.0 && freqAux >= 15) {
                            qtdAprovados++;
                        } else {
                            if (notaAux >= 5.0 && notaAux < 7.0 && freqAux >= 15) {
                                qtdRecuperacao++;
                            } else {
                                if (notaAux < 5.0 && freqAux >= 15) {
                                    qtdReprovados++;
                                } else {
                                    if (freqAux < 15) {
                                        qtdReprovados++;
                                    }
                                }
                            }
                        }
                    }

                    System.out.println("A maior nota é: " + maiorNota);
                    System.out.println("A menor nota é: " + menorNota);
                    System.out.println("Média é: " + somaMedia / qtdAlunos);
                    System.out.println("Aprovados: " + qtdAprovados);
                    System.out.println("Em recuperação: " + qtdRecuperacao);
                    System.out.println("Reprovados: " + qtdReprovados);
                    double percentual = qtdAprovados / qtdAlunos;
                    System.out.println("% de aprovados: " + (percentual * 100));
                    break;
                case 4:
                    System.out.println("Informe a matrícula do aluno que deseja listar");
                    int matriculaPesquisar = teclado.nextInt();

                    boolean encontrou = false;
                    int posicao = 0;
                    while (!encontrou && posicao < qtdAlunos) {
                        if (matriculas[posicao] == matriculaPesquisar) {
                            encontrou = true;
                        } else {
                            posicao++;
                        }
                    }

                    if (encontrou) {
                        double nota = notas[posicao];
                        int frequencia = frequencias[posicao];
                        String situacao = "";
                        if (nota >= 7.0 && frequencia >= 15) {
                            situacao = "Aprovado";
                        } else {
                            if (nota >= 5.0 && nota < 7.0 && frequencia >= 15) {
                                situacao = "Recuperação";
                            } else {
                                if (nota < 5.0 && frequencia >= 15) {
                                    situacao = "Reprovado";
                                } else {
                                    if (frequencia < 15) {
                                        situacao = "Reprovado";
                                    }
                                }
                            }
                        }

                        System.out.println("O aluno de matrícula " + matriculaPesquisar
                                + " está " + situacao
                                + " com nota " + nota
                                + " e frequência " + frequencia);
                    } else {
                        System.out.println("Matrícula inválida!");
                    }

                    break;
                case 5:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção do menu inválida!");
                    break;
            }

        } while (opcaoMenu != 5);
        teclado.close();
    }

}
