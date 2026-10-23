package Marcelo.B4.AT11;

public abstract class Veiculo implements Operavel{
    private final String placa;
    private String modelo;
    private double valorBaseDiaria;
    private static int totalVeiculos;
    public static final String nomeLocadora = "Varoniis Locadora";

    public Veiculo(double valorBaseDiaria, String modelo, String placa) {
        if (valorBaseDiaria <= 0) {
            throw new IllegalArgumentException("O valor-base da diária deve ser maior que zero.");
        }
        this.valorBaseDiaria = valorBaseDiaria;
        this.modelo = modelo;
        this.placa = placa;

        totalVeiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        if (valorBaseDiaria <= 0) {
            throw new IllegalArgumentException("O valor-base da diária deve ser maior que zero.");
        }
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public abstract double calcularDiaria();

    public void exibirDados() {
        System.out.println("Locadora: " + nomeLocadora);
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Valor da diária: " + calcularDiaria());
    }

    public double calcularLocacao(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        return dias * calcularDiaria();
    }

}