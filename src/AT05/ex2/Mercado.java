package AT05.ex2;

public class Mercado {
    String nome;
    int quantidade;
    double preco;

    public Mercado(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = Math.max(0, quantidade);
        this.preco = Math.max(0.0, preco);
    }

    public void adicionarQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Adicionadas " + quantidade + " unidades de " + ".");
        } else {
            System.out.println("Erro: quantidade a adicionar deve ser maior que zero");
        }
    }

    public void retirarQuantidade(int quantidade){
        if (quantidade<= 0){
            System.out.println("Erro: A quantidade a retirar deve ser maior que zero.");
        } else if (quantidade > this.quantidade){
            System.out.println("Erro: Quantidade insuficiente em estoque. Disponível: " + this.quantidade);
        } else {
            this.quantidade -= quantidade;
            System.out.println("Retiradas " + quantidade + " unidades de " + nome + ".");
        }
    }

    @Override
    public String toString() {
        return "Item: " + nome + " | Quantidade: " + quantidade + " | Preço: R$ " + String.format("%.2f", preco);
    }
}
