package AT07.Animais;

public class Gato extends Animal {
    private String corPelagem;

    public Gato(String nome, int idade, double peso, String corPelagem) {
        super(nome, idade, peso, corPelagem);
        this.corPelagem = corPelagem;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau!");
    }
}
