package Marcelo.B4.AT19;

public class Main {
    public static void main(String[] args) {
        Caixa<String> nome = new Caixa<>();
        Caixa<Integer> quantidade = new Caixa<>();
        Caixa<Double> preco = new Caixa<>();

        nome.guardar("Caderno");
        quantidade.guardar(10);
        preco.guardar(25.50);

        System.out.println("Produto: " + nome.obter());
        System.out.println("Quantidade: " + quantidade.obter());
        System.out.println("Preço: R$ " + preco.obter());
    }
}