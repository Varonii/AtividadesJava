package Marcelo.B4.AT02;

public abstract class Entrega {
    protected String codigoPedido;

    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public abstract double calcularValorFrete();

    public void exibirResumo() {
        System.out.println("==== Resumo da Entrega ====");
        System.out.println("Codigo Pedido: " + codigoPedido);
        System.out.printf("Valor do Frete: R$ %.2f%n", calcularValorFrete());
        System.out.println("===========================\n");
    }
}