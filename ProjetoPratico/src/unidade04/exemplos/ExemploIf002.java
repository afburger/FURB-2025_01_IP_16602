public class ExemploIf002 {

    public static void main(String[] args) {
        String teste1 = new String("Teste");
        String teste2 = new String("Teste");

        // Não funciona corretamente para comparar Strings
        if (teste1 == teste2) {
            System.out.println("Textos iguais!");
        }

        // Funciona corretamente para comparar Strings
        if (teste1.equals(teste2)) {
            System.out.println("Variáveis de Textos iguais, realmente são iguais!");
        }

        String teste3 = "Teste";
        String teste4 = "teste";

        // Não é igual pois o java é case sensitive.
        if (teste3 == teste4) {
            System.out.println("Teste 3 e 4 são iguais");
        }


        System.out.println("Fim da Aplicação!");
    }
}
