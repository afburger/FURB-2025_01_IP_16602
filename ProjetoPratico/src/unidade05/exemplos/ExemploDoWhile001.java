package unidade05.exemplos;

import java.util.Scanner;

public class ExemploDoWhile001 {

    public static void main(String[] args) {
        
        String menu = "";
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("a: Maior quantidade de itens produzidos");
            System.out.println("b: Menor quantidade de itens produzidos");
            System.out.println("c: Quantidades ordenadas do menor para o maior");
            System.out.println("d: Média da produção nos três meses");
            System.out.println("e: Digite para sair");
            menu = teclado.nextLine().toUpperCase();

            switch (menu) {
                case "A":
                    System.out.println("Maior quantidade");
                    break;
                case "B":
                    System.out.println("Menor quantidade");
                    break;
                case "C":
                    System.out.println("Quantidade ordenadas");
                    break;
                case "D":
                    System.out.println("Média");
                    break;
            }

        } while (!menu.equals("E"));

        teclado.close();
    }

}
