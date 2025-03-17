import java.util.Scanner;

public class ExemploIf003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe se está chovendo [true] para sim e [false] para não:");

        boolean estaChovendo = teclado.nextBoolean();

        if (estaChovendo) {
            System.out.println("Leve o seu guarda chuva");
        }

        // Só entra nessa condição se o estiver chovendo for false
        if (!estaChovendo) {
            System.out.println("Vamos para praia");
        }

        System.out.println("Informe a sua idade");
        int idade = teclado.nextInt();

        if (!(idade == 18)) {
            System.out.println("Você é menor de idade ou mais velho do que 18 anos");
        }

        System.out.println("Fim da aplicação!");
    }
}
