package unidade06.exemplos;

public class Exemplo03Vetor {

    public static void main(String[] args) {
        int qtd = 5;
        
        int[] vetor = new int[qtd];


        // Forma de inicalizar já com valores;
        int[] vetorInicializado = {1, 2, 3, 4, 5};

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("---- fim primeiro laço ------");

        int[] vetor2 = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i];
        }

        vetor2[5] = 6;

        vetor = vetor2;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
