package AT01;

public class ex1 {
    public static void main(String[] args) {
        mostraProduto("KitKat", 4, 100);
    }

    public static void mostraProduto(String nome, double preco, int quant){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quant);
    }
}
