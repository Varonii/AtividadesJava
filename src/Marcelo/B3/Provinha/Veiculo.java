package Marcelo.B3.Provinha;

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, int quantidadePortas) {
        super(marca); // Chama o construtor da classe pai (Veiculo)
        this.quantidadePortas = quantidadePortas;
    }

    // POLIMORFISMO DE SOBRESCRITA (Override)
    // A classe filha reescreve a lógica do método definido na classe pai
    @Override
    public void emitirSom() {
        System.out.println(getMarca() + " faz: Vrum Vrum!");
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
