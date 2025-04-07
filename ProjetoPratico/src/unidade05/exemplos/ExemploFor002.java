package unidade05.exemplos;

import java.util.Scanner;

public class ExemploFor002 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Infome um texto que deseja espelhar:");

        String texto = teclado.nextLine();
        teclado.close();

        for (int idx = texto.length() - 1; idx > 0; idx--) {
            char letra = texto.charAt(idx);
            System.out.println(letra);
        }
    }

}
