package Marcelo.B4.AT02;

public class EntregaNacional extends Entrega {
    double distancia;

    public EntregaNacional(String codigoPedido, double distancia) {
        super(codigoPedido);
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularValorFrete() {
        return distancia * 1.5;
    }
}