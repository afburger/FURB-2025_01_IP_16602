package unidade06.exercicios;

import java.util.Scanner;

/**
 * Uni6Exe05.java - Com o objetivo de determinar o índice de afinidade 
 * entre um rapaz e uma moça cada um respondeu um 
 * questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). 
O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz 
e outro para armazenar as respostas da moça. 
Crie um método que possa ler tanto as respostas do rapaz como da moça, 
e outro para calcular e retornar a afinidade.
Por fim, escreva a afinidade considerando os seguintes intervalos:

Afinidade	Mensagem
15	“Casem!
10 a 14	“Vocês têm muita coisa em comum!”
5 a 9	“Talvez não dê certo :(”
0 a 4	“Vale um encontro.”
-1 a -9	“Melhor não perder tempo”
-10	“Vocês se odeiam!”
 */
public class Uni6Exe05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    String respostasRapaz[] = new String[5];
    String respostasMoca[] = new String[5];
    String perguntas[] = { "Gosta de música sertaneja?",
      "Gosta de futebol?", 
      "Gosta de seriados?",
      "Gosta de redes sociais?",
      "Gosta da Oktoberfest?" };

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
        if ((respostasRapaz[i].equals("IND") && (respostasMoca[i].equals("SIM") || respostasMoca[i].equals("NÃO")))
            || (respostasMoca[i].equals("IND") && (respostasRapaz[i].equals("SIM") || respostasRapaz[i].equals("NÃO")))) {
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
