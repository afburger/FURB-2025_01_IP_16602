package unidade06.exemplos;

public class Exemplo01Vetor {

    public static void main(String[] args) {
        // Declaração 1 de vetor
        int[] vetorInteiro = new int[5];

        // Declaração 2 de vetor
        int vetorInt[] = new int[4];

        vetorInteiro[0] = 1;
        vetorInteiro[2] = 3;
        vetorInteiro[1] = 2;
        vetorInteiro[3] = 4;
        vetorInteiro[4] = 5;

        for (int idx = 0; idx < 3; idx++) {
            System.out.println("Valor na posição[" + idx + "] = " + vetorInteiro[idx]);
        }

        System.out.println("-------------");

        for (int idx = 0; idx < vetorInteiro.length; idx++) {
            System.out.println("Valor na posição[" + idx + "] = " + vetorInteiro[idx]);
        }

        System.out.println("-------------");

        vetorInt[0] = 5;
        vetorInt[1] = 10;
        vetorInt[2] = 8;
        vetorInt[3] = 2;

        for (int i : vetorInt) {
            System.out.println("Valor = "  + i);
        }
        
    }

}
