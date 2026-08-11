package AT04.ex1;

public class ex1Produto {
    String nome;
    double preco;
    
    public ex1Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}