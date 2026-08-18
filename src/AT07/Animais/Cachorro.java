package AT07.Animais;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso, raca);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au Au!");
    }
}
