package unidade07.exerceicioImplementado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Precisa inicializar o controle de estoque primeiro.
        ControleEstoque controleEstoque = new ControleEstoque();

        // Scanner para fazer a leitura do dados digitados pelo usuário.
        Scanner teclado = new Scanner(System.in);
        
        // Variável de controle do menu.
        int menu;

        // Cria e apresenta o menu.
        do {
            System.out.println("1 - Cadastrar produto \n" +
                               "2 - Entrada de mercadoria \n" +
                               "3 - Saída de mercadoria \n" +
                               "4 - Listrar todos os produtos \n" +
                               "5 - Listar produtos por categoria \n" +
                               "6 - Buscar produto por código \n" +
                               "7 - Sair"
            );
            System.out.println("Escolha a opção desejada:");
            menu = teclado.nextInt();

            switch (menu) {
                case 1: // Cadastrar produto
                    System.out.println("Informe o código do produto"); 
                    int codigo = teclado.nextInt();
                    System.out.println("Informe o nome do produto"); 
                    String nome = teclado.next();
                    System.out.println("Informe o preço do produto"); 
                    double preco = teclado.nextDouble();
                    System.out.println("Informe a categoria do produto"); 
                    String categoria = teclado.next();

                    Produto produto = new Produto(codigo, nome, 0, preco, categoria);
                    controleEstoque.cadastrarProduto(produto);
                    break;
            
                case 2: // Entrada de mercadoria
                    System.out.println("Informe o código do produto que deseja dar entrada"); 
                    int codigoEntrada = teclado.nextInt();
                    Produto produtoAlterar = controleEstoque.buscarProduto(codigoEntrada);
                    if (produtoAlterar != null) {
                        System.out.println("Informe a quantidade de entrada"); 
                        int quantidade = teclado.nextInt();
                        produtoAlterar.adicionarEstoque(quantidade);
                    }
                    break;
                case 3: // Saída de mercadoria
                    System.out.println("Informe o código do produto que deseja dar saída"); 
                    int codigoSaida = teclado.nextInt();
                    Produto produtoSaida = controleEstoque.buscarProduto(codigoSaida);
                    if (produtoSaida != null) {
                        System.out.println("Informe a quantidade de saída"); 
                        int quantidade = teclado.nextInt();
                        boolean saida = produtoSaida.removerEstoque(quantidade);
                        if (saida) {
                            System.out.println("Saída realizada com sucesso.");
                        } else {
                            System.out.println("Quantidade insuficiente em estoque.");
                        }
                }
                break;
                case 4: // Listar todos os produtos
                    controleEstoque.listarTodosProdutos();
                    break;
                case 5: // Listar produtos por categoria
                    System.out.println("Informe a categoria que deseja listar"); 
                    String categoriaListar = teclado.next();
                    controleEstoque.listarProdutosPorCategoria(categoriaListar);
                    break;
                case 6: // Buscar produto por código
                    System.out.println("Informe o código do produto"); 
                    int codigoPesquisa = teclado.nextInt();
                    Produto produtoPesquisa = controleEstoque.buscarProduto(codigoPesquisa);
                    if (produtoPesquisa != null) {
                        System.out.println(produtoPesquisa.toString());
                    } else {
                        System.out.println("Produto não localizado");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }

        } while (menu != 7);
    }
}
