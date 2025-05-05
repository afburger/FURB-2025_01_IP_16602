package unidade06.exemplos;

public class Exemplo02Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        // Forma de inicalizar já com valores;
        int[][] matrizInicializada = {
            {0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15},
            {16, 17, 18, 19},
        };

        int numero = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = numero++;
            }
        }


        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println();
        }



    }

}
