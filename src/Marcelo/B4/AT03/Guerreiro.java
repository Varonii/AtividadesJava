package Marcelo.B4.AT03;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " Golpe de Espada!");
    }
}