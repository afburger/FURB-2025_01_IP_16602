import java.util.Scanner;

public class ExemploIf001 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa:");

        int idade = teclado.nextInt();

        if (idade > 18) {
            System.out.println("Já pode tirar a CNH");
        }

        System.out.println("Fim da aplicação!");

    }
}
