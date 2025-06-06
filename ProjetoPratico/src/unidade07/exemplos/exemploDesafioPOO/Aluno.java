package unidade07.exemplos.exemploDesafioPOO;

public class Aluno {

    int matricula;
    double nota;
    int frequencia;

    public Aluno(int matricula, double nota, int frequencia) {
        this.matricula = matricula;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    String retornaSituacaoAluno() {
        if (nota >= 7.0 && frequencia >= 15) {
            return "Aprovado";
        } else {
            if (nota >= 5.0 && nota < 7.0 && frequencia >= 15) {
                return "Recuperação";
            } else {
                if (nota < 5.0 && frequencia >= 15) {
                    return "Reprovado por nota";
                } else {
                    if (frequencia < 15) {
                        return "Reprovado por frequência";
                    }
                }
            }
            return "";
        }
    }

    void imprimeAluno() {
        System.out.println("Matrícula: " + matricula
                                + " nota: " + nota
                                + " frequencia: " + frequencia
                                + " situação: " + retornaSituacaoAluno());
    }
}
