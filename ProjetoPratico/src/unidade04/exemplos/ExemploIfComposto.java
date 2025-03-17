import java.util.Scanner;

public class ExemploIfComposto {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe uma letra");

        String letra = teclado.next();

        // Converte a letra para minúscula
        letra = letra.toLowerCase();

        // Exemplo utilizando o OU (||)
        if (letra.equals("a") 
                || letra.equals("e") 
                || letra.equals("i") 
                || letra.equals("o") 
                || letra.equals("u")) {

            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        

        // Exemplo utilizando o E (&&)

        System.out.println("Informe a idade");
        int idade = teclado.nextInt();

        System.out.println("Informe S se possui CNH ou N caso não possua");
        String possuiCNH = teclado.next().toLowerCase();

        if (idade >= 18 && possuiCNH.equals("s")) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Fique longe da direção");
        }

        teclado.close();

    }
}
