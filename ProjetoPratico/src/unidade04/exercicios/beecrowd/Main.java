package beecrowd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();
        int valor = (int) (N * 100);
       
        input.close();
        
        // Pega as notas
        int NT = valor / 100;
        // Pega as moedas
        int MO = valor % 100;

        System.out.println("NOTAS:");

        int NT100 = NT / 100;
        NT = NT - (NT100 * 100);
        System.out.println(NT100 + " nota(s) de R$ 100.00");

        int NT50 = NT / 50;
        NT = NT - NT50 * 50;
        System.out.println(NT50 + " nota(s) de R$ 50.00");

        int NT20 = NT / 20;
        NT = NT - NT20 * 20;
        System.out.println(NT20 + " nota(s) de R$ 20.00");

        int NT10 = NT / 10;
        NT = NT - NT10 * 10;
        System.out.println(NT10 + " nota(s) de R$ 10.00");

        int NT5 = NT / 5;
        NT = NT - NT5 * 5;
        System.out.println(NT5 + " nota(s) de R$ 5.00");

        int NT2 = NT / 2;
        NT = NT - NT2 * 2;
        System.out.println(NT2 + " nota(s) de R$ 2.00");

        // Agora, para as moedas
        System.out.println("MOEDAS:");

        // Se sobrou alguma coisa de nota, converte para moeda
        MO = MO + (NT * 100);

        int m1 = MO / 100;
        MO = MO - m1 * 100;
        System.out.println(m1 + " moeda(s) de R$ 1.00");

        int m050 = MO / 50;
        MO = MO - m050 * 50;
        System.out.println(m050 + " moeda(s) de R$ 0.50");

        int m025 = MO / 25;
        MO = MO - m025 * 25;
        System.out.println(m025 + " moeda(s) de R$ 0.25");

        int m010 = MO / 10;
        MO = MO - m010 * 10;
        System.out.println(m010 + " moeda(s) de R$ 0.10");

        int m005 = MO / 5;
        MO = MO - m005 * 5;
        System.out.println(m005 + " moeda(s) de R$ 0.05");

        int m001 = MO / 1;
        MO = MO - m001 * 1;
        System.out.println(m001 + " moeda(s) de R$ 0.01");

    }

}
