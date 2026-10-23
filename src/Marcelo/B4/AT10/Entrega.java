package Marcelo.B4.AT10;

public abstract class Entrega {
    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    // Método abstrato a ser implementado pelas subclasses
    public abstract double calcularFrete();

    // Método concreto para exibição dos dados
    public void exibirDados() {
        System.out.printf("Código: %s | Distância: %.2f km | Frete: R$ %.2f%n",
                codigo, distanciaKm, calcularFrete());
    }
}
