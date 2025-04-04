package provas.prova01A;

import java.util.Scanner;

public class Questao4A {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma disciplina:");
        String disciplina = sc.nextLine();

        System.out.println("Informe o nome de um professor:");
        String professor = sc.nextLine();

        sc.close();

        if (disciplina.length() == 0 && professor.isBlank()) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
        } else {
            System.out.println("Disciplina: " + disciplina);

            if (professor.isBlank()) {
                System.out.println("Professor vazio");
            } else {
                System.out.println("Professor: " + professor);
            }
        }

        System.out.println("FIM");

    }

}
