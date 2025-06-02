package provas.prova02A;

public class Questao03 {

    public static void main(String[] args) {
        int aux = 0;
        int vetor[] = {10, 5, 3, 8, 9};
        int numero = vetor.length;
        int tamanho =  vetor.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < i; j++) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
            numero++;
        }


        // Adicionado para visualizar o resultado do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }

    // A) O que está acontecendo no método acima?
    // Resposata: Está ocorrendo a inversão dos valores dentro do vetor, o primeiro para a última posição e assim sucessivamente.

    // B) Qual o conteúdo interno (valor) da variável “vetor” após a chamada do método teste? Justifique:
    // Resposta: O valor será 9, 8, 3, 5, 10. O vetor completamente invertido, após os dois "fors" realizarem a troca de todas as posições.
}
