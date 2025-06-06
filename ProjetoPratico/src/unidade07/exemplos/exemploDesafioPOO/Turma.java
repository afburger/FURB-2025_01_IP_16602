package unidade07.exemplos.exemploDesafioPOO;

public class Turma {

    Aluno[] alunos;
    int qtd;

    public Turma() {
        alunos = new Aluno[20];
        qtd = 0;
    }

    public Turma(int tamanhoTurma) {
        alunos = new Aluno[tamanhoTurma];
        qtd = 0;
    }

    // "1. Cadastrar aluno"
    String cadastrarAluno(int codigoMatricula, double nota, int frequencia) {
        if (qtd < alunos.length) {
            if (codigoMatricula > 0) {
                boolean matriculaDuplica = false;
                for (int idx = 0; idx < qtd; idx++) {
                    if (alunos[idx].matricula == codigoMatricula) {
                        matriculaDuplica = true;
                    }
                }
                if (matriculaDuplica) {
                    return "Matríula já existe";
                } else {
                    if (nota >= 0.0 && nota <= 10.0) {
                        if (frequencia >= 0 && frequencia <= 20) {
                            Aluno aluno = new Aluno(codigoMatricula, nota, frequencia);
                            alunos[qtd] = aluno;
                            qtd++;
                            return "Aluno adicionado com sucesso";
                        } else {
                            return "Frequência inválida";
                        }
                    } else {
                        return "Nota inválida";
                    }
                }
            } else {
                return "Código de matrícula inválida";
            }
        } else {
            return "Turma cheia!";
        }

    }

    // "2. Exibir dados de todos os alunos"
    void listarAlunos() {
        for (int idx = 0; idx < qtd; idx++) {
            // alunos[idx].imprimeAluno();
            Aluno aluno = alunos[idx];
            aluno.imprimeAluno();
        }
    }

    // "3. Calcular estatísticas da turma"
    void imprimirEstatisticas() {
        double maiorNota = 0.0;
        double menorNota = 10.0;
        double somaMedia = 0;
        double qtdAprovados = 0.0;
        double qtdRecuperacao = 0.0;
        double qtdReprovados = 0.0;

        for (int idx = 0; idx < qtd; idx++) {
            Aluno aluno = alunos[idx];
            double notaAux = aluno.nota;

            somaMedia += notaAux;

            if (notaAux > maiorNota) {
                maiorNota = notaAux;
            }

            if (notaAux < menorNota) {
                menorNota = notaAux;
            }

            String situacao = aluno.retornaSituacaoAluno();

            switch (situacao) {
                case "Aprovado":
                    qtdAprovados++;
                    break;
                case "Recuperação":
                    qtdRecuperacao++;
                    break;
                case "Reprovado por nota":
                case "Reprovado por frequência":
                    qtdReprovados++;
                    break;
                default:
                    break;
            }
            
        }

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("Média é: " + somaMedia / qtd);
        System.out.println("Aprovados: " + qtdAprovados);
        System.out.println("Em recuperação: " + qtdRecuperacao);
        System.out.println("Reprovados: " + qtdReprovados);
        double percentual = qtdAprovados / qtd;
        System.out.println("% de aprovados: " + (percentual * 100));
    }

    // "4. Verificar situação de um aluno específico"
    void verificarAluno(int codigoMatricula) {
        for (int i = 0; i < qtd; i++) {
            Aluno aluno = alunos[i];
            if (codigoMatricula == aluno.matricula) {
                aluno.imprimeAluno();
            }
        }
    }
}
