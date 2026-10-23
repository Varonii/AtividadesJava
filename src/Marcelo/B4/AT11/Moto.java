package Marcelo.B4.AT11;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(double valorBaseDiaria, String modelo, String placa, int cilindradas) {
        super(valorBaseDiaria, modelo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 20.00;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando moto..");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando moto..");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
