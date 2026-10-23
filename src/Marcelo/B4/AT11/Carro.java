package Marcelo.B4.AT11;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(double valorBaseDiaria, String modelo, String placa, int quantidadePortas) {
        super(valorBaseDiaria, modelo, placa);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 50.00;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando carro..");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando carro..");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantida Portas: " + quantidadePortas);
    }
}
