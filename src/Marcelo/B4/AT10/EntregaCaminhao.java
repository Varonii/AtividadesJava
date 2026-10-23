package Marcelo.B4.AT10;

public class EntregaCaminhao extends Entrega implements Rastreavel {
    public EntregaCaminhao(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return (getDistanciaKm() * 5.00) + 30.00;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento [" + getCodigo() + "]: Paciente a caminho via Caminhão.");
    }
}
