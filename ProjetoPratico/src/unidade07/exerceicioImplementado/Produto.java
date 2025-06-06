package unidade07.exerceicioImplementado;

public class Produto {

    int codigo;
    String nome;
    int quantidade;
    double preco;
    String categoria;

    public Produto(int codigo,
                    String nome,
                    int quantidade,
                    double preco,
                    String categoria) {

        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    boolean removerEstoque(int quantidade) {
        if (this.quantidade > quantidade) {
            this.quantidade -= quantidade;
            return true;
        } 
        return false;
    }

    double calcularValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        String saida = categoria + " - " + codigo + " - " + nome + " QTD = " + quantidade + " VLR = " + preco;
        return saida;
    }
}
