package Marcelo.B4.AT10;

public class EntregaBicicleta extends Entrega implements Rastreavel {
    public EntregaBicicleta(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return getDistanciaKm() * 2.00;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento [" + getCodigo() + "]: Paciente a caminho via Bicicleta.");
    }
}