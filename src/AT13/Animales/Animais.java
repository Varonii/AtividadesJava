package AT13.Animales;

public class Animais {
    private String nome;

    public Animais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNome() {
        System.out.println("Nome: " + nome);
    }

    public void emitirSom() {
        System.out.print("Som do animal: ");
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        emitirSom();
    }
}
