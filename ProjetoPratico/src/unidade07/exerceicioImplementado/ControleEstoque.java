package unidade07.exerceicioImplementado;

public class ControleEstoque {

    // Atributos
    Produto[] produtos;
    int quantidadeProdutos;

    // Construtor padrão.
    public ControleEstoque() {
        // Instância o vetor.
        produtos = new Produto[30];
        // inicializa a variável quantidade de produtos
        quantidadeProdutos = 0;
    }

    void cadastrarProduto(Produto produto) {
        // Verifica se tem espaço para adicionar novos produtos.
        if (quantidadeProdutos < (produtos.length - 1)) {
            // Adiciona o produto no vetor.
            produtos[quantidadeProdutos] = produto;
            // Incrementa a variável quantidade de produtos.
            quantidadeProdutos++;
        } else {
            System.out.println("Produto não inserido, estoque cheio!");
        }
    }

    Produto buscarProduto(int codigo) {
        // Percorre o vetor até encontrar um produto com o código igual.
        for (int i = 0; i < quantidadeProdutos; i++) {
            // compara o código informado com o código do produto.
            if (codigo == produtos[i].codigo) {
                // Retorna o produto encontrado.
                return produtos[i];
            }
        }
        // Caso não encontrou o produto, retorna null.
        return null;
    }

    void listarTodosProdutos() {
         // Percorre o vetor e vai listando os produtos.
         for (int i = 0; i < quantidadeProdutos; i++) {
            // Utiliza o toString implementado para listar a informação.
            System.out.println(produtos[i].toString());
         }
    }

    void listarProdutosPorCategoria(String categoria) {
        // Percorre o vetor e vai listando os produtos.
        for (int i = 0; i < quantidadeProdutos; i++) {
            // Verifica se a categoria do produto, é igual a categoria desejada.
            if (categoria.equals(produtos[i].categoria)) {
                // Utiliza o toString implementado para listar a informação.
                System.out.println(produtos[i].toString());
            }
         }
    }

    double calcularValorTotalEstoque() {
        double valorTotal = 0;
        // Percorre o vetor e vai somando o valor total de cada produto.
        for (int i = 0; i < quantidadeProdutos; i++) {
            valorTotal += produtos[i].calcularValorTotal();
        }
        return valorTotal;
    }
}
