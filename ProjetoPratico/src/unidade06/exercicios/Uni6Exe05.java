package unidade06.exercicios;

import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    String respostasRapaz[] = new String[5];
    String respostasMoca[] = new String[5];
    String perguntas[] = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
        "Gosta de redes sociais?", "Gosta da Oktoberfest?" };

    // Faz a leitura das respostas
    System.out.println(" __ Informe as respostas (SIM, NÃO, IND) do Rapaz __");
    for (int i = 0; i < perguntas.length; i++) {
      System.out.print(perguntas[i] + ": ");
      respostasRapaz[i] = teclado.next();
    }


    System.out.println(" __ Informe as respostas (SIM, NÃO, IND) da Moça __");
    for (int i = 0; i < perguntas.length; i++) {
      System.out.print(perguntas[i] + ": ");
      respostasMoca[i] = teclado.next();
    }
    

    // Calcula a afinidade
    int afinidade = 0;
    for (int i = 0; i < respostasRapaz.length; i++) {
      if (respostasRapaz[i].equals(respostasMoca[i])) {
        afinidade += 3;
      } else {
        if ((respostasRapaz[i].equals("IND") && (respostasMoca[i].equals("SIM") || respostasMoca[i].equals("NãO")))
            || (respostasMoca[i].equals("IND") && (respostasRapaz[i].equals("SIM") || respostasRapaz[i].equals("NãO")))) {
          afinidade += 1;
        } else {
          if ((respostasRapaz[i].equals("SIM") && respostasMoca[i].equals("NÃO")) || (respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("NÃO"))) {
            afinidade -= 2;
          }
        }
      }

    }

    System.out.println(" __ Afinidade entre o Rapaz e a Moça ___");
    if (afinidade == 15) {
      System.out.println("Casem!");
    } else {
      if (afinidade >= 10 && afinidade <= 14) {
        System.out.println("Vocês têm muita coisa em comum!");
      } else {
        if (afinidade >= 5 && afinidade <= 9) {
          System.out.println("Talvez não dê certo :(");
        } else {
          if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
          } else {
            if (afinidade >= -9 && afinidade <= -1) {
              System.out.println("Melhor não perder tempo");
            } else {
              if (afinidade == -10) {
                System.out.println("Vocês se odeiam!");
              }
            }
          }
        }
      }
    }

    teclado.close();
    }
}
