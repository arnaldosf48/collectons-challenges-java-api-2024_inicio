package MAP.PesquisaMAP;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int quantidade, String nome, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
