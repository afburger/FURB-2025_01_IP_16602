package provas.prova02A;

public class Questao01 {

    public static void main(String[] args) {
        int resultado = 0;
        int vetor[] = new int[10];

        // Variável adicionada para testar
        int vezes = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            if (vetor[i] % 2 != 0) {
                resultado += vetor[i];
            }

            // Contagem adicionada para testar
            vezes++;
        }
        System.out.println(resultado);

        // Adicionado para ver quantas vezes o for executa.
        System.out.println(vezes);
    }

    // a. Qual o valor será exibido pelo código abaixo?
    // Resposta: 25

    // b. Quantas vezes o laço “for” irá executar? Justifique:
    // Resposta: 10 vezes, pois ele vai executar de acordo com o tamanho do vetor, que nesse caso é de 10 posições.
    // ou seja, vai percorrer todas as posições do vetor, já a variável i é incrementada e 1 a cada execução do laço.


}
