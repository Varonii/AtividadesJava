package Marcelo.B4.AT02;

public class EntregaLocal extends Entrega {

    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    public double calcularValorFrete() {
        return 10.00;
    }
}