package AT05.ex2;

public class Principal {
    public static void main(String[] args) {
        Mercado item1 = new Mercado("Arroz 5kg", 10, 25.50);
        Mercado item2 = new Mercado("Carvão 10kg", 8, 28.70);

        System.out.println("--- Estoque Inicial ---");
        System.out.println(item1);

        System.out.println("\n--- Realizando Operações ---");
        item1.adicionarQuantidade(5);
        item1.retirarQuantidade(3);

        System.out.println("\n--- Estoque Atualizado ---");
        System.out.println(item1);

        System.out.println("--- Estoque Inicial ---");
        System.out.println(item2);

        System.out.println("\n--- Realizando Operações ---");
        item2.adicionarQuantidade(5);
        item2.retirarQuantidade(3);

        System.out.println("\n--- Estoque Atualizado ---");
        System.out.println(item2);
    }
}