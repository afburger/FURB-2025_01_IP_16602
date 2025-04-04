package provas.prova01B;

import java.util.Scanner;

public class Questao6B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um prato:");
        String prato = sc.nextLine();

        System.out.println("Informe um Chef:");
        String chef = sc.nextLine();

        sc.close();

        if (prato.length() == 0 && chef.isBlank()) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
        } else {
            System.out.println("Prato: " + prato);

            if (chef.isBlank()) {
                System.out.println("Chef vazio");
            } else {
                System.out.println("Chef: " + chef);
            }
        }

        System.out.println("FIM");

    }

}
