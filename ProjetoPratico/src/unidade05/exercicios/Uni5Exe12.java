package unidade05.exercicios;

import java.util.Scanner;

public class Uni5Exe12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qtd linhas: ");
    int qtdLinhas = teclado.nextInt();
    int numFloyd;

    // Opção A: sem consistir os espaçamentos
    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        System.out.print(numFloyd + " ");
        numFloyd++;
      }
      System.out.println();
    }

    // Opção B: consistindo os espacamentos até 3 digitos
    numFloyd = 1;
    for (int linha = 1; linha <= qtdLinhas; linha++) {
      for (int coluna = 1; coluna <= linha; coluna++) {
        if (numFloyd < 10) {
          System.out.print(numFloyd + " ");
        } else {
          if (numFloyd < 100) {
            System.out.print(numFloyd + " ");
          } else {
            System.out.print(numFloyd + " ");
          }
        }
        numFloyd++;
      }
      System.out.println();
    }
    
    teclado.close();
  }
}
