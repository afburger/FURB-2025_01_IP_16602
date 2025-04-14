package unidade05.exemplos;

import java.util.Scanner;

public class ExemploWhile001 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String mensagem1 = "Infome um texto para ser convertido em letras maiusculas:";
        String mensagem2 = "Caso não queira converter, deixe vazio";
        
        System.out.println(mensagem1);    
        System.out.println(mensagem2);
        
        String texto = teclado.nextLine();

        while (texto.length() != 0 && !texto.isBlank()) {
            System.out.println(texto.toUpperCase());

            System.out.println(mensagem1);
            System.out.println(mensagem2);

            texto = teclado.nextLine();
 
        }

        teclado.close();
    }

}
