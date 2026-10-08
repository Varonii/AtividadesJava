package Marcelo.B4.AT03;

public abstract class Personagem {
    String nome;
    int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void exibirEstatos() {
        System.out.println("Personagem: " + this.nome + "  Nível: " + this.nivel);
    }
}