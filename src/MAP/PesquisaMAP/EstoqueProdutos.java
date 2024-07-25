package MAP.PesquisaMAP;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //atributos

    private Map<Long, Produto> estoqueProdutosMao;

    public EstoqueProdutos() {
        this.estoqueProdutosMao = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMao.put(cod,  new Produto(quantidade, nome, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMao);
    }

    public double calculaValorTotalEstoque(){
       double valorTotalEstoque = 0;
        if(!estoqueProdutosMao.isEmpty()){
            for(Produto p : estoqueProdutosMao.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return  valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMao.isEmpty()) {
            for (Produto p : estoqueProdutosMao.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estpque = new EstoqueProdutos();
        estpque.exibirProdutos();

        estpque.adicionarProduto(1L, "Prpduto A", 10, 5.0);
        estpque.adicionarProduto(2L, "Prpduto B", 5, 10.0);
        estpque.adicionarProduto(3L, "Prpduto C", 2, 15.0);
        estpque.adicionarProduto(3L, "Prpduto Z", 2, 100.0);

        estpque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estpque.calculaValorTotalEstoque());
        System.out.println("Valor total do ALL EXPENSIVE: R$ " + estpque.obterProdutoMaisCaro());
    }

}
